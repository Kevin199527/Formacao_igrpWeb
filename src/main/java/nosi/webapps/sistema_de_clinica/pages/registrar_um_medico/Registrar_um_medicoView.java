package nosi.webapps.sistema_de_clinica.pages.registrar_um_medico;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Registrar_um_medicoView extends View {

	public Field foto;
	public Field nome;
	public Field numero_da_ordem_dos_medicos;
	public Field telefones;
	public Field especialidade;
	public Field estado;
	public Field estado_check;
	public Field id_medico;
	public IGRPForm form_1;

	public IGRPButton btn_registrar;

	public Registrar_um_medicoView(){

		this.setPageTitle("Registrar Medico");
			
		form_1 = new IGRPForm("form_1","Registrar Medico");

		foto = new TextField(model,"foto");
		foto.setLabel(gt("Foto"));
		foto.setValue(gt("../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg"));
		foto.propertie().add("name","p_foto").add("type","img").add("img","../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","").add("height","").add("croppie","true").add("rounded","false").add("autoupload","true").add("maxlength","250").add("placeholder",gt("Introduzir Foto do medico ")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("Nome do medico")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		numero_da_ordem_dos_medicos = new NumberField(model,"numero_da_ordem_dos_medicos");
		numero_da_ordem_dos_medicos.setLabel(gt("Número da Ordem dos Médicos"));
		numero_da_ordem_dos_medicos.propertie().add("name","p_numero_da_ordem_dos_medicos").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("O número de registro do médico junto ao órgão regulador.")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		telefones = new TextField(model,"telefones");
		telefones.setLabel(gt("Telefones"));
		telefones.propertie().add("name","p_telefones").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("Telefone")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		especialidade = new ListField(model,"especialidade");
		especialidade.setLabel(gt("Especialidade"));
		especialidade.propertie().add("name","p_especialidade").add("type","select").add("multiple","true").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		estado = new CheckBoxField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("tooltip","false").add("disable_copy_paste","false").add("switch","true").add("check","true");
		
		id_medico = new HiddenField(model,"id_medico");
		id_medico.setLabel(gt(""));
		id_medico.propertie().add("name","p_id_medico").add("type","hidden").add("maxlength","250").add("java-type","Integer").add("tooltip","false").add("disable_copy_paste","false").add("tag","id_medico");
		


		btn_registrar = new IGRPButton("Registrar","sistema_de_clinica","Registrar_um_medico","registrar","submit","success|fa-save","","");
		btn_registrar.propertie.add("id","button_fe17_4950").add("type","form").add("class","success").add("rel","registrar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(foto);
		form_1.addField(nome);
		form_1.addField(numero_da_ordem_dos_medicos);
		form_1.addField(telefones);
		form_1.addField(especialidade);
		form_1.addField(estado);
		form_1.addField(id_medico);

		form_1.addButton(btn_registrar);
		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		numero_da_ordem_dos_medicos.setValue(model);
		telefones.setValue(model);
		especialidade.setValue(model);
		estado.setValue(model);
		id_medico.setValue(model);	

		}
}
