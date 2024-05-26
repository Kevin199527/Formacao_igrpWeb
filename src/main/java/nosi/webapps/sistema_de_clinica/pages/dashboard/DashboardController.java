package nosi.webapps.sistema_de_clinica.pages.dashboard;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class DashboardController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Dashboard();
		model.load();
		model.setStatbox_1_title("Total de Paciente Atendido");
		model.setStatbox_1_val("805");
		model.setStatbox_1_txt("➕ Ver Mais...");
		model.setStatbox_1_url("http://www.example.com");
		model.setStatbox_1_bg("cp-cyan");
		model.setStatbox_1_icn("fa-check");
		model.setStatbox_2_title("Total de Medico");
		model.setStatbox_2_val("473");
		model.setStatbox_2_txt("➕ Ver Mais...");
		model.setStatbox_2_url("http://www.example.com");
		model.setStatbox_2_bg("cp-cyan");
		model.setStatbox_2_icn("fa-check");
		var view = new DashboardView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.grafico_de_barra.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		view.grafico_de_pizza.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		view.grafico_de_linha.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
                                      +" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
                                      +" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		view.especialidade.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		model.setStatbox_1_url(Core.getIGRPLink("your app","your page","your action"));
		model.setStatbox_2_url(Core.getIGRPLink("your app","your page","your action"));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/

		model.setStatbox_1_val(Core.query(Core.defaultConnection(), "SELECT COUNT(1) as statbox_1_val FROM public.\"CM_T_PACIENTE\"").getSingleResult().get(0).toString());

		view.grafico_de_barra.loadQuery(Core.query(null,"SELECT 'Teste01' as EixoX, '2024' as EixoY, 15 as EixoZ"
				+" UNION SELECT 'Teste02' as EixoX, '2025' as EixoY, 10 as EixoZ"
				+" UNION SELECT 'Teste03' as EixoX, '2026' as EixoY, 23 as EixoZ"
				+" UNION SELECT 'Teste04' as EixoX, '2027' as EixoY, 40 as EixoZ"));

		view.grafico_de_linha.loadQuery(Core.query(null,"SELECT '2000' as EixoX, 'Achada Grande Frente' as EixoY, 15 as EixoZ"
				+" UNION SELECT '2300' as EixoX, 'Jamaica' as EixoY, 10 as EixoZ"
				+" UNION SELECT '2080' as EixoX, 'Lem-Ferreira' as EixoY, 23 as EixoZ"
				+" UNION SELECT '2005' as EixoX, 'Achada Mato' as EixoY, 40 as EixoZ"));

		view.grafico_de_pizza.loadQuery(Core.query(null,"SELECT 'X1' as EixoX, 'Y1' as EixoY, 15 as EixoZ"
				+" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 10 as EixoZ"
				+" UNION SELECT 'X2' as EixoX, 'Y2' as EixoY, 23 as EixoZ"
				+" UNION SELECT 'X3' as EixoX, 'Y3' as EixoY, 40 as EixoZ"));
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionPesquisar() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Dashboard();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_clinica","Listar_medico","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (pesquisar)  *//* End-Code-Block  */
		/*----#start-code(pesquisar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sistema_de_clinica","Listar_medico","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
