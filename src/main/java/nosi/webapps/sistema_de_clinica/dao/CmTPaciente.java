package nosi.webapps.sistema_de_clinica.dao;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import java.io.Serial;
import java.time.LocalDateTime;
import jakarta.validation.constraints.Size;
import javax.persistence.Entity;
import javax.persistence.Table;
import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.NamedQuery;
import javax.persistence.Id;

/**
 * @author: Kevin Sousa 2024-05-30
 */

//@XmlRootElement // Can be used for REST / XML API

@Entity
@Table(name = "cm_t_paciente", schema = "public")
@NamedQuery(name = "CmTPaciente.findAll", query = "SELECT t FROM CmTPaciente t")
public class CmTPaciente extends BaseActiveRecord<CmTPaciente> {

    @Serial
    private static final long serialVersionUID = 1L;

    public static final String TABLE_NAME = "CM_T_PACIENTE";

    // Change Integer type to BigDecimal if the number is very large

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@Size(max = 200)
	@Column(name = "nome")
	private String nome;
	@Size(max = 20)
	@Column(name = "tipo_documento")
	private String tipoDocumento;
	@Size(max = 200)
	@Column(name = "nome_mae")
	private String nomeMae;
	@Size(max = 200)
	@Column(name = "nome_pai")
	private String nomePai;
	@Size(max = 50)
	@Column(name = "nr_documento")
	private String nrDocumento;
	@Column(name = "user_registo_id")
	private Integer userRegistoId;
	@Column(name = "user_update_id")
	private Integer userUpdateId;
	@Column(name = "data_registo")
	private LocalDateTime dataRegisto;
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

   public String getTipoDocumento() {
      return this.tipoDocumento;
   }

   public void setTipoDocumento(String tipoDocumento) {
      this.tipoDocumento = tipoDocumento;
   }

   public String getNomeMae() {
      return this.nomeMae;
   }

   public void setNomeMae(String nomeMae) {
      this.nomeMae = nomeMae;
   }

   public String getNomePai() {
      return this.nomePai;
   }

   public void setNomePai(String nomePai) {
      this.nomePai = nomePai;
   }

   public String getNrDocumento() {
      return this.nrDocumento;
   }

   public void setNrDocumento(String nrDocumento) {
      this.nrDocumento = nrDocumento;
   }

   public Integer getUserRegistoId() {
      return this.userRegistoId;
   }

   public void setUserRegistoId(Integer userRegistoId) {
      this.userRegistoId = userRegistoId;
   }

   public Integer getUserUpdateId() {
      return this.userUpdateId;
   }

   public void setUserUpdateId(Integer userUpdateId) {
      this.userUpdateId = userUpdateId;
   }

   public LocalDateTime getDataRegisto() {
      return this.dataRegisto;
   }

   public void setDataRegisto(LocalDateTime dataRegisto) {
      this.dataRegisto = dataRegisto;
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
      public static final String TIPO_DOCUMENTO = "tipoDocumento";
      public static final String NOME_MAE = "nomeMae";
      public static final String NOME_PAI = "nomePai";
      public static final String NR_DOCUMENTO = "nrDocumento";
      public static final String USER_REGISTO_ID = "userRegistoId";
      public static final String USER_UPDATE_ID = "userUpdateId";
      public static final String DATA_REGISTO = "dataRegisto";
      public static final String DATA_UPDATE = "dataUpdate";

	  private Field() {}
	}
}