package nosi.webapps.sistema_de_clinica.pages.despacho;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class DespachoView extends View {

	public Field parecer;
	public Field motivo;
	public IGRPForm form_1;


	public DespachoView(){

		this.setPageTitle("Despacho");
			
		form_1 = new IGRPForm("form_1","Despacho");

		parecer = new ListField(model,"parecer");
		parecer.setLabel(gt("Parecer"));
		parecer.propertie().add("name","p_parecer").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","PARECER_MEDICO « sistema_de_clinica").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		motivo = new TextAreaField(model,"motivo");
		motivo.setLabel(gt("Motivo"));
		motivo.propertie().add("name","p_motivo").add("type","textarea").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		


		
	}
		
	@Override
	public void render(){
		
		form_1.addField(parecer);
		form_1.addField(motivo);

		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		parecer.setValue(model);
		motivo.setValue(model);	

		}
}
