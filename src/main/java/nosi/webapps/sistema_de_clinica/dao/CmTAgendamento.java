package nosi.webapps.sistema_de_clinica.dao;

import javax.persistence.Table;
import javax.persistence.NamedQuery;
import javax.persistence.GeneratedValue;
import java.sql.Date;
import java.time.LocalDateTime;
import javax.persistence.JoinColumn;
import javax.persistence.ForeignKey;
import javax.persistence.ManyToOne;
import nosi.base.ActiveRecord.BaseActiveRecord;
import jakarta.validation.constraints.Size;
import javax.persistence.Column;
import javax.persistence.GenerationType;
import java.io.Serial;
import javax.persistence.Id;
import javax.persistence.Entity;

/**
 * @author: Nositeste 2024-05-22
 */

//@XmlRootElement // Can be used for REST / XML API

@Entity
@Table(name = "cm_t_agendamento", schema = "public")
@NamedQuery(name = "CmTAgendamento.findAll", query = "SELECT t FROM CmTAgendamento t")
public class CmTAgendamento extends BaseActiveRecord<CmTAgendamento> {

    @Serial
    private static final long serialVersionUID = 1L;

    public static final String TABLE_NAME = "CM_T_AGENDAMENTO";

    // Change Integer type to BigDecimal if the number is very large

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@Column(name = "data_agendamento")
	private Date dataAgendamento;
	@ManyToOne
	@JoinColumn(name = "cm_esp_med_id", foreignKey = @ForeignKey(name = "cm_t_agendamento_especial_medico_fk"))
	private CmTEspecialMedico cmEspMedId;
	@Size(max = 3)
	@Column(name = "local_id")
	private String localId;
	@Size(max = 5)
	@Column(name = "hora_inicio")
	private String horaInicio;
	@Size(max = 5)
	@Column(name = "hora_fim")
	private String horaFim;
	@Column(name = "user_registro")
	private Integer userRegistro;
	@Column(name = "data_registro")
	private LocalDateTime dataRegistro;
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

   public Date getDataAgendamento() {
      return this.dataAgendamento;
   }

   public void setDataAgendamento(Date dataAgendamento) {
      this.dataAgendamento = dataAgendamento;
   }

   public CmTEspecialMedico getCmEspMedId() {
      return this.cmEspMedId;
   }

   public void setCmEspMedId(CmTEspecialMedico cmEspMedId) {
      this.cmEspMedId = cmEspMedId;
   }

   public String getLocalId() {
      return this.localId;
   }

   public void setLocalId(String localId) {
      this.localId = localId;
   }

   public String getHoraInicio() {
      return this.horaInicio;
   }

   public void setHoraInicio(String horaInicio) {
      this.horaInicio = horaInicio;
   }

   public String getHoraFim() {
      return this.horaFim;
   }

   public void setHoraFim(String horaFim) {
      this.horaFim = horaFim;
   }

   public Integer getUserRegistro() {
      return this.userRegistro;
   }

   public void setUserRegistro(Integer userRegistro) {
      this.userRegistro = userRegistro;
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

   public LocalDateTime getDataUpdate() {
      return this.dataUpdate;
   }

   public void setDataUpdate(LocalDateTime dataUpdate) {
      this.dataUpdate = dataUpdate;
   }

   public static final class Field {
      public static final String ID = "id";
      public static final String DATA_AGENDAMENTO = "dataAgendamento";
      public static final String CM_ESP_MED_ID = "cmEspMedId";
      public static final String LOCAL_ID = "localId";
      public static final String HORA_INICIO = "horaInicio";
      public static final String HORA_FIM = "horaFim";
      public static final String USER_REGISTRO = "userRegistro";
      public static final String DATA_REGISTRO = "dataRegistro";
      public static final String USER_UPDATE = "userUpdate";
      public static final String DATA_UPDATE = "dataUpdate";

	  private Field() {}
	}
}