package nosi.webapps.sistema_de_clinica.pages.identificacao_do_paciente;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Identificacao_do_pacienteView extends View {

	public Field nome;
	public Field data_nascimento;
	public Field tipo_documento_;
	public Field numero_documento;
	public Field informacao_adicional;
	public Field primeira_consulta_;
	public Field data_adicional;
	public Field nome_de_mae;
	public Field nome_de_pai;
	public Field tipo_documento;
	public IGRPForm form_1;


	public Identificacao_do_pacienteView(){

		this.setPageTitle("Identificação do Paciente");
			
		form_1 = new IGRPForm("form_1","Identificação do Paciente");

		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		data_nascimento = new DateField(model,"data_nascimento");
		data_nascimento.setLabel(gt("Data Nascimento"));
		data_nascimento.propertie().add("name","p_data_nascimento").add("type","date").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false").add("class","primary");
		
		tipo_documento_ = new ListField(model,"tipo_documento_");
		tipo_documento_.setLabel(gt("Tipo Documento "));
		tipo_documento_.propertie().add("name","p_tipo_documento_").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","TP_DOCUMENTO « sistema_de_clinica").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		numero_documento = new NumberField(model,"numero_documento");
		numero_documento.setLabel(gt("Numero Documento"));
		numero_documento.propertie().add("name","p_numero_documento").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		informacao_adicional = new SeparatorField(model,"informacao_adicional");
		informacao_adicional.setLabel(gt("Informacao Adicional"));
		informacao_adicional.propertie().add("name","p_informacao_adicional").add("type","separator").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		primeira_consulta_ = new RadioListField(model,"primeira_consulta_");
		primeira_consulta_.setLabel(gt("Primeira Consulta? "));
		primeira_consulta_.propertie().add("name","p_primeira_consulta_").add("type","radiolist").add("domain","SIM_NAO « sistema_de_clinica").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("child_size","1").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		data_adicional = new DateField(model,"data_adicional");
		data_adicional.setLabel(gt("Data Ultima Consulta"));
		data_adicional.propertie().add("name","p_data_adicional").add("type","date").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false").add("class","primary");
		
		nome_de_mae = new TextField(model,"nome_de_mae");
		nome_de_mae.setLabel(gt("Nome de Mãe"));
		nome_de_mae.propertie().add("name","p_nome_de_mae").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		nome_de_pai = new TextField(model,"nome_de_pai");
		nome_de_pai.setLabel(gt("Nome de Pai"));
		nome_de_pai.propertie().add("name","p_nome_de_pai").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		tipo_documento = new ListField(model,"tipo_documento");
		tipo_documento.setLabel(gt("Tipo Documento"));
		tipo_documento.propertie().add("name","p_tipo_documento").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","TP_DOCUMENTO « sistema_de_clinica").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		


		
	}
		
	@Override
	public void render(){
		
		form_1.addField(nome);
		form_1.addField(data_nascimento);
		form_1.addField(tipo_documento_);
		form_1.addField(numero_documento);
		form_1.addField(informacao_adicional);
		form_1.addField(primeira_consulta_);
		form_1.addField(data_adicional);
		form_1.addField(nome_de_mae);
		form_1.addField(nome_de_pai);
		form_1.addField(tipo_documento);

		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		data_nascimento.setValue(model);
		tipo_documento_.setValue(model);
		numero_documento.setValue(model);
		informacao_adicional.setValue(model);
		primeira_consulta_.setValue(model);
		data_adicional.setValue(model);
		nome_de_mae.setValue(model);
		nome_de_pai.setValue(model);
		tipo_documento.setValue(model);	

		}
}
