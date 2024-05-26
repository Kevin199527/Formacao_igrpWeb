package nosi.webapps.sistema_de_clinica.dao;

import jakarta.validation.constraints.Size;
import javax.persistence.Id;
import nosi.base.ActiveRecord.BaseActiveRecord;
import java.io.Serial;
import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQuery;
import javax.persistence.GeneratedValue;

/**
 * @author: Nositeste 2024-05-22
 */

//@XmlRootElement // Can be used for REST / XML API

@Entity
@Table(name = "geografia", schema = "public")
@NamedQuery(name = "Geografia.findAll", query = "SELECT t FROM Geografia t")
public class Geografia extends BaseActiveRecord<Geografia> {

    @Serial
    private static final long serialVersionUID = 1L;

    public static final String TABLE_NAME = "GEOGRAFIA";

    // Change Integer type to BigDecimal if the number is very large

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private String id;
	@Size(max = 255)
	@Column(name = "codigo")
	private String codigo;
	@Size(max = 255)
	@Column(name = "codigo_ine")
	private String codigoIne;
	@Size(max = 255)
	@Column(name = "codigo_iso")
	private String codigoIso;
	@Size(max = 255)
	@Column(name = "concelho")
	private String concelho;
	@Size(max = 255)
	@Column(name = "flag_alter")
	private String flagAlter;
	@Size(max = 255)
	@Column(name = "flg_situacao")
	private String flgSituacao;
	@Size(max = 255)
	@Column(name = "freguesia")
	private String freguesia;
	@Size(max = 255)
	@Column(name = "geogr_id")
	private String geogrId;
	@Size(max = 255)
	@Column(name = "ilha")
	private String ilha;
	@Size(max = 255)
	@Column(name = "nacionalidade")
	private String nacionalidade;
	@Size(max = 255)
	@Column(name = "nivel_detalhe")
	private String nivelDetalhe;
	@Size(max = 255)
	@Column(name = "nome")
	private String nome;
	@Size(max = 255)
	@Column(name = "nome_norm")
	private String nomeNorm;
	@Size(max = 255)
	@Column(name = "nome_oficial")
	private String nomeOficial;
	@Size(max = 255)
	@Column(name = "pais")
	private String pais;
	@Size(max = 255)
	@Column(name = "self_id")
	private String selfId;
	@Size(max = 255)
	@Column(name = "short_nome")
	private String shortNome;
	@Size(max = 255)
	@Column(name = "tp_geog_cd")
	private String tpGeogCd;
	@Size(max = 255)
	@Column(name = "zona")
	private String zona;

   public String getId() {
      return this.id;
   }

   public void setId(String id) {
      this.id = id;
   }

   public String getCodigo() {
      return this.codigo;
   }

   public void setCodigo(String codigo) {
      this.codigo = codigo;
   }

   public String getCodigoIne() {
      return this.codigoIne;
   }

   public void setCodigoIne(String codigoIne) {
      this.codigoIne = codigoIne;
   }

   public String getCodigoIso() {
      return this.codigoIso;
   }

   public void setCodigoIso(String codigoIso) {
      this.codigoIso = codigoIso;
   }

   public String getConcelho() {
      return this.concelho;
   }

   public void setConcelho(String concelho) {
      this.concelho = concelho;
   }

   public String getFlagAlter() {
      return this.flagAlter;
   }

   public void setFlagAlter(String flagAlter) {
      this.flagAlter = flagAlter;
   }

   public String getFlgSituacao() {
      return this.flgSituacao;
   }

   public void setFlgSituacao(String flgSituacao) {
      this.flgSituacao = flgSituacao;
   }

   public String getFreguesia() {
      return this.freguesia;
   }

   public void setFreguesia(String freguesia) {
      this.freguesia = freguesia;
   }

   public String getGeogrId() {
      return this.geogrId;
   }

   public void setGeogrId(String geogrId) {
      this.geogrId = geogrId;
   }

   public String getIlha() {
      return this.ilha;
   }

   public void setIlha(String ilha) {
      this.ilha = ilha;
   }

   public String getNacionalidade() {
      return this.nacionalidade;
   }

   public void setNacionalidade(String nacionalidade) {
      this.nacionalidade = nacionalidade;
   }

   public String getNivelDetalhe() {
      return this.nivelDetalhe;
   }

   public void setNivelDetalhe(String nivelDetalhe) {
      this.nivelDetalhe = nivelDetalhe;
   }

   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getNomeNorm() {
      return this.nomeNorm;
   }

   public void setNomeNorm(String nomeNorm) {
      this.nomeNorm = nomeNorm;
   }

   public String getNomeOficial() {
      return this.nomeOficial;
   }

   public void setNomeOficial(String nomeOficial) {
      this.nomeOficial = nomeOficial;
   }

   public String getPais() {
      return this.pais;
   }

   public void setPais(String pais) {
      this.pais = pais;
   }

   public String getSelfId() {
      return this.selfId;
   }

   public void setSelfId(String selfId) {
      this.selfId = selfId;
   }

   public String getShortNome() {
      return this.shortNome;
   }

   public void setShortNome(String shortNome) {
      this.shortNome = shortNome;
   }

   public String getTpGeogCd() {
      return this.tpGeogCd;
   }

   public void setTpGeogCd(String tpGeogCd) {
      this.tpGeogCd = tpGeogCd;
   }

   public String getZona() {
      return this.zona;
   }

   public void setZona(String zona) {
      this.zona = zona;
   }

   public static final class Field {
      public static final String ID = "id";
      public static final String CODIGO = "codigo";
      public static final String CODIGO_INE = "codigoIne";
      public static final String CODIGO_ISO = "codigoIso";
      public static final String CONCELHO = "concelho";
      public static final String FLAG_ALTER = "flagAlter";
      public static final String FLG_SITUACAO = "flgSituacao";
      public static final String FREGUESIA = "freguesia";
      public static final String GEOGR_ID = "geogrId";
      public static final String ILHA = "ilha";
      public static final String NACIONALIDADE = "nacionalidade";
      public static final String NIVEL_DETALHE = "nivelDetalhe";
      public static final String NOME = "nome";
      public static final String NOME_NORM = "nomeNorm";
      public static final String NOME_OFICIAL = "nomeOficial";
      public static final String PAIS = "pais";
      public static final String SELF_ID = "selfId";
      public static final String SHORT_NOME = "shortNome";
      public static final String TP_GEOG_CD = "tpGeogCd";
      public static final String ZONA = "zona";

	  private Field() {}
	}
}