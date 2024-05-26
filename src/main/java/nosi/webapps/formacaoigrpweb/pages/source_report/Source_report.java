package nosi.webapps.formacaoigrpweb.pages.source_report;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Source_report extends Model{		

	@RParam(rParamName = "p_nome_completo")
	private String nome_completo;

	@RParam(rParamName = "p_data_nascimento")
	private String data_nascimento;

	@RParam(rParamName = "p_n_documento")
	private Integer n_documento;
	
	public void setNome_completo(String nome_completo){
		this.nome_completo = nome_completo;
	}
	public String getNome_completo(){
		return this.nome_completo;
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
