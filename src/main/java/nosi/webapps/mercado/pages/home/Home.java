package nosi.webapps.mercado.pages.home;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Home extends Model{		

	@RParam(rParamName = "p_nome")
	private String nome;

	@RParam(rParamName = "p_data_nascimento")
	private String data_nascimento;

	@RParam(rParamName = "p_n_documento")
	private Integer n_documento;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setData_nascimento(String data_nascimento){
		this.data_nascimento = data_nascimento;
	}
	public String getData_nascimento(){
		return this.data_nascimento;
	}
	
	public void setN_documento(Integer n_documento){
		this.n_documento = n_documento;
	}
	public Integer getN_documento(){
		return this.n_documento;
	}



}
