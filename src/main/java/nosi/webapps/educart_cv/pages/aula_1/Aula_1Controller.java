package nosi.webapps.educart_cv.pages.aula_1;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Aula_1Controller extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Aula_1();
		model.load();
		var view = new Aula_1View();
		view.form_1_select_1.loadDomain("ESTADO","educart_cv","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'Anim dolor aperiam rem amet' as table_1_text_1 "));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionAbrir_fatura() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Aula_1();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("educart_cv","Aula_1","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (abrir_fatura)  *//* End-Code-Block  */
		/*----#start-code(abrir_fatura)----*/
		 return Core.getLinkReportPDF("recibo", new nosi.core.webapp.Report());
		
		/*----#end-code----*/
			
	}
	
	public Response actionForm_1_button_1() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Aula_1();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("educart_cv","Aula_1","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (form_1_button_1)  *//* End-Code-Block  */
		/*----#start-code(form_1_button_1)----*/
		

		/*----#end-code----*/
		return this.redirect("educart_cv","Aula_1","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
