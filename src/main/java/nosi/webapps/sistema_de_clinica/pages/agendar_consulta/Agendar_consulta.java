package nosi.webapps.sistema_de_clinica.pages.agendar_consulta;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
import nosi.core.validator.constraints.*;

public class Agendar_consulta extends Model{		

	@NotNull()
	@RParam(rParamName = "p_data")
	private String data;

	@RParam(rParamName = "p_especialidade_medica")
	private String especialidade_medica;

	@RParam(rParamName = "p_medico_com_especialidade")
	private String medico_com_especialidade;
	
	@SeparatorList(name = Formlist_1.class)
	@Valid
	private List<Formlist_1> formlist_1 = new ArrayList<>();	
	public void setFormlist_1(List<Formlist_1> formlist_1){
		this.formlist_1 = formlist_1;
	}
	public List<Formlist_1> getFormlist_1(){
		return this.formlist_1;
	}
	@RParam(rParamName = "p_formlist_1_id")
	private String[] p_formlist_1_id;
	@RParam(rParamName = "p_formlist_1_del")
	private String[] p_formlist_1_del;
	@RParam(rParamName = "p_formlist_1_edit")
	private String[] p_formlist_1_edit;
	
	public void setP_formlist_1_id(String[] p_formlist_1_id){
		this.p_formlist_1_id = p_formlist_1_id;
	}
	public String[] getP_formlist_1_id(){
		return this.p_formlist_1_id;
	}
	
	public void setP_formlist_1_del(String[] p_formlist_1_del){
		this.p_formlist_1_del = p_formlist_1_del;
	}
	public String[] getP_formlist_1_del(){
		return this.p_formlist_1_del;
	}
	
	public void setP_formlist_1_edit(String[] p_formlist_1_edit){
		this.p_formlist_1_edit = p_formlist_1_edit;
	}
	public String[] getP_formlist_1_edit(){
		return this.p_formlist_1_edit;
	}
	
	public void setData(String data){
		this.data = data;
	}
	public String getData(){
		return this.data;
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


	public static class Formlist_1{
		private Pair formlist_1_id;
private Pair medico;
private Pair especialidade;
private Pair hora_inicio;
private Pair hora_fim_;
private Pair selecionar;
		private Pair selecionar_check;
		public void setFormlist_1_id(Pair formlist_1_id){
			this.formlist_1_id = formlist_1_id;
		}
		public void setFormlist_1_id(String key){
			this.setFormlist_1_id(key, key);
		}
		public void setFormlist_1_id(String key, String value){
			this.formlist_1_id= new Pair(key, value);
		}

		public Pair getFormlist_1_id(){
			return this.formlist_1_id;
		}
		public void setMedico(Pair medico){
			this.medico = medico;
		}
		public void setMedico(String key){
			this.setMedico(key, key);
		}
		public void setMedico(String key, String value){
			this.medico= new Pair(key, value);
		}

		public Pair getMedico(){
			return this.medico;
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

		public void setHora_inicio(Pair hora_inicio){
			this.hora_inicio = hora_inicio;
		}
		public void setHora_inicio(String key){
			this.setHora_inicio(key, key);
		}
		public void setHora_inicio(String key, String value){
			this.hora_inicio= new Pair(key, value);
		}

		public Pair getHora_inicio(){
			return this.hora_inicio;
		}

		public void setHora_fim_(Pair hora_fim_){
			this.hora_fim_ = hora_fim_;
		}
		public void setHora_fim_(String key){
			this.setHora_fim_(key, key);
		}
		public void setHora_fim_(String key, String value){
			this.hora_fim_= new Pair(key, value);
		}

		public Pair getHora_fim_(){
			return this.hora_fim_;
		}

		public void setSelecionar(Pair selecionar){
			this.selecionar = selecionar;
		}
		public void setSelecionar(String key){
			this.setSelecionar(key, key);
		}
		public void setSelecionar(String key, String value){
			this.selecionar= new Pair(key, value);
		}

		public Pair getSelecionar(){
			return this.selecionar;
		}
		
		public void setSelecionar_check(Pair selecionar_check){
			this.selecionar_check = selecionar_check;
		}
		public void setSelecionar_check(String key){
			this.setSelecionar_check(key, key);
		}
		public void setSelecionar_check(String key, String value){
			this.selecionar_check= new Pair(key, value);
		}

		public Pair getSelecionar_check(){
			return this.selecionar_check;
		}

	}

	public void loadFormlist_1(BaseQueryInterface query) {
		this.setFormlist_1(this.loadFormList(query,Formlist_1.class));
	}

}
