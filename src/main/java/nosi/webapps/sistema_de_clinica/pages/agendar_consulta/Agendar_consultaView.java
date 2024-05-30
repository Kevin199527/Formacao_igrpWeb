package nosi.webapps.sistema_de_clinica.pages.agendar_consulta;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import nosi.core.webapp.Core;

public class Agendar_consultaView extends View {

	public Field especialidade_medica;
	public Field medico_com_especialidade;
	public Field data_de_agendamento;
	public Field hora_inicio_1;
	public Field hora_fim;
	public Field selecionar;
	public Field selecionar_check;
	public Field id_medico;
	public IGRPForm form_1;
	public IGRPTable lista_de_consulta;


	public Agendar_consultaView(){

		this.setPageTitle("Agendar Consulta");
			
		form_1 = new IGRPForm("form_1"," Agendar Consulta");

		lista_de_consulta = new IGRPTable("lista_de_consulta","Lista de Consulta");

		especialidade_medica = new ListField(model,"especialidade_medica");
		especialidade_medica.setLabel(gt("Especialidade Medica"));
		especialidade_medica.propertie().add("remote-FindMedico",Core.getIGRPLink("sistema_de_clinica","Agendar_consulta","FindMedico")).add("name","p_especialidade_medica").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		medico_com_especialidade = new ListField(model,"medico_com_especialidade");
		medico_com_especialidade.setLabel(gt("Medico Com Especialidade"));
		medico_com_especialidade.propertie().add("remote-FindList",Core.getIGRPLink("sistema_de_clinica","Agendar_consulta","FindList")).add("name","p_medico_com_especialidade").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		data_de_agendamento = new PlainTextField(model,"data_de_agendamento");
		data_de_agendamento.setLabel(gt("Data de Agendamento"));
		data_de_agendamento.propertie().add("name","p_data_de_agendamento").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		hora_inicio_1 = new PlainTextField(model,"hora_inicio_1");
		hora_inicio_1.setLabel(gt("Hora inicio"));
		hora_inicio_1.propertie().add("name","p_hora_inicio_1").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		hora_fim = new PlainTextField(model,"hora_fim");
		hora_fim.setLabel(gt("Hora Fim"));
		hora_fim.propertie().add("name","p_hora_fim").add("type","plaintext").add("disable_output_escaping","false").add("html_class","").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		selecionar = new CheckBoxField(model,"selecionar");
		selecionar.setLabel(gt("Selecionar"));
		selecionar.propertie().add("name","p_selecionar").add("type","checkbox").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","int").add("switch","true").add("check","true").add("desc","true");
		
		selecionar_check = new CheckBoxField(model,"selecionar_check");
		selecionar_check.propertie().add("name","p_selecionar").add("type","checkbox").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","int").add("switch","true").add("check","true").add("desc","true");
		
		id_medico = new HiddenField(model,"id_medico");
		id_medico.setLabel(gt(""));
		id_medico.propertie().add("name","p_id_medico").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_medico");
		


		
	}
		
	@Override
	public void render(){
		
		form_1.addField(especialidade_medica);
		form_1.addField(medico_com_especialidade);

		lista_de_consulta.addField(data_de_agendamento);
		lista_de_consulta.addField(hora_inicio_1);
		lista_de_consulta.addField(hora_fim);
		lista_de_consulta.addField(selecionar);
		lista_de_consulta.addField(selecionar_check);
		lista_de_consulta.addField(id_medico);

		this.addToPage(form_1);
		this.addToPage(lista_de_consulta);
	}
		
	@Override
	public void setModel(Model model) {
		
		especialidade_medica.setValue(model);
		medico_com_especialidade.setValue(model);
		data_de_agendamento.setValue(model);
		hora_inicio_1.setValue(model);
		hora_fim.setValue(model);
		selecionar.setValue(model);
		id_medico.setValue(model);	

		lista_de_consulta.loadModel(((Agendar_consulta) model).getLista_de_consulta());
		}
}
