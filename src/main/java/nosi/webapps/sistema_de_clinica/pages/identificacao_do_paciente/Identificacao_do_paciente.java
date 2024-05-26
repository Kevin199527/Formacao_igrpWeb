package nosi.webapps.sistema_de_clinica.pages.identificacao_do_paciente;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Identificacao_do_paciente extends Model{		

	@NotNull()
	@RParam(rParamName = "p_nome")
	private String nome;

	@NotNull()
	@RParam(rParamName = "p_data_nascimento")
	private String data_nascimento;

	@NotNull()
	@RParam(rParamName = "p_tipo_documento_")
	private String tipo_documento_;

	@NotNull()
	@RParam(rParamName = "p_numero_documento")
	private Integer numero_documento;

	@RParam(rParamName = "p_informacao_adicional")
	private String informacao_adicional;

	@RParam(rParamName = "p_primeira_consulta_")
	private Integer primeira_consulta_;

	@RParam(rParamName = "p_data_adicional")
	private String data_adicional;

	@RParam(rParamName = "p_nome_de_mae")
	private String nome_de_mae;

	@RParam(rParamName = "p_nome_de_pai")
	private String nome_de_pai;

	@NotNull()
	@RParam(rParamName = "p_tipo_documento")
	private String tipo_documento;
	
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
	
	public void setTipo_documento_(String tipo_documento_){
		this.tipo_documento_ = tipo_documento_;
	}
	public String getTipo_documento_(){
		return this.tipo_documento_;
	}
	
	public void setNumero_documento(Integer numero_documento){
		this.numero_documento = numero_documento;
	}
	public Integer getNumero_documento(){
		return this.numero_documento;
	}
	
	public void setInformacao_adicional(String informacao_adicional){
		this.informacao_adicional = informacao_adicional;
	}
	public String getInformacao_adicional(){
		return this.informacao_adicional;
	}
	
	public void setPrimeira_consulta_(Integer primeira_consulta_){
		this.primeira_consulta_ = primeira_consulta_;
	}
	public Integer getPrimeira_consulta_(){
		return this.primeira_consulta_;
	}
	
	public void setData_adicional(String data_adicional){
		this.data_adicional = data_adicional;
	}
	public String getData_adicional(){
		return this.data_adicional;
	}
	
	public void setNome_de_mae(String nome_de_mae){
		this.nome_de_mae = nome_de_mae;
	}
	public String getNome_de_mae(){
		return this.nome_de_mae;
	}
	
	public void setNome_de_pai(String nome_de_pai){
		this.nome_de_pai = nome_de_pai;
	}
	public String getNome_de_pai(){
		return this.nome_de_pai;
	}
	
	public void setTipo_documento(String tipo_documento){
		this.tipo_documento = tipo_documento;
	}
	public String getTipo_documento(){
		return this.tipo_documento;
	}



}
