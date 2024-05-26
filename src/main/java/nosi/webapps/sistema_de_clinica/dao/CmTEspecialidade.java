package nosi.webapps.sistema_de_clinica.dao;

import jakarta.validation.constraints.Size;
import java.io.Serial;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.OneToMany;
import javax.persistence.NamedQuery;
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
@Table(name = "cm_t_especialidade", schema = "public")
@NamedQuery(name = "CmTEspecialidade.findAll", query = "SELECT t FROM CmTEspecialidade t")
public class CmTEspecialidade extends BaseActiveRecord<CmTEspecialidade> {

    @Serial
    private static final long serialVersionUID = 1L;

    public static final String TABLE_NAME = "CM_T_ESPECIALIDADE";

    // Change Integer type to BigDecimal if the number is very large

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@Size(max = 200)
	@Column(name = "nome")
	private String nome;
	@Size(max = 3)
	@Column(name = "estado")
	private String estado;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "especialidadeId")
	private List<CmTEspecialMedico> cmtespecialmedicoList;

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

   public String getEstado() {
      return this.estado;
   }

   public void setEstado(String estado) {
      this.estado = estado;
   }


   public static final class Field {
      public static final String ID = "id";
      public static final String NOME = "nome";
      public static final String ESTADO = "estado";

	  private Field() {}
	}
}