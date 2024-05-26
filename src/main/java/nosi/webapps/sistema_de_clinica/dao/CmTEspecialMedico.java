package nosi.webapps.sistema_de_clinica.dao;

import jakarta.validation.constraints.Size;
import java.io.Serial;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.ForeignKey;
import nosi.base.ActiveRecord.BaseActiveRecord;
import java.time.LocalDateTime;
import javax.persistence.OneToMany;
import javax.persistence.NamedQuery;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.Column;
import java.util.List;
import javax.persistence.GenerationType;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

/**
 * @author: Nositeste 2024-05-15
 */

//@XmlRootElement // Can be used for REST / XML API

@Entity
@Table(name = "cm_t_especial_medico", schema = "public")
@NamedQuery(name = "CmTEspecialMedico.findAll", query = "SELECT t FROM CmTEspecialMedico t")

public class CmTEspecialMedico extends BaseActiveRecord<CmTEspecialMedico> {

    @Serial
    private static final long serialVersionUID = 1L;

    public static final String TABLE_NAME = "CM_T_ESPECIAL_MEDICO";

    // Change Integer type to BigDecimal if the number is very large

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@ManyToOne
	@JoinColumn(name = "especialidade_id", foreignKey = @ForeignKey(name = "ESPECIAL_MEDICO_ESPECIAL_FK"))
	private CmTEspecialidade especialidadeId;
	@ManyToOne
	@JoinColumn(name = "medico_id", foreignKey = @ForeignKey(name = "MEDICO_ID_MED_FK"), referencedColumnName="ID")
	private CmTMedico medicoId;
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

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "especialidadeId")
	private List<CmTEspecialMedico> cmtespecialmedicoList;

   public Integer getId() {
      return this.id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public CmTEspecialidade getEspecialidadeId() {
      return this.especialidadeId;
   }

   public void setEspecialidadeId(CmTEspecialidade especialidadeId) {
      this.especialidadeId = especialidadeId;
   }

   public CmTMedico getMedicoId() {
      return this.medicoId;
   }

   public void setMedicoId(CmTMedico medicoId) {
      this.medicoId = medicoId;
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
      public static final String ESPECIALIDADE_ID = "especialidadeId";
      public static final String MEDICO_ID = "medicoId";
      public static final String ESTADO = "estado";
      public static final String USER_REGISTO = "userRegisto";
      public static final String DATA_REGISTO = "dataRegisto";
      public static final String USER_UPDATE = "userUpdate";
      public static final String DATA_UPDATE = "dataUpdate";

	  private Field() {}
	}
}