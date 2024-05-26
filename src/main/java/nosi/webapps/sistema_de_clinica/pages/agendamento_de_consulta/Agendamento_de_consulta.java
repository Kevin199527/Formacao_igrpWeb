package nosi.webapps.sistema_de_clinica.pages.agendamento_de_consulta;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import nosi.core.validator.constraints.*;

public class Agendamento_de_consulta extends Model{		
	
	@SeparatorList(name = Horario_de_atendimento.class)
	@Valid
	private List<Horario_de_atendimento> horario_de_atendimento = new ArrayList<>();	
	public void setHorario_de_atendimento(List<Horario_de_atendimento> horario_de_atendimento){
		this.horario_de_atendimento = horario_de_atendimento;
	}
	public List<Horario_de_atendimento> getHorario_de_atendimento(){
		return this.horario_de_atendimento;
	}
	@RParam(rParamName = "p_horario_de_atendimento_id")
	private String[] p_horario_de_atendimento_id;
	@RParam(rParamName = "p_horario_de_atendimento_del")
	private String[] p_horario_de_atendimento_del;
	@RParam(rParamName = "p_horario_de_atendimento_edit")
	private String[] p_horario_de_atendimento_edit;
	
	public void setP_horario_de_atendimento_id(String[] p_horario_de_atendimento_id){
		this.p_horario_de_atendimento_id = p_horario_de_atendimento_id;
	}
	public String[] getP_horario_de_atendimento_id(){
		return this.p_horario_de_atendimento_id;
	}
	
	public void setP_horario_de_atendimento_del(String[] p_horario_de_atendimento_del){
		this.p_horario_de_atendimento_del = p_horario_de_atendimento_del;
	}
	public String[] getP_horario_de_atendimento_del(){
		return this.p_horario_de_atendimento_del;
	}
	
	public void setP_horario_de_atendimento_edit(String[] p_horario_de_atendimento_edit){
		this.p_horario_de_atendimento_edit = p_horario_de_atendimento_edit;
	}
	public String[] getP_horario_de_atendimento_edit(){
		return this.p_horario_de_atendimento_edit;
	}


	public static class Horario_de_atendimento{
		private Pair horario_de_atendimento_id;
		@PairNotNull()
	private Pair data;
	private Pair especialidade;
			@PairNotNull()
	private Pair consultorio;
	private Pair hora_inicio_;
	private Pair hora_fim;
			@PairNotNull()
	private Pair consultorio_id;
		public void setHorario_de_atendimento_id(Pair horario_de_atendimento_id){
			this.horario_de_atendimento_id = horario_de_atendimento_id;
		}
		public void setHorario_de_atendimento_id(String key){
			this.setHorario_de_atendimento_id(key, key);
		}
		public void setHorario_de_atendimento_id(String key, String value){
			this.horario_de_atendimento_id= new Pair(key, value);
		}

		public Pair getHorario_de_atendimento_id(){
			return this.horario_de_atendimento_id;
		}
		public void setData(Pair data){
			this.data = data;
		}
		public void setData(String key){
			this.setData(key, key);
		}
		public void setData(String key, String value){
			this.data= new Pair(key, value);
		}

		public Pair getData(){
			return this.data;
		}

		public void setEspecialidade(Pair especialidade){
			this.especialidade = especialidade;
		}
		public void setEspecialidade(String key){
			this.setEspecialidade(key, key);
		}
		public void setEspecialidade(String key, String value){
			this.especialidade= new Pair(key, value);
		}

		public Pair getEspecialidade(){
			return this.especialidade;
		}

		public void setConsultorio(Pair consultorio){
			this.consultorio = consultorio;
		}
		public void setConsultorio(String key){
			this.setConsultorio(key, key);
		}
		public void setConsultorio(String key, String value){
			this.consultorio= new Pair(key, value);
		}

		public Pair getConsultorio(){
			return this.consultorio;
		}

		public void setHora_inicio_(Pair hora_inicio_){
			this.hora_inicio_ = hora_inicio_;
		}
		public void setHora_inicio_(String key){
			this.setHora_inicio_(key, key);
		}
		public void setHora_inicio_(String key, String value){
			this.hora_inicio_= new Pair(key, value);
		}

		public Pair getHora_inicio_(){
			return this.hora_inicio_;
		}

		public void setHora_fim(Pair hora_fim){
			this.hora_fim = hora_fim;
		}
		public void setHora_fim(String key){
			this.setHora_fim(key, key);
		}
		public void setHora_fim(String key, String value){
			this.hora_fim= new Pair(key, value);
		}

		public Pair getHora_fim(){
			return this.hora_fim;
		}

		public void setConsultorio_id(Pair consultorio_id){
			this.consultorio_id = consultorio_id;
		}
		public void setConsultorio_id(String key){
			this.setConsultorio_id(key, key);
		}
		public void setConsultorio_id(String key, String value){
			this.consultorio_id= new Pair(key, value);
		}

		public Pair getConsultorio_id(){
			return this.consultorio_id;
		}

	}

	public void loadHorario_de_atendimento(BaseQueryInterface query) {
		this.setHorario_de_atendimento(this.loadFormList(query,Horario_de_atendimento.class));
	}

}
