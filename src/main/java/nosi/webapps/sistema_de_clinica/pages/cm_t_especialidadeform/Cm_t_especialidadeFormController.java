package nosi.webapps.sistema_de_clinica.pages.cm_t_especialidadeform;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class Cm_t_especialidadeFormController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Cm_t_especialidadeForm();
		model.load();
		var view = new Cm_t_especialidadeFormView();
		view.estado.loadDomain("ESTADO","sistema_de_clinica","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		String isEdit = Core.getParam("isEdit");
 			
		if(Core.isNotNull(isEdit)) {
		nosi.core.webapp.databse.helpers.QueryInterface query = Core.query("sistema_de_clinica_postgresql_1","SELECT id as id,nome as nome,estado as estado FROM public.cm_t_especialidade")
				.where("id=:id")
				.addInt("id",model.getId());
		model.load(query);
		view.btn_save.setLink("save&isEdit=true");
		}
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionList() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Cm_t_especialidadeForm();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_clinica","Cm_t_especialidadeList","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (list)  *//* End-Code-Block  */
		/*----#start-code(list)----*/
		
		/*----#end-code----*/
		return this.redirect("sistema_de_clinica","Cm_t_especialidadeList","index", this.queryString());	
	}
	
	public Response actionSave() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Cm_t_especialidadeForm();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_clinica","Cm_t_especialidadeForm","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (save)  *//* End-Code-Block  */
		/*----#start-code(save)----*/
		nosi.core.webapp.databse.helpers.ResultSet r = null;
		
		String isEdit = Core.getParam("isEdit");;
		 	
		if(Core.isNull(isEdit)){
			r = Core.insert("sistema_de_clinica_postgresql_1","public","cm_t_especialidade")		
				.addString("nome",model.getNome())
				.addString("estado",model.getEstado())
				.execute();
		}else{
			r = Core.update("sistema_de_clinica_postgresql_1","public","cm_t_especialidade")		
				.addString("nome",model.getNome())
				.addString("estado",model.getEstado())
				.where("id=:id")
				.addInt("id",model.getId())
				.execute();
		}
		if(!r.hasError()){
			Core.setMessageSuccess();
		 }else{
			Core.setMessageError();
			 return this.forward("sistema_de_clinica","Cm_t_especialidadeForm","index");
		}
		/*----#end-code----*/
		return this.redirect("sistema_de_clinica","Cm_t_especialidadeForm","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
