package nosi.webapps.sistema_de_clinica.pages.consultas_marcadas;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Consultas_marcadasController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Consultas_marcadas();
		model.load();
		var view = new Consultas_marcadasView();
		view.id_medico.setParam(true);

		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Doloremque stract lorem perspi' as data_consulta_,'Stract dolor elit ut anim' as nome_paciente,'Dolor consectetur voluptatem a' as especialidade,'Sit ut elit stract lorem' as hora_inicio,'Iste sed totam anim sit' as hora_fim_,'hidden-3c6c_d1d0' as id_medico "));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/

		Integer id = Core.getParamInt("p_id_medico");
		Core.setMessageInfo(""+id);
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionPesquisar() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Consultas_marcadas();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_medico",Core.getParam("p_id_medico"));
		  return this.forward("sistema_de_clinica","Listar_medico","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (pesquisar)  *//* End-Code-Block  */
		/*----#start-code(pesquisar)----*/
		
		return this.forward("sistema_de_clinica","Listar_medico","index",this.queryString());
		/*----#end-code----*/
			
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
