package nosi.webapps.sistema_de_clinica.pages.identificacao_do_paciente;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Identificacao_do_pacienteController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Identificacao_do_paciente();
		model.load();
		var view = new Identificacao_do_pacienteView();
		view.tipo_documento_.loadDomain("TP_DOCUMENTO","sistema_de_clinica","-- Selecionar --");
		view.primeira_consulta.loadDomainByApp("SIM_NAO","sistema_de_clinica");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
