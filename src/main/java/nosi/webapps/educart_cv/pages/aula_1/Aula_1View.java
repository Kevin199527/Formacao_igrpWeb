package nosi.webapps.educart_cv.pages.aula_1;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Aula_1View extends View {

	public Field form_1_date_1;
	public Field form_1_select_1;
	public Field table_1_text_1;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_abrir_fatura;
	public IGRPButton btn_form_1_button_1;

	public Aula_1View(){

		this.setPageTitle("Aula_1");
			
		form_1 = new IGRPForm("form_1","");

		table_1 = new IGRPTable("table_1","");

		form_1_date_1 = new DateField(model,"form_1_date_1");
		form_1_date_1.setLabel(gt("Date"));
		form_1_date_1.propertie().add("name","p_form_1_date_1").add("type","date").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false").add("class","primary");
		
		form_1_select_1 = new ListField(model,"form_1_select_1");
		form_1_select_1.setLabel(gt("Select"));
		form_1_select_1.propertie().add("name","p_form_1_select_1").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","ESTADO « educart_cv").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		table_1_text_1 = new TextField(model,"table_1_text_1");
		table_1_text_1.setLabel(gt("Text"));
		table_1_text_1.propertie().add("name","p_table_1_text_1").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_abrir_fatura = new IGRPButton("Abrir Fatura","educart_cv","Aula_1","abrir_fatura","_blank","success|fa-file-pdf-o","","");
		btn_abrir_fatura.propertie.add("type","specific").add("rel","abrir_fatura").add("refresh_components","");

		btn_form_1_button_1 = new IGRPButton("Button","educart_cv","Aula_1","form_1_button_1","_blank","primary|fa-angle-right","","");
		btn_form_1_button_1.propertie.add("id","button_79e0_f116").add("type","form").add("flg_transaction","true").add("class","primary").add("rel","form_1_button_1").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(form_1_date_1);
		form_1.addField(form_1_select_1);

		table_1.addField(table_1_text_1);


		toolsbar_1.addButton(btn_abrir_fatura);
		form_1.addButton(btn_form_1_button_1);
		this.addToPage(form_1);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		form_1_date_1.setValue(model);
		form_1_select_1.setValue(model);
		table_1_text_1.setValue(model);	

		table_1.loadModel(((Aula_1) model).getTable_1());
		}
}
