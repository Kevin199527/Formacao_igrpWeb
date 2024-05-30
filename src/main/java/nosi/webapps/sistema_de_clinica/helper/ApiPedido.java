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

    public void save(Session session){
        CmTPedido _ped = new CmTPedido();
        _ped.setEtapaAtual(this.etapaAtual);
        _ped.setDataPedido(_ped.getDataPedido());
        _ped.setEstadoPedido(this.estadoPedido);
        _ped.setNrProcesso(this.nrProcesso);
        _ped.setProcessoKey(this.processoKey);
        _ped.setProcessoDesc(this.processoDesc);
        _ped.setUserPedido(this.userPedido);
        session.persist(_ped);
    }

}
