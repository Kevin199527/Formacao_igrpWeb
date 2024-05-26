package nosi.webapps.sistema_de_clinica.pages.pesquisa_geografia;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.sistema_de_clinica.dao.Geografia;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
/*----#end-code----*/
		
public class Pesquisa_geografiaController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Pesquisa_geografia();
		model.load();
		var view = new Pesquisa_geografiaView();
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		String jsonLookup = Core.getParam("jsonLookup");

		Properties params = (Properties) Core.fromJson(jsonLookup, Properties.class);
		if(params != null) {
			this.p_nivel = Core.toInt(params.getProperty("p_nivel"));
			this.p_id_pai = Core.toInt(params.getProperty("p_id_pai"));
		}
		//Utils.LOGGER.info("this.p_nivel ..... "+ this.p_nivel);

		this.fillGeografia(model, view);
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	/*
	public Response actionRemote_treemenu_1() throws IOException, IllegalArgumentException, IllegalAccessException{
		String p_id = Core.getParam("p_id");
		String p_active = Core.getParam("p_active");
		var model = new Pesquisa_geografia();
		
		//Your code here
		var response = new Response();
		response.setContentType(Response.FORMAT_XML);
		response.setContent("your message");
		return response;
		
	}
	*//* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/
	public void fillGeografia(Pesquisa_geografia model, Pesquisa_geografiaView view) {

		String id = Core.getParam("p_fwl_id");

		id = Core.isNotNull(id) ? id : "1238";

		Geografia _query  = new Geografia().find()
				.andWhere("geogrId", "=", id)
				.andWhere("flgSituacao", "=", "A");

		if(this.p_nivel > 0) {
			_query= _query.andWhere("nivelDetalhe", "<=", ""+this.p_nivel);
		}

		List<Geografia> _geogList= _query.orderByAsc("nome").all();
		//.andWhereNotNull("shortNome").all();
		if (_geogList != null && !_geogList.isEmpty()) {
			// LISTA TREEMENU
			List<Pesquisa_geografia.Treemenu_1> tree = new ArrayList<>();

			for (Geografia n : _geogList) {
				Pesquisa_geografia.Treemenu_1 row = new Pesquisa_geografia.Treemenu_1();
				row.setTreemenu_1_child("1");
				row.setTreemenu_1_tmid(n.getId()+"");
				row.setTreemenu_1_link_desc(n.getNome());
				//row.setTreemenu_1_link("");

				//view.treemenu_1_link.setVisible(false);

				tree.add(row);
			}
			model.setTreemenu_1(tree);
		}

	}


	public Response actionRemote_treemenu_1() throws IOException, IllegalArgumentException, IllegalAccessException{
		BigDecimal p_id = Core.getParamBigDecimal("p_id");
		//this.p_nivel = Core.getParamInt("p_nivel");

		String jsonLookup = Core.getParam("jsonLookup");

		//Utils.LOGGER.info("p_id remote "+ p_id);

		String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
				+ " <treemenu_1> " + "<table>" + "<value>";

		if (Core.isNotNull(jsonLookup)) {
			try {
				jsonLookup = URLDecoder.decode(jsonLookup, "UTF-8");
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}

			Properties params = (Properties) Core.fromJson(jsonLookup, Properties.class);

			this.p_nivel = Core.toInt(params.getProperty("p_nivel"));


			params.entrySet().forEach(p1 -> {
				if (p1.getValue().equals("treemenu_1_tmid"))
					id_geo = p1.getKey().toString();
				else if (p1.getValue().equals("treemenu_1_link_desc"))
					des_geo = p1.getKey().toString();
			});
		}


		if (Core.isNotNull(p_id)) {

			Geografia _query = new Geografia().find()
					.andWhere("geogrId", "=", p_id)
					.andWhere("flgSituacao", "=", "A");

			if(this.p_nivel > 0) {
				_query= _query.andWhere("nivelDetalhe", "<=", ""+this.p_nivel);
			}

			List<Geografia> _geografias= _query.orderByAsc("nome").all();

			if (_geografias != null && !_geografias.isEmpty()) {
				for (Geografia pe : _geografias) {
					xml +=this.getXml(pe.getId()+"",des_geo, id_geo, p_id+"", pe.getNome(), "1", Core.toInt(pe.getNivelDetalhe()));
				}
			}
		}
		xml += "</value>" + "</table>" + "</treemenu_1>";

		return this.renderView(xml);

	}

	public  String getXml(String id, String des_geo, String id_geo, String id_pai, String desc_menu, String child, Integer nivel) {
		String xml = "<row>" +
				"<context-menu><param>"+ id_geo +"="+ id + "</param>" +
				"<param>p_nivel=" + nivel + "</param>" +
				"<param>"+des_geo+"="+ desc_menu + "</param>" +
				"<param>ctx_hidden=</param></context-menu>" +
				"<treemenu_1_link_desc>"+ desc_menu +"</treemenu_1_link_desc>" +
				"<treemenu_1_tmid>" + id + "</treemenu_1_tmid>"
				+ "<treemenu_1_parent>" + id_pai + "</treemenu_1_parent>" +
				"<treemenu_1_icon/>" +
				/*(child.equals("1") ? "" :*/ "<treemenu_1_link></treemenu_1_link>"/* )*/ +
				"<treemenu_1_child>" + child + "</treemenu_1_child>" +
				"<treemenu_1_active/>" + "</row>";
		return xml;
	}

	private int p_nivel ;
	private int p_id_pai;

	String des_geo = "p_localizacao";
	String id_geo = "p_id_localizacao";


/*----#end-code----*/
}
