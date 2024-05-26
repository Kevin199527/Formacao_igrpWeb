package nosi.webapps.sistema_de_clinica.pages.validacao;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class ValidacaoView extends View {

	public Field decisao;
	public IGRPForm form_1;


	public ValidacaoView(){

		this.setPageTitle("Validação");
			
		form_1 = new IGRPForm("form_1","Validação");

		decisao = new ListField(model,"decisao");
		decisao.setLabel(gt("Decisao"));
		decisao.propertie().add("name","p_decisao").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","DECISAO_ATENDEDOR « sistema_de_clinica").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		


		
	}
		
	@Override
	public void render(){
		
		form_1.addField(decisao);

		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		decisao.setValue(model);	

		}
}
