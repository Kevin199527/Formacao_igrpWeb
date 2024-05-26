package nosi.webapps.mercado.pages.ver_reporter;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;

public class Ver_reporterView extends View {


	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_abrir_reporter;

	public Ver_reporterView(){

		this.setPageTitle("Ver Reporter");
			

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_abrir_reporter = new IGRPButton("Abrir Reporter","mercado","Ver_reporter","abrir_reporter","_newtab","success|fa-file-text","","");
		btn_abrir_reporter.propertie.add("type","specific").add("rel","abrir_reporter").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		

		toolsbar_1.addButton(btn_abrir_reporter);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
			

		}
}
