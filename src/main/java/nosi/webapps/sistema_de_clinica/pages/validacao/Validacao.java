package nosi.webapps.sistema_de_clinica.pages.validacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Validacao extends Model{		

	@RParam(rParamName = "p_decisao")
	private String decisao;
	
	public void setDecisao(String decisao){
		this.decisao = decisao;
	}
	public String getDecisao(){
		return this.decisao;
	}



}
