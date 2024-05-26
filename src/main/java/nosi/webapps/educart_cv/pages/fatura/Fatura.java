package nosi.webapps.educart_cv.pages.fatura;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Fatura extends Model{		

	@RParam(rParamName = "p_nome_completo")
	private String nome_completo;

	@RParam(rParamName = "p_data_nascimento")
	private String data_nascimento;

	@RParam(rParamName = "p_numero_de_documento")
	private Integer numero_de_documento;
	
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
	
	public void setNumero_de_documento(Integer numero_de_documento){
		this.numero_de_documento = numero_de_documento;
	}
	public Integer getNumero_de_documento(){
		return this.numero_de_documento;
	}



}
