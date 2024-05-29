package nosi.webapps.sistema_de_clinica.pages.agendar_consulta;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import nosi.core.webapp.Core;

public class Agendar_consultaView extends View {

	public Field data;
	public Field especialidade_medica;
	public Field medico_com_especialidade;
	public Field medico;
	public Field especialidade;
	public Field hora_inicio;
	public Field hora_fim_;
	public Field selecionar;
	public Field selecionar_check;
	public IGRPForm form_1;
	public IGRPFormList formlist_1;


	public Agendar_consultaView(){

		this.setPageTitle("Agendar Consulta");
			
		form_1 = new IGRPForm("form_1"," Agendar Consulta");

		formlist_1 = new IGRPFormList("formlist_1","");

		data = new DateField(model,"data");
		data.setLabel(gt("Data"));
		data.propertie().add("name","p_data").add("type","date").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false").add("class","primary");
		
		especialidade_medica = new ListField(model,"especialidade_medica");
		especialidade_medica.setLabel(gt("Especialidade Medica"));
		especialidade_medica.propertie().add("remote-FindMedico",Core.getIGRPLink("sistema_de_clinica","Agendar_consulta","FindMedico")).add("name","p_especialidade_medica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		medico_com_especialidade = new ListField(model,"medico_com_especialidade");
		medico_com_especialidade.setLabel(gt("Medico Com Especialidade"));
		medico_com_especialidade.propertie().add("name","p_medico_com_especialidade").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		medico = new PlainTextField(model,"medico");
		medico.setLabel(gt("Medico"));
		medico.propertie().add("name","p_medico").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","250").add("desc","true");
		
		especialidade = new PlainTextField(model,"especialidade");
		especialidade.setLabel(gt("Especialidade"));
		especialidade.propertie().add("name","p_especialidade").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","250").add("desc","true");
		
		hora_inicio = new PlainTextField(model,"hora_inicio");
		hora_inicio.setLabel(gt("Hora inicio"));
		hora_inicio.propertie().add("name","p_hora_inicio").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","250").add("desc","true");
		
		hora_fim_ = new PlainTextField(model,"hora_fim_");
		hora_fim_.setLabel(gt("Hora Fim "));
		hora_fim_.propertie().add("name","p_hora_fim_").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","250").add("desc","true");
		
		selecionar = new CheckBoxField(model,"selecionar");
		selecionar.setLabel(gt("Selecionar"));
		selecionar.propertie().add("name","p_selecionar").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("check","true").add("desc","true");
		
		selecionar_check = new CheckBoxField(model,"selecionar_check");
		selecionar_check.propertie().add("name","p_selecionar").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("check","true").add("desc","true");
		


		
	}
		
	@Override
	public void render(){
		
		form_1.addField(data);
		form_1.addField(especialidade_medica);
		form_1.addField(medico_com_especialidade);

		formlist_1.addField(medico);
		formlist_1.addField(especialidade);
		formlist_1.addField(hora_inicio);
		formlist_1.addField(hora_fim_);
		formlist_1.addField(selecionar);
		formlist_1.addField(selecionar_check);

		this.addToPage(form_1);
		this.addToPage(formlist_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		data.setValue(model);
		especialidade_medica.setValue(model);
		medico_com_especialidade.setValue(model);
		medico.setValue(model);
		especialidade.setValue(model);
		hora_inicio.setValue(model);
		hora_fim_.setValue(model);
		selecionar.setValue(model);	

		formlist_1.loadModel(((Agendar_consulta) model).getFormlist_1());
		}
}
