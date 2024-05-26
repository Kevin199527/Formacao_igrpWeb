package nosi.webapps.sistema_de_clinica.pages.consultas_marcadas;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Consultas_marcadas extends Model{		

	@RParam(rParamName = "p_data_inicio")
	private String data_inicio;

	@RParam(rParamName = "p_data_fim")
	private String data_fim;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setData_inicio(String data_inicio){
		this.data_inicio = data_inicio;
	}
	public String getData_inicio(){
		return this.data_inicio;
	}
	
	public void setData_fim(String data_fim){
		this.data_fim = data_fim;
	}
	public String getData_fim(){
		return this.data_fim;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String data_consulta_;
		private String nome_paciente;
		private String especialidade;
		private String hora_inicio;
		private String hora_fim_;
		private String id_medico;
		public void setData_consulta_(String data_consulta_){
			this.data_consulta_ = data_consulta_;
		}
		public String getData_consulta_(){
			return this.data_consulta_;
		}

		public void setNome_paciente(String nome_paciente){
			this.nome_paciente = nome_paciente;
		}
		public String getNome_paciente(){
			return this.nome_paciente;
		}

		public void setEspecialidade(String especialidade){
			this.especialidade = especialidade;
		}
		public String getEspecialidade(){
			return this.especialidade;
		}

		public void setHora_inicio(String hora_inicio){
			this.hora_inicio = hora_inicio;
		}
		public String getHora_inicio(){
			return this.hora_inicio;
		}

		public void setHora_fim_(String hora_fim_){
			this.hora_fim_ = hora_fim_;
		}
		public String getHora_fim_(){
			return this.hora_fim_;
		}

		public void setId_medico(String id_medico){
			this.id_medico = id_medico;
		}
		public String getId_medico(){
			return this.id_medico;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
