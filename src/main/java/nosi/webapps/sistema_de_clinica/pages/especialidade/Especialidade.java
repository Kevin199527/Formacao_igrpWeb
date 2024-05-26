package nosi.webapps.sistema_de_clinica.pages.especialidade;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
public class Especialidade extends Model{		
	
	@SeparatorList(name = Especialidade_form.class)
	@Valid
	private List<Especialidade_form> especialidade_form = new ArrayList<>();	
	public void setEspecialidade_form(List<Especialidade_form> especialidade_form){
		this.especialidade_form = especialidade_form;
	}
	public List<Especialidade_form> getEspecialidade_form(){
		return this.especialidade_form;
	}
	@RParam(rParamName = "p_especialidade_form_id")
	private String[] p_especialidade_form_id;
	@RParam(rParamName = "p_especialidade_form_del")
	private String[] p_especialidade_form_del;
	@RParam(rParamName = "p_especialidade_form_edit")
	private String[] p_especialidade_form_edit;
	
	public void setP_especialidade_form_id(String[] p_especialidade_form_id){
		this.p_especialidade_form_id = p_especialidade_form_id;
	}
	public String[] getP_especialidade_form_id(){
		return this.p_especialidade_form_id;
	}
	
	public void setP_especialidade_form_del(String[] p_especialidade_form_del){
		this.p_especialidade_form_del = p_especialidade_form_del;
	}
	public String[] getP_especialidade_form_del(){
		return this.p_especialidade_form_del;
	}
	
	public void setP_especialidade_form_edit(String[] p_especialidade_form_edit){
		this.p_especialidade_form_edit = p_especialidade_form_edit;
	}
	public String[] getP_especialidade_form_edit(){
		return this.p_especialidade_form_edit;
	}


	public static class Especialidade_form{
		private Pair especialidade_form_id;
private Pair nome_especialidade;
private Pair estado;
		public void setEspecialidade_form_id(Pair especialidade_form_id){
			this.especialidade_form_id = especialidade_form_id;
		}
		public void setEspecialidade_form_id(String key){
			this.setEspecialidade_form_id(key, key);
		}
		public void setEspecialidade_form_id(String key, String value){
			this.especialidade_form_id= new Pair(key, value);
		}

		public Pair getEspecialidade_form_id(){
			return this.especialidade_form_id;
		}
		public void setNome_especialidade(Pair nome_especialidade){
			this.nome_especialidade = nome_especialidade;
		}
		public void setNome_especialidade(String key){
			this.setNome_especialidade(key, key);
		}
		public void setNome_especialidade(String key, String value){
			this.nome_especialidade= new Pair(key, value);
		}

		public Pair getNome_especialidade(){
			return this.nome_especialidade;
		}

		public void setEstado(Pair estado){
			this.estado = estado;
		}
		public void setEstado(String key){
			this.setEstado(key, key);
		}
		public void setEstado(String key, String value){
			this.estado= new Pair(key, value);
		}

		public Pair getEstado(){
			return this.estado;
		}

	}

	public void loadEspecialidade_form(BaseQueryInterface query) {
		this.setEspecialidade_form(this.loadFormList(query,Especialidade_form.class));
	}

}
