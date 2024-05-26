package nosi.webapps.sistema_de_clinica.pages.despacho;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

import nosi.core.validator.constraints.*;

public class Despacho extends Model{		

	@NotNull()
	@RParam(rParamName = "p_parecer")
	private String parecer;

	@RParam(rParamName = "p_motivo")
	private String motivo;
	
	public void setParecer(String parecer){
		this.parecer = parecer;
	}
	public String getParecer(){
		return this.parecer;
	}
	
	public void setMotivo(String motivo){
		this.motivo = motivo;
	}
	public String getMotivo(){
		return this.motivo;
	}



}
