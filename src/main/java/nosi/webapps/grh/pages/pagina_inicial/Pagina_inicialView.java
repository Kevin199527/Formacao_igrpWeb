package nosi.webapps.grh.pages.pagina_inicial;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Pagina_inicialView extends View {

	public Field nome;
	public Field email;
	public Field username;
	public Field telefone;
	public Field telemovel;
	public Field cni;
	public Field view_1_img;
	public Field separatorlist_1_text_1;
	public Field separatorlist_1_select_1;
	public IGRPView view_1;
	public IGRPSeparatorList separatorlist_1;
	public IGRPForm form_1;

	public IGRPButton btn_editar;
	public IGRPButton btn_excluir;

	public Pagina_inicialView(){

		this.setPageTitle("Pagina Inicial");
			
		view_1 = new IGRPView("view_1","");

		separatorlist_1 = new IGRPSeparatorList("separatorlist_1","");

		form_1 = new IGRPForm("form_1","");

		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("class","default").add("img","fa-user").add("showlabel","true");
		
		email = new EmailField(model,"email");
		email.setLabel(gt("Email"));
		email.propertie().add("name","p_email").add("type","email").add("maxlength","250").add("class","default").add("img","fa-at").add("showlabel","true");
		
		username = new EmailField(model,"username");
		username.setLabel(gt("Username"));
		username.propertie().add("name","p_username").add("type","email").add("maxlength","250").add("class","default").add("img","fa-user-circle").add("showlabel","true");
		
		telefone = new NumberField(model,"telefone");
		telefone.setLabel(gt("Telefone"));
		telefone.propertie().add("name","p_telefone").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("class","default").add("img","fa-phone").add("showlabel","true");
		
		telemovel = new NumberField(model,"telemovel");
		telemovel.setLabel(gt("Telemovel"));
		telemovel.propertie().add("name","p_telemovel").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("class","default").add("img","fa-mobile").add("showlabel","true");
		
		cni = new TextField(model,"cni");
		cni.setLabel(gt("CNI"));
		cni.propertie().add("name","p_cni").add("type","text").add("maxlength","250").add("class","default").add("img","fa-address-card").add("showlabel","true");
		
		view_1_img = new TextField(model,"view_1_img");
		view_1_img.setLabel(gt(""));
		view_1_img.propertie().add("type","text").add("name","p_view_1_img").add("maxlength","300");
		
		separatorlist_1_text_1 = new TextField(model,"separatorlist_1_text_1");
		separatorlist_1_text_1.setLabel(gt("Text"));
		separatorlist_1_text_1.propertie().add("name","p_separatorlist_1_text_1").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		separatorlist_1_select_1 = new ListField(model,"separatorlist_1_select_1");
		separatorlist_1_select_1.setLabel(gt("Select"));
		separatorlist_1_select_1.propertie().add("name","p_separatorlist_1_select_1").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","ESTADO « grh").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("desc","true");
		


		btn_editar = new IGRPButton("Editar","grh","Pagina_inicial","editar","_blank","warning|fa-edit","","");
		btn_editar.propertie.add("id","button_f197_91f6").add("type","form").add("flg_transaction","true").add("class","warning").add("rel","editar").add("refresh_components","");

		btn_excluir = new IGRPButton("Excluir","grh","Pagina_inicial","excluir","_blank","danger|fa-times","","");
		btn_excluir.propertie.add("id","button_4b09_a5b8").add("type","form").add("flg_transaction","true").add("class","danger").add("rel","excluir").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		view_1.addField(nome);
		view_1.addField(email);
		view_1.addField(username);
		view_1.addField(telefone);
		view_1.addField(telemovel);
		view_1.addField(cni);
		view_1.addField(view_1_img);

		separatorlist_1.addField(separatorlist_1_text_1);
		separatorlist_1.addField(separatorlist_1_select_1);


		form_1.addButton(btn_editar);
		form_1.addButton(btn_excluir);
		this.addToPage(view_1);
		this.addToPage(separatorlist_1);
		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		email.setValue(model);
		username.setValue(model);
		telefone.setValue(model);
		telemovel.setValue(model);
		cni.setValue(model);
		view_1_img.setValue(model);
		separatorlist_1_text_1.setValue(model);
		separatorlist_1_select_1.setValue(model);	

		separatorlist_1.loadModel(((Pagina_inicial) model).getSeparatorlist_1());
		}
}
