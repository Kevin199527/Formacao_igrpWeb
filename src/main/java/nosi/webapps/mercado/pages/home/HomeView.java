package nosi.webapps.mercado.pages.home;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class HomeView extends View {

	public Field nome;
	public Field data_nascimento;
	public Field n_documento;
	public IGRPForm form_1;


	public HomeView(){

		this.setPageTitle("Home");
			
		form_1 = new IGRPForm("form_1","");

		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		data_nascimento = new DateField(model,"data_nascimento");
		data_nascimento.setLabel(gt("Data Nascimento"));
		data_nascimento.propertie().add("name","p_data_nascimento").add("type","date").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false").add("class","success");
		
		n_documento = new NumberField(model,"n_documento");
		n_documento.setLabel(gt("Nª Documento"));
		n_documento.propertie().add("name","p_n_documento").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		


		
	}
		
	@Override
	public void render(){
		
		form_1.addField(nome);
		form_1.addField(data_nascimento);
		form_1.addField(n_documento);

		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		data_nascimento.setValue(model);
		n_documento.setValue(model);	

		}
}
