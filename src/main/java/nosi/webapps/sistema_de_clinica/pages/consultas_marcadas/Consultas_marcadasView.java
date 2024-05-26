package nosi.webapps.sistema_de_clinica.pages.consultas_marcadas;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Consultas_marcadasView extends View {

	public Field data_inicio;
	public Field data_fim;
	public Field data_consulta_;
	public Field nome_paciente;
	public Field especialidade;
	public Field hora_inicio;
	public Field hora_fim_;
	public Field id_medico;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPButton btn_pesquisar;

	public Consultas_marcadasView(){

		this.setPageTitle("Consultas Agendadas");
			
		form_1 = new IGRPForm("form_1","");

		table_1 = new IGRPTable("table_1","Consulta Agendada");

		data_inicio = new DateField(model,"data_inicio");
		data_inicio.setLabel(gt("Data Inicio"));
		data_inicio.propertie().add("name","p_data_inicio").add("type","date").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false").add("class","primary");
		
		data_fim = new DateField(model,"data_fim");
		data_fim.setLabel(gt("Data Fim"));
		data_fim.propertie().add("name","p_data_fim").add("type","date").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false").add("class","primary");
		
		data_consulta_ = new TextField(model,"data_consulta_");
		data_consulta_.setLabel(gt("Data Consulta "));
		data_consulta_.propertie().add("name","p_data_consulta_").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		nome_paciente = new TextField(model,"nome_paciente");
		nome_paciente.setLabel(gt("Nome Paciente"));
		nome_paciente.propertie().add("name","p_nome_paciente").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		especialidade = new TextField(model,"especialidade");
		especialidade.setLabel(gt("Especialidade"));
		especialidade.propertie().add("name","p_especialidade").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		hora_inicio = new TextField(model,"hora_inicio");
		hora_inicio.setLabel(gt("Hora Inicio"));
		hora_inicio.propertie().add("name","p_hora_inicio").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		hora_fim_ = new TextField(model,"hora_fim_");
		hora_fim_.setLabel(gt("Hora Fim "));
		hora_fim_.propertie().add("name","p_hora_fim_").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		id_medico = new HiddenField(model,"id_medico");
		id_medico.setLabel(gt(""));
		id_medico.propertie().add("name","p_id_medico").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","").add("tag","id_medico");
		


		btn_pesquisar = new IGRPButton("Pesquisar","sistema_de_clinica","Consultas_marcadas","pesquisar","_blank","warning|fa-search","","");
		btn_pesquisar.propertie.add("id","button_2ba1_844f").add("type","form").add("class","warning").add("rel","pesquisar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(data_inicio);
		form_1.addField(data_fim);

		table_1.addField(data_consulta_);
		table_1.addField(nome_paciente);
		table_1.addField(especialidade);
		table_1.addField(hora_inicio);
		table_1.addField(hora_fim_);
		table_1.addField(id_medico);

		form_1.addButton(btn_pesquisar);
		this.addToPage(form_1);
		this.addToPage(table_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		data_inicio.setValue(model);
		data_fim.setValue(model);
		data_consulta_.setValue(model);
		nome_paciente.setValue(model);
		especialidade.setValue(model);
		hora_inicio.setValue(model);
		hora_fim_.setValue(model);
		id_medico.setValue(model);	

		table_1.loadModel(((Consultas_marcadas) model).getTable_1());
		}
}
