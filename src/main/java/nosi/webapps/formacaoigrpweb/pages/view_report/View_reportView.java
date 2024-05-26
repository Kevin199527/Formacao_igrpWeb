package nosi.webapps.formacaoigrpweb.pages.view_report;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;

public class View_reportView extends View {


	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_abrir_report;

	public View_reportView(){

		this.setPageTitle("View Report");
			

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_abrir_report = new IGRPButton("Abrir Report","formacaoigrpweb","View_report","abrir_report","_newtab","success|fa-file-pdf-o","","");
		btn_abrir_report.propertie.add("type","specific").add("rel","abrir_report").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		

		toolsbar_1.addButton(btn_abrir_report);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
			

		}
}
