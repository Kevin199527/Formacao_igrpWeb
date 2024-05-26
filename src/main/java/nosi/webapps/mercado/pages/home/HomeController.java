package nosi.webapps.mercado.pages.home;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/


/*----#end-code----*/
		
public class HomeController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Home();
		model.load();
		var view = new HomeView();
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/

		model.setNome("Kevin Junior Lopes B Sousa");
		model.setData_nascimento("31/07/1995");
		model.setN_documento(46267457);
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
