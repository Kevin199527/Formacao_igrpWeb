package nosi.webapps.sistema_de_clinica.dao;

import nosi.base.ActiveRecord.BaseActiveRecord;
import java.time.LocalDateTime;
import java.io.Serial;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotBlank;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.Column;

/**
 * @author: Nositeste 2024-05-14
 */

//@XmlRootElement // Can be used for REST / XML API

@Entity
@Table(name = "cm_t_medico", schema = "public")
@NamedQuery(name = "CmTMedico.findAll", query = "SELECT t FROM CmTMedico t")
public class CmTMedico extends BaseActiveRecord<CmTMedico> {

    @Serial
    private static final long serialVersionUID = 1L;

    public static final String TABLE_NAME = "CM_T_MEDICO";

    // Change Integer type to BigDecimal if the number is very large

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", nullable = false, updatable = false)
 	private Integer id;
	@NotBlank
	@Size(max = 200)
	@Column(name = "nome")
	private String nome;
	@NotNull
	@Column(name = "numero_ordem")
	private Integer numeroOrdem;
	@NotBlank
	@Size(max = 50)
	@Column(name = "telefone")
	private String telefone;
	@Size(max = 128)
	@Column(name = "foto")
	private String foto;
	@Size(max = 3)
	@Column(name = "estado")
	private String estado;
	@Column(name = "user_registo")
	private Integer userRegisto;
	@Column(name = "data_registo")
	private LocalDateTime dataRegisto;
	@Column(name = "user_update")
	private Integer userUpdate;
	@Column(name = "data_update")
	private LocalDateTime dataUpdate;

   public Integer getId() {
      return this.id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public Integer getNumeroOrdem() {
      return this.numeroOrdem;
   }

   public void setNumeroOrdem(Integer numeroOrdem) {
      this.numeroOrdem = numeroOrdem;
   }

   public String getTelefone() {
      return this.telefone;
   }

   public void setTelefone(String telefone) {
      this.telefone = telefone;
   }

   public String getFoto() {
      return this.foto;
   }

   public void setFoto(String foto) {
      this.foto = foto;
   }

   public String getEstado() {
      return this.estado;
   }

   public void setEstado(String estado) {
      this.estado = estado;
   }

   public Integer getUserRegisto() {
      return this.userRegisto;
   }

   public void setUserRegisto(Integer userRegisto) {
      this.userRegisto = userRegisto;
   }

   public LocalDateTime getDataRegisto() {
      return this.dataRegisto;
   }

   public void setDataRegisto(LocalDateTime dataRegisto) {
      this.dataRegisto = dataRegisto;
   }

   public Integer getUserUpdate() {
      return this.userUpdate;
   }

   public void setUserUpdate(Integer userUpdate) {
      this.userUpdate = userUpdate;
   }

   public LocalDateTime getDataUpdate() {
      return this.dataUpdate;
   }

   public void setDataUpdate(LocalDateTime dataUpdate) {
      this.dataUpdate = dataUpdate;
   }

   public static final class Field {
      public static final String ID = "id";
      public static final String NOME = "nome";
      public static final String NUMERO_ORDEM = "numeroOrdem";
      public static final String TELEFONE = "telefone";
      public static final String FOTO = "foto";
      public static final String ESTADO = "estado";
      public static final String USER_REGISTO = "userRegisto";
      public static final String DATA_REGISTO = "dataRegisto";
      public static final String USER_UPDATE = "userUpdate";
      public static final String DATA_UPDATE = "dataUpdate";

	  private Field() {}
	}
}