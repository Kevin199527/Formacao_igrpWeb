package nosi.webapps.sistema_de_clinica.dao;

import javax.persistence.JoinColumn;
import javax.persistence.GeneratedValue;
import java.time.LocalDateTime;
import javax.persistence.Id;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.ForeignKey;
import java.io.Serial;
import java.util.Date;

import jakarta.validation.constraints.NotNull;
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
@Table(name = "cm_t_pedido", schema = "public")
@NamedQuery(name = "CmTPedido.findAll", query = "SELECT t FROM CmTPedido t")
public class CmTPedido extends BaseActiveRecord<CmTPedido> {

    @Serial
    private static final long serialVersionUID = 1L;

    public static final String TABLE_NAME = "CM_T_PEDIDO";

    // Change Integer type to BigDecimal if the number is very large

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@NotNull
	@Column(name = "nr_processo")
	private Integer nrProcesso;
	@Column(name = "etapa_atual")
	private String etapaAtual;
	@Column(name = "processo_desc")
	private String processoDesc;
	@Column(name = "processo_key")
	private String processoKey;
	@Column(name = "data_pedido")
	private Date dataPedido;
	@Column(name = "user_pedido")
	private String userPedido;

	@Column(name = "id_paciente")
	private CmTPaciente idPaciente;
	@Column(name = "estado_pedido")
	private String estadoPedido;
	@Column(name = "paracer_medico")
	private String paracerMedico;
	@Column(name = "paracer_atendedor")
	private String paracerAtendedor;
	@Column(name = "obs_atendedor")
	private String obsAtendedor;
	@Column(name = "obs_medico")
	private String obsMedico;
    @Column(name = "id_relacao")
    private String idRelacao;
    @Column(name = "tipo_relacao")
    private String tipoRelacao;

   public Integer getId() {
      return this.id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public Integer getNrProcesso() {
      return this.nrProcesso;
   }

   public void setNrProcesso(Integer nrProcesso) {
      this.nrProcesso = nrProcesso;
   }

   public String getEtapaAtual() {
      return this.etapaAtual;
   }

   public void setEtapaAtual(String etapaAtual) {
      this.etapaAtual = etapaAtual;
   }

   public String getProcessoDesc() {
      return this.processoDesc;
   }

   public void setProcessoDesc(String processoDesc) {
      this.processoDesc = processoDesc;
   }

   public String getProcessoKey() {
      return this.processoKey;
   }

   public void setProcessoKey(String processoKey) {
      this.processoKey = processoKey;
   }

   public Date getDataPedido() {
      return this.dataPedido;
   }

   public void setDataPedido(Date dataPedido) {
      this.dataPedido = dataPedido;
   }

   public String getUserPedido() {
      return this.userPedido;
   }

   public void setUserPedido(String userPedido) {
      this.userPedido = userPedido;
   }

   public CmTPaciente getIdPaciente() {
      return this.idPaciente;
   }

   public void setIdPaciente(CmTPaciente idPaciente) {
      this.idPaciente = idPaciente;
   }

   public String getEstadoPedido() {
      return this.estadoPedido;
   }

   public void setEstadoPedido(String estadoPedido) {
      this.estadoPedido = estadoPedido;
   }

   public String getParacerMedico() {
      return this.paracerMedico;
   }

   public void setParacerMedico(String paracerMedico) {
      this.paracerMedico = paracerMedico;
   }

   public String getParacerAtendedor() {
      return this.paracerAtendedor;
   }

   public void setParacerAtendedor(String paracerAtendedor) {
      this.paracerAtendedor = paracerAtendedor;
   }

   public String getObsAtendedor() {
      return this.obsAtendedor;
   }

   public void setObsAtendedor(String obsAtendedor) {
      this.obsAtendedor = obsAtendedor;
   }

   public String getObsMedico() {
      return this.obsMedico;
   }

   public void setObsMedico(String obsMedico) {
      this.obsMedico = obsMedico;
   }

    public String getIdRelacao() {
        return idRelacao;
    }

    public void setIdRelacao(String idRelacao) {
        this.idRelacao = idRelacao;
    }

    public String getTipoRelacao() {
        return tipoRelacao;
    }

    public void setTipoRelacao(String tipoRelacao) {
        this.tipoRelacao = tipoRelacao;
    }

    public static final class Field {
      public static final String ID = "id";
      public static final String NR_PROCESSO = "nrProcesso";
      public static final String ETAPA_ATUAL = "etapaAtual";
      public static final String PROCESSO_DESC = "processoDesc";
      public static final String PROCESSO_KEY = "processoKey";
      public static final String DATA_PEDIDO = "dataPedido";
      public static final String USER_PEDIDO = "userPedido";
      public static final String ID_PACIENTE = "idPaciente";
      public static final String ESTADO_PEDIDO = "estadoPedido";
      public static final String PARACER_MEDICO = "paracerMedico";
      public static final String PARACER_ATENDEDOR = "paracerAtendedor";
      public static final String OBS_ATENDEDOR = "obsAtendedor";
      public static final String OBS_MEDICO = "obsMedico";
        public static final String TIPO_RELACAO = "tipoRelacao";
        public static final String ID_RELACAO = "idRelacao";

	  private Field() {}
	}
}