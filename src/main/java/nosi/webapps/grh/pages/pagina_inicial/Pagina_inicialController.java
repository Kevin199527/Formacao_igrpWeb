package nosi.webapps.grh.pages.pagina_inicial;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Pagina_inicialController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Pagina_inicial();
		model.load();
		model.setView_1_img("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg");
		var view = new Pagina_inicialView();
		view.separatorlist_1_select_1.loadDomain("ESTADO","grh","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadSeparatorlist_1(Core.query(null,"SELECT 'Mollit elit mollit lorem stract' as separatorlist_1_text_1,'2' as separatorlist_1_select_1 "));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Pagina_inicial();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("grh","Pagina_inicial","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  *//* End-Code-Block  */
		/*----#start-code(editar)----*/
		
		
		/*----#end-code----*/
		return this.redirect("grh","Pagina_inicial","index", this.queryString());	
	}
	
	public Response actionExcluir() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Pagina_inicial();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("grh","Pagina_inicial","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (excluir)  *//* End-Code-Block  */
		/*----#start-code(excluir)----*/
		
		
		/*----#end-code----*/
		return this.redirect("grh","Pagina_inicial","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
