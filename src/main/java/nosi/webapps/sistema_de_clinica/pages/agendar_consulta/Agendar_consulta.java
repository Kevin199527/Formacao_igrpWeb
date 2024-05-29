package nosi.webapps.sistema_de_clinica.pages.agendar_consulta;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Agendar_consulta extends Model{		

	@RParam(rParamName = "p_especialidade_medica")
	private String especialidade_medica;

	@RParam(rParamName = "p_medico_com_especialidade")
	private String medico_com_especialidade;
	
	private List<Lista_de_consulta> lista_de_consulta = new ArrayList<>();	
	public void setLista_de_consulta(List<Lista_de_consulta> lista_de_consulta){
		this.lista_de_consulta = lista_de_consulta;
	}
	public List<Lista_de_consulta> getLista_de_consulta(){
		return this.lista_de_consulta;
	}

	
	public void setEspecialidade_medica(String especialidade_medica){
		this.especialidade_medica = especialidade_medica;
	}
	public String getEspecialidade_medica(){
		return this.especialidade_medica;
	}
	
	public void setMedico_com_especialidade(String medico_com_especialidade){
		this.medico_com_especialidade = medico_com_especialidade;
	}
	public String getMedico_com_especialidade(){
		return this.medico_com_especialidade;
	}


	public static class Lista_de_consulta extends IGRPTable.Table{
		private String data_de_agendamento;
		private String hora_inicio_1;
		private String hora_fim;
		private int selecionar;
		private int selecionar_check;
		private String id_medico;
		public void setData_de_agendamento(String data_de_agendamento){
			this.data_de_agendamento = data_de_agendamento;
		}
		public String getData_de_agendamento(){
			return this.data_de_agendamento;
		}

		public void setHora_inicio_1(String hora_inicio_1){
			this.hora_inicio_1 = hora_inicio_1;
		}
		public String getHora_inicio_1(){
			return this.hora_inicio_1;
		}

		public void setHora_fim(String hora_fim){
			this.hora_fim = hora_fim;
		}
		public String getHora_fim(){
			return this.hora_fim;
		}

		public void setSelecionar(int selecionar){
			this.selecionar = selecionar;
		}
		public int getSelecionar(){
			return this.selecionar;
		}
		public void setSelecionar_check(int selecionar_check){
			this.selecionar_check = selecionar_check;
		}
		public int getSelecionar_check(){
			return this.selecionar_check;
		}

		public void setId_medico(String id_medico){
			this.id_medico = id_medico;
		}
		public String getId_medico(){
			return this.id_medico;
		}

	}

	public void loadLista_de_consulta(BaseQueryInterface query) {
		this.setLista_de_consulta(this.loadTable(query,Lista_de_consulta.class));
	}

}
