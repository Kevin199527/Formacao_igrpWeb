package nosi.webapps.sistema_de_clinica.pages.especialidade;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class EspecialidadeView extends View {

	public Field nome_especialidade;
	public Field estado;
	public IGRPFormList especialidade_form;


	public EspecialidadeView(){

		this.setPageTitle("Especialidade");
			
		especialidade_form = new IGRPFormList("especialidade_form","Especialidade");

		nome_especialidade = new TextField(model,"nome_especialidade");
		nome_especialidade.setLabel(gt("Nome Especialidade"));
		nome_especialidade.propertie().add("name","p_nome_especialidade").add("type","text").add("maxlength","230").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("inputmask","").add("desc","true");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","ESTADO « sistema_de_clinica").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("delimiter",";").add("desc","true");
		


		
	}
		
	@Override
	public void render(){
		
		especialidade_form.addField(nome_especialidade);
		especialidade_form.addField(estado);

		this.addToPage(especialidade_form);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome_especialidade.setValue(model);
		estado.setValue(model);	

		especialidade_form.loadModel(((Especialidade) model).getEspecialidade_form());
		}
}
