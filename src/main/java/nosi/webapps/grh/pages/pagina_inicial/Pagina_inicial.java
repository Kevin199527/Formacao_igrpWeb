package nosi.webapps.grh.pages.pagina_inicial;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import nosi.core.gui.components.IGRPSeparatorList.Pair;
import nosi.core.webapp.SeparatorList;
import java.util.ArrayList;
import java.util.List;
import jakarta.validation.Valid;
public class Pagina_inicial extends Model{		

	@RParam(rParamName = "p_nome")
	private String nome;

	@RParam(rParamName = "p_email")
	private String email;

	@RParam(rParamName = "p_username")
	private String username;

	@RParam(rParamName = "p_telefone")
	private Integer telefone;

	@RParam(rParamName = "p_telemovel")
	private Integer telemovel;

	@RParam(rParamName = "p_cni")
	private String cni;

	@RParam(rParamName = "p_view_1_img")
	private String view_1_img;
	
	@SeparatorList(name = Separatorlist_1.class)
	@Valid
	private List<Separatorlist_1> separatorlist_1 = new ArrayList<>();	
	public void setSeparatorlist_1(List<Separatorlist_1> separatorlist_1){
		this.separatorlist_1 = separatorlist_1;
	}
	public List<Separatorlist_1> getSeparatorlist_1(){
		return this.separatorlist_1;
	}
	@RParam(rParamName = "p_separatorlist_1_id")
	private String[] p_separatorlist_1_id;
	@RParam(rParamName = "p_separatorlist_1_del")
	private String[] p_separatorlist_1_del;
	@RParam(rParamName = "p_separatorlist_1_edit")
	private String[] p_separatorlist_1_edit;
	
	public void setP_separatorlist_1_id(String[] p_separatorlist_1_id){
		this.p_separatorlist_1_id = p_separatorlist_1_id;
	}
	public String[] getP_separatorlist_1_id(){
		return this.p_separatorlist_1_id;
	}
	
	public void setP_separatorlist_1_del(String[] p_separatorlist_1_del){
		this.p_separatorlist_1_del = p_separatorlist_1_del;
	}
	public String[] getP_separatorlist_1_del(){
		return this.p_separatorlist_1_del;
	}
	
	public void setP_separatorlist_1_edit(String[] p_separatorlist_1_edit){
		this.p_separatorlist_1_edit = p_separatorlist_1_edit;
	}
	public String[] getP_separatorlist_1_edit(){
		return this.p_separatorlist_1_edit;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setEmail(String email){
		this.email = email;
	}
	public String getEmail(){
		return this.email;
	}
	
	public void setUsername(String username){
		this.username = username;
	}
	public String getUsername(){
		return this.username;
	}
	
	public void setTelefone(Integer telefone){
		this.telefone = telefone;
	}
	public Integer getTelefone(){
		return this.telefone;
	}
	
	public void setTelemovel(Integer telemovel){
		this.telemovel = telemovel;
	}
	public Integer getTelemovel(){
		return this.telemovel;
	}
	
	public void setCni(String cni){
		this.cni = cni;
	}
	public String getCni(){
		return this.cni;
	}
	
	public void setView_1_img(String view_1_img){
		this.view_1_img = view_1_img;
	}
	public String getView_1_img(){
		return this.view_1_img;
	}


	public static class Separatorlist_1{
		private Pair separatorlist_1_id;
private Pair separatorlist_1_text_1;
private Pair separatorlist_1_select_1;
		public void setSeparatorlist_1_id(Pair separatorlist_1_id){
			this.separatorlist_1_id = separatorlist_1_id;
		}
		public void setSeparatorlist_1_id(String key){
			this.setSeparatorlist_1_id(key, key);
		}
		public void setSeparatorlist_1_id(String key, String value){
			this.separatorlist_1_id= new Pair(key, value);
		}

		public Pair getSeparatorlist_1_id(){
			return this.separatorlist_1_id;
		}
		public void setSeparatorlist_1_text_1(Pair separatorlist_1_text_1){
			this.separatorlist_1_text_1 = separatorlist_1_text_1;
		}
		public void setSeparatorlist_1_text_1(String key){
			this.setSeparatorlist_1_text_1(key, key);
		}
		public void setSeparatorlist_1_text_1(String key, String value){
			this.separatorlist_1_text_1= new Pair(key, value);
		}

		public Pair getSeparatorlist_1_text_1(){
			return this.separatorlist_1_text_1;
		}

		public void setSeparatorlist_1_select_1(Pair separatorlist_1_select_1){
			this.separatorlist_1_select_1 = separatorlist_1_select_1;
		}
		public void setSeparatorlist_1_select_1(String key){
			this.setSeparatorlist_1_select_1(key, key);
		}
		public void setSeparatorlist_1_select_1(String key, String value){
			this.separatorlist_1_select_1= new Pair(key, value);
		}

		public Pair getSeparatorlist_1_select_1(){
			return this.separatorlist_1_select_1;
		}

	}

	public void loadSeparatorlist_1(BaseQueryInterface query) {
		this.setSeparatorlist_1(this.loadFormList(query,Separatorlist_1.class));
	}

}
