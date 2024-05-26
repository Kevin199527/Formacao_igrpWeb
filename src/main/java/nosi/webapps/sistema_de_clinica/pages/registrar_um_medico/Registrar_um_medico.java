package nosi.webapps.sistema_de_clinica.pages.registrar_um_medico;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Registrar_um_medico extends Model{		

	@RParam(rParamName = "p_foto")
	private String foto;
	@RParam(rParamName = "p_foto_uuid")
	private String foto_uuid;

	@NotNull()
	@RParam(rParamName = "p_nome")
	private String nome;

	@NotNull()
	@RParam(rParamName = "p_numero_da_ordem_dos_medicos")
	private Integer numero_da_ordem_dos_medicos;

	@NotNull()
	@RParam(rParamName = "p_telefones")
	private String telefones;

	@RParam(rParamName = "p_especialidade")
	private String[] especialidade;

	@RParam(rParamName = "p_estado")
	private int estado;
	@RParam(rParamName = "p_estado_check")
	private int estado_check;

	@RParam(rParamName = "p_id_medico")
	private Integer id_medico;
	
	public void setFoto(String foto){
		this.foto = foto;
	}
	public String getFoto(){
		return this.foto;
	}
	public void setFoto_uuid(String foto_uuid){
		this.foto_uuid = foto_uuid;
	}
	public String getFoto_uuid(){
		return this.foto_uuid;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return this.nome;
	}
	
	public void setNumero_da_ordem_dos_medicos(Integer numero_da_ordem_dos_medicos){
		this.numero_da_ordem_dos_medicos = numero_da_ordem_dos_medicos;
	}
	public Integer getNumero_da_ordem_dos_medicos(){
		return this.numero_da_ordem_dos_medicos;
	}
	
	public void setTelefones(String telefones){
		this.telefones = telefones;
	}
	public String getTelefones(){
		return this.telefones;
	}
	
	public void setEspecialidade(String[] especialidade){
		this.especialidade = especialidade;
	}
	public String[] getEspecialidade(){
		return this.especialidade;
	}
	
	public void setEstado(int estado){
		this.estado = estado;
	}
	public int getEstado(){
		return this.estado;
	}
	public void setEstado_check(int estado_check){
		this.estado_check = estado_check;
	}
	public int getEstado_check(){
		return this.estado_check;
	}
	
	public void setId_medico(Integer id_medico){
		this.id_medico = id_medico;
	}
	public Integer getId_medico(){
		return this.id_medico;
	}



}
