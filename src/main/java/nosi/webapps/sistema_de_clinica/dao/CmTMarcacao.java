package nosi.webapps.sistema_de_clinica.dao;

import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import java.time.LocalDateTime;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ForeignKey;
import java.io.Serial;
import javax.persistence.Entity;
import javax.persistence.Table;
import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.NamedQuery;
import javax.persistence.ManyToOne;

/**
 * @author: Kevin Sousa 2024-05-30
 */

//@XmlRootElement // Can be used for REST / XML API

@Entity
@Table(name = "cm_t_marcacao", schema = "public")
@NamedQuery(name = "CmTMarcacao.findAll", query = "SELECT t FROM CmTMarcacao t")
public class CmTMarcacao extends BaseActiveRecord<CmTMarcacao> {

    @Serial
    private static final long serialVersionUID = 1L;

    public static final String TABLE_NAME = "CM_T_MARCACAO";

    // Change Integer type to BigDecimal if the number is very large

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@ManyToOne
	@JoinColumn(name = "paciente_id", foreignKey = @ForeignKey(name = "CM_T_MARCACAO_PACIENTE_FK"))
	private CmTPedido pacienteId;
	@Column(name = "agedamento_id")
	private Integer agedamentoId;
	@Column(name = "data_registro")
	private LocalDateTime dataRegistro;
	@Column(name = "user_update")
	private Integer userUpdate;

   public Integer getId() {
      return this.id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public CmTPedido getPacienteId() {
      return this.pacienteId;
   }

   public void setPacienteId(CmTPedido pacienteId) {
      this.pacienteId = pacienteId;
   }

   public Integer getAgedamentoId() {
      return this.agedamentoId;
   }

   public void setAgedamentoId(Integer agedamentoId) {
      this.agedamentoId = agedamentoId;
   }

   public LocalDateTime getDataRegistro() {
      return this.dataRegistro;
   }

   public void setDataRegistro(LocalDateTime dataRegistro) {
      this.dataRegistro = dataRegistro;
   }

   public Integer getUserUpdate() {
      return this.userUpdate;
   }

   public void setUserUpdate(Integer userUpdate) {
      this.userUpdate = userUpdate;
   }

   public static final class Field {
      public static final String ID = "id";
      public static final String PACIENTE_ID = "pacienteId";
      public static final String AGEDAMENTO_ID = "agedamentoId";
      public static final String DATA_REGISTRO = "dataRegistro";
      public static final String USER_UPDATE = "userUpdate";

	  private Field() {}
	}
}