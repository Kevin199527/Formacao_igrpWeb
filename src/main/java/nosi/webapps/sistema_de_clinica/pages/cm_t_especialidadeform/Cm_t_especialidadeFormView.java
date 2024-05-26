package nosi.webapps.sistema_de_clinica.pages.cm_t_especialidadeform;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Cm_t_especialidadeFormView extends View {

	public Field id;
	public Field nome;
	public Field estado;
	public IGRPForm form_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_list;
	public IGRPButton btn_save;

	public Cm_t_especialidadeFormView(){

		this.setPageTitle("Registar cm_t_especialidade");
			
		form_1 = new IGRPForm("form_1","Registar Especialidade");

		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("java-type","Integer").add("maxlength","250").add("tooltip","false").add("disable_copy_paste","false").add("tag","id");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","200").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","ESTADO « sistema_de_clinica").add("maxlength","3").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_list = new IGRPButton("List","sistema_de_clinica","Cm_t_especialidadeForm","list","_self","default|fa-list","","");
		btn_list.propertie.add("type","specific").add("rel","list").add("refresh_components","");

		btn_save = new IGRPButton("Gravar","sistema_de_clinica","Cm_t_especialidadeForm","save","submit","primary|fa-save","","");
		btn_save.propertie.add("type","specific").add("rel","save").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		

		form_1.addField(id);
		form_1.addField(nome);
		form_1.addField(estado);

		toolsbar_1.addButton(btn_list);
		toolsbar_1.addButton(btn_save);
		this.addToPage(form_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		id.setValue(model);
		nome.setValue(model);
		estado.setValue(model);	

		}
}
