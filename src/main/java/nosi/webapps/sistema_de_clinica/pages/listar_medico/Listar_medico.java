package nosi.webapps.sistema_de_clinica.pages.listar_medico;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Listar_medico extends Model{		

	@RParam(rParamName = "p_nome")
	private String nome;

	@RParam(rParamName = "p_numero_da_ordem_dos_medicos")
	private Integer numero_da_ordem_dos_medicos;

	@RParam(rParamName = "p_estado")
	private String estado;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
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
	
	public void setEstado(String estado){
		this.estado = estado;
	}
	public String getEstado(){
		return this.estado;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String table_1_color_1;
		private String foto="../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg";
		private String foto_uuid;
		private String nome_medico;
		private String contacto;
		private Integer numero;
		private Integer id_medico;
		public void setTable_1_color_1(String table_1_color_1){
			this.table_1_color_1 = table_1_color_1;
		}
		public String getTable_1_color_1(){
			return this.table_1_color_1;
		}

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

		public void setNome_medico(String nome_medico){
			this.nome_medico = nome_medico;
		}
		public String getNome_medico(){
			return this.nome_medico;
		}

		public void setContacto(String contacto){
			this.contacto = contacto;
		}
		public String getContacto(){
			return this.contacto;
		}

		public void setNumero(Integer numero){
			this.numero = numero;
		}
		public Integer getNumero(){
			return this.numero;
		}

		public void setId_medico(Integer id_medico){
			this.id_medico = id_medico;
		}
		public Integer getId_medico(){
			return this.id_medico;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
