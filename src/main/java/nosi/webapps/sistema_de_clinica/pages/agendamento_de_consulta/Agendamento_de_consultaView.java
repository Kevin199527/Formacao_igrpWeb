package nosi.webapps.sistema_de_clinica.pages.agendamento_de_consulta;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Agendamento_de_consultaView extends View {

	public Field data;
	public Field especialidade;
	public Field consultorio;
	public Field hora_inicio_;
	public Field hora_fim;
	public Field consultorio_id;
	public IGRPSeparatorList horario_de_atendimento;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_gravar;

	public Agendamento_de_consultaView(){

		this.setPageTitle("Horario de Atendimento");
			
		horario_de_atendimento = new IGRPSeparatorList("horario_de_atendimento","Horários de Atendimento");

		data = new DateField(model,"data");
		data.setLabel(gt("Data"));
		data.propertie().add("name","p_data").add("type","date").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("class","primary").add("desc","true");
		
		especialidade = new ListField(model,"especialidade");
		especialidade.setLabel(gt("Especialidade"));
		especialidade.propertie().add("name","p_especialidade").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("desc","true");
		
		consultorio = new LookupField(model,"consultorio");
		consultorio.setLabel(gt("Consultório"));
		consultorio.setLookup("sistema_de_clinica","Pesquisa_geografia","index");
		consultorio.addParam("target","_blank");
		consultorio.addLookupParam("p_consultorio","treemenu_1_link_desc");
		consultorio.addLookupParam("p_consultorio_id","treemenu_1_tmid");
		consultorio.propertie().add("name","p_consultorio").add("type","lookup").add("field_param","").add("lookup_eraser","true").add("lookup_type","LOOKUP").add("class","primary").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		hora_inicio_ = new TextField(model,"hora_inicio_");
		hora_inicio_.setLabel(gt("Hora Inicio "));
		hora_inicio_.propertie().add("name","p_hora_inicio_").add("type","time").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		hora_fim = new TextField(model,"hora_fim");
		hora_fim.setLabel(gt("Hora Fim"));
		hora_fim.propertie().add("name","p_hora_fim").add("type","time").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		consultorio_id = new HiddenField(model,"consultorio_id");
		consultorio_id.setLabel(gt(""));
		consultorio_id.propertie().add("name","p_consultorio_id").add("type","hidden").add("maxlength","250").add("java-type","String").add("tag","consultorio_id").add("desc","true");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_gravar = new IGRPButton("Gravar","sistema_de_clinica","Agendamento_de_consulta","gravar","submit","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		horario_de_atendimento.addField(data);
		horario_de_atendimento.addField(especialidade);
		horario_de_atendimento.addField(consultorio);
		horario_de_atendimento.addField(hora_inicio_);
		horario_de_atendimento.addField(hora_fim);
		horario_de_atendimento.addField(consultorio_id);


		toolsbar_1.addButton(btn_gravar);
		this.addToPage(horario_de_atendimento);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		data.setValue(model);
		especialidade.setValue(model);
		consultorio.setValue(model);
		hora_inicio_.setValue(model);
		hora_fim.setValue(model);
		consultorio_id.setValue(model);	

		horario_de_atendimento.loadModel(((Agendamento_de_consulta) model).getHorario_de_atendimento());
		}
}
