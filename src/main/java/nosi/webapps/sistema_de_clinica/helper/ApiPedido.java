package nosi.webapps.sistema_de_clinica.helper;

//import nosi.webapps.sistema_de_clinica.dao.CmTMarcacao;
import nosi.webapps.sistema_de_clinica.dao.CmTPedido;
import org.hibernate.Session;

import java.util.Date;

public class ApiPedido {
   private String  etapaAtual;
    private Date dataPedido;
    private String  estadoPedido;
    private Integer nrProcesso;
    private String processoKey;
    private String processoDesc;
    private String userPedido;
    private String idRelacao;
    private String tipoRelacao;

    public String getEtapaAtual() {
        return etapaAtual;
    }

    public void setEtapaAtual(String etapaAtual) {
        this.etapaAtual = etapaAtual;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }


    public Integer getNrProcesso() {
        return nrProcesso;
    }

    public void setNrProcesso(Integer nrProcesso) {
        this.nrProcesso = nrProcesso;
    }

    public String getProcessoKey() {
        return processoKey;
    }

    public void setProcessoKey(String processoKey) {
        this.processoKey = processoKey;
    }

    public String getProcessoDesc() {
        return processoDesc;
    }

    public void setProcessoDesc(String processoDesc) {
        this.processoDesc = processoDesc;
    }

    public String getUserPedido() {
        return userPedido;
    }

    public void setUserPedido(String userPedido) {
        this.userPedido = userPedido;
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

    public void update(Session session){
        CmTPedido _ped = new CmTPedido().find().keepConnection()
                .andWhere("nrProcesso", "=", this.nrProcesso)
                .one();

        if(_ped!= null && !_ped.hasError())
        {
            _ped.setEtapaAtual(this.etapaAtual);
            _ped.setEstadoPedido(this.estadoPedido);
            session.persist(_ped);
        }
    }

    public void save(Session session) {
        // Cria uma nova instância do objeto CmTPedido
        CmTPedido _ped = new CmTPedido();

        // Define os valores dos campos do objeto _ped com os valores atuais do objeto corrente (this)
        _ped.setEtapaAtual(this.etapaAtual); // Define a etapa atual do pedido
        _ped.setDataPedido(this.dataPedido); // Mantém a data do pedido do próprio objeto _ped
        _ped.setEstadoPedido(this.estadoPedido); // Define o estado atual do pedido
        _ped.setNrProcesso(this.nrProcesso); // Define o número do processo do pedido
        _ped.setProcessoKey(this.processoKey); // Define a chave do processo do pedido
        _ped.setProcessoDesc(this.processoDesc); // Define a descrição do processo do pedido
        _ped.setUserPedido(this.userPedido); // Define o usuário que fez o pedido
        _ped.setIdRelacao(this.idRelacao);
        _ped.setTipoRelacao(this.tipoRelacao);
        // Persiste o objeto _ped na sessão do Hibernate
        session.persist(_ped);
    }


}
