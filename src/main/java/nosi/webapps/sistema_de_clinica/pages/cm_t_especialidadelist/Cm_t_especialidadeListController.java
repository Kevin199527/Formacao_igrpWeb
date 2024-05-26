package nosi.webapps.sistema_de_clinica.pages.cm_t_especialidadelist;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Cm_t_especialidadeListController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Cm_t_especialidadeList();
		model.load();
		var view = new Cm_t_especialidadeListView();
		view.id.setParam(true);
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'hidden-4232_8c7c' as id,'Doloremque ut dolor labore laudantium' as nome,'Nat' as estado "));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		nosi.core.webapp.databse.helpers.QueryInterface query = Core.query("sistema_de_clinica_postgresql_1","SELECT id as id,nome as nome,estado as estado FROM public.cm_t_especialidade order by nome asc");
		model.loadTable_1(query);
		
		view.id.setParam(true);
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionNew() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Cm_t_especialidadeList();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("sistema_de_clinica","Cm_t_especialidadeForm","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (new)  *//* End-Code-Block  */
		/*----#start-code(new)----*/
		
		/*----#end-code----*/
		return this.redirect("sistema_de_clinica","Cm_t_especialidadeForm","index", this.queryString());	
	}
	
	public Response actionUpdate() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Cm_t_especialidadeList();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("sistema_de_clinica","Cm_t_especialidadeForm","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (update)  *//* End-Code-Block  */
		/*----#start-code(update)----*/
		this.addQueryString("target","_blank");
		this.addQueryString("isEdit","true");
		this.addQueryString("p_id",Core.getParam("p_id"));
		/*----#end-code----*/
		return this.redirect("sistema_de_clinica","Cm_t_especialidadeForm","index", this.queryString());	
	}
	
	public Response actionDelete() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Cm_t_especialidadeList();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id",Core.getParam("p_id"));
		  return this.forward("sistema_de_clinica","Cm_t_especialidadeList","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (delete)  *//* End-Code-Block  */
		/*----#start-code(delete)----*/
		nosi.core.webapp.databse.helpers.ResultSet r = Core.delete("sistema_de_clinica_postgresql_1","public","cm_t_especialidade").where("id=:id")
				.addInt("id",Core.getParamInt("p_id"))
				.execute();
		if(!r.hasError())
			Core.setMessageSuccess();
		else
			Core.setMessageError();
		/*----#end-code----*/
		return this.redirect("sistema_de_clinica","Cm_t_especialidadeList","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
