package nosi.webapps.sistema_de_clinica.pages.dashboard;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class DashboardView extends View {

	public Field date_de;
	public Field date_ate;
	public Field especialidade;
	public Field statbox_1_title;
	public Field statbox_1_val;
	public Field statbox_1_txt;
	public Field statbox_1_url;
	public Field statbox_1_bg;
	public Field statbox_1_icn;
	public Field statbox_2_title;
	public Field statbox_2_val;
	public Field statbox_2_txt;
	public Field statbox_2_url;
	public Field statbox_2_bg;
	public Field statbox_2_icn;
	public IGRPForm form_1;
	public IGRPStatBox statbox_1;
	public IGRPChart grafico_de_barra;
	public IGRPStatBox statbox_2;
	public IGRPChart grafico_de_pizza;
	public IGRPChart grafico_de_linha;

	public IGRPButton btn_pesquisar;

	public DashboardView(){

		this.setPageTitle("Dashboard");
			
		form_1 = new IGRPForm("form_1","Estatística Consulta");

		statbox_1 = new IGRPStatBox("statbox_1","");

		grafico_de_barra = new IGRPChart("grafico_de_barra","Distribuição de Consulta por Local");

		statbox_2 = new IGRPStatBox("statbox_2","");

		grafico_de_pizza = new IGRPChart("grafico_de_pizza","Total de Consulta por Estado");

		grafico_de_linha = new IGRPChart("grafico_de_linha","Distribuição de Consulta por Especialidade em Cada Ano");

		date_de = new DateField(model,"date_de");
		date_de.setLabel(gt("Date De"));
		date_de.propertie().add("name","p_date_de").add("type","date").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false").add("class","primary");
		
		date_ate = new DateField(model,"date_ate");
		date_ate.setLabel(gt("Date Ate"));
		date_ate.propertie().add("name","p_date_ate").add("type","date").add("range","false").add("disableWeekends","false").add("disabledBeforetoday","false").add("daysoff","false").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false").add("class","primary");
		
		especialidade = new ListField(model,"especialidade");
		especialidade.setLabel(gt("Especialidade"));
		especialidade.propertie().add("name","p_especialidade").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		statbox_1_title = new TextField(model,"statbox_1_title");
		statbox_1_title.setLabel(gt("Box Title"));
		statbox_1_title.propertie().add("name","p_statbox_1_title").add("type","text").add("maxlength","4000");
		
		statbox_1_val = new TextField(model,"statbox_1_val");
		statbox_1_val.setLabel(gt("Value"));
		statbox_1_val.propertie().add("name","p_statbox_1_val").add("type","text").add("maxlength","4000");
		
		statbox_1_txt = new TextField(model,"statbox_1_txt");
		statbox_1_txt.setLabel(gt("Url Text"));
		statbox_1_txt.propertie().add("name","p_statbox_1_txt").add("type","text").add("maxlength","4000");
		
		statbox_1_url = new TextField(model,"statbox_1_url");
		statbox_1_url.setLabel(gt("Url"));
		statbox_1_url.propertie().add("name","p_statbox_1_url").add("type","text").add("maxlength","4000");
		
		statbox_1_bg = new TextField(model,"statbox_1_bg");
		statbox_1_bg.setLabel(gt("Background"));
		statbox_1_bg.propertie().add("name","p_statbox_1_bg").add("type","text").add("maxlength","4000");
		
		statbox_1_icn = new TextField(model,"statbox_1_icn");
		statbox_1_icn.setLabel(gt("Icon"));
		statbox_1_icn.setValue(gt("fa-check"));
		statbox_1_icn.propertie().add("name","p_statbox_1_icn").add("type","text").add("maxlength","4000");
		
		statbox_2_title = new TextField(model,"statbox_2_title");
		statbox_2_title.setLabel(gt("Box Title"));
		statbox_2_title.propertie().add("name","p_statbox_2_title").add("type","text").add("maxlength","4000");
		
		statbox_2_val = new TextField(model,"statbox_2_val");
		statbox_2_val.setLabel(gt("Value"));
		statbox_2_val.propertie().add("name","p_statbox_2_val").add("type","text").add("maxlength","4000");
		
		statbox_2_txt = new TextField(model,"statbox_2_txt");
		statbox_2_txt.setLabel(gt("Url Text"));
		statbox_2_txt.propertie().add("name","p_statbox_2_txt").add("type","text").add("maxlength","4000");
		
		statbox_2_url = new TextField(model,"statbox_2_url");
		statbox_2_url.setLabel(gt("Url"));
		statbox_2_url.propertie().add("name","p_statbox_2_url").add("type","text").add("maxlength","4000");
		
		statbox_2_bg = new TextField(model,"statbox_2_bg");
		statbox_2_bg.setLabel(gt("Background"));
		statbox_2_bg.propertie().add("name","p_statbox_2_bg").add("type","text").add("maxlength","4000");
		
		statbox_2_icn = new TextField(model,"statbox_2_icn");
		statbox_2_icn.setLabel(gt("Icon"));
		statbox_2_icn.setValue(gt("fa-check"));
		statbox_2_icn.propertie().add("name","p_statbox_2_icn").add("type","text").add("maxlength","4000");
		


		btn_pesquisar = new IGRPButton("Pesquisar","sistema_de_clinica","Dashboard","pesquisar","_blank","info|fa-search","","");
		btn_pesquisar.propertie.add("id","button_6e35_d142").add("type","form").add("class","info").add("rel","pesquisar").add("refresh_components","");

		
		grafico_de_barra.setCaption("");
		grafico_de_barra.setChart_type("column");
		grafico_de_barra.setXaxys("Eixo de X");
		grafico_de_barra.setYaxys("Eixo de Y");
		grafico_de_barra.setUrl("#");
		//ex: grafico_de_barra.addColor("#1fcb43").addColor("#852c47").addColor("#825bd2").addColor("#ff5ad1");

		grafico_de_pizza.setCaption("");
		grafico_de_pizza.setChart_type("pie");
		grafico_de_pizza.setXaxys("Eixo de X");
		grafico_de_pizza.setYaxys("Eixo de Y");
		grafico_de_pizza.setUrl("#");
		//ex: grafico_de_pizza.addColor("#fb5eb5").addColor("#71098b").addColor("#094737").addColor("#559281");

		grafico_de_linha.setCaption("");
		grafico_de_linha.setChart_type("line");
		grafico_de_linha.setXaxys("Eixo de X");
		grafico_de_linha.setYaxys("Eixo de Y");
		grafico_de_linha.setUrl("#");
		//ex: grafico_de_linha.addColor("#be7fa8").addColor("#9a1408").addColor("#09da43").addColor("#5d0755");

	}
		
	@Override
	public void render(){
		
		form_1.addField(date_de);
		form_1.addField(date_ate);
		form_1.addField(especialidade);

		statbox_1.addField(statbox_1_title);
		statbox_1.addField(statbox_1_val);
		statbox_1.addField(statbox_1_txt);
		statbox_1.addField(statbox_1_url);
		statbox_1.addField(statbox_1_bg);
		statbox_1.addField(statbox_1_icn);


		statbox_2.addField(statbox_2_title);
		statbox_2.addField(statbox_2_val);
		statbox_2.addField(statbox_2_txt);
		statbox_2.addField(statbox_2_url);
		statbox_2.addField(statbox_2_bg);
		statbox_2.addField(statbox_2_icn);



		form_1.addButton(btn_pesquisar);
		this.addToPage(form_1);
		this.addToPage(statbox_1);
		this.addToPage(grafico_de_barra);
		this.addToPage(statbox_2);
		this.addToPage(grafico_de_pizza);
		this.addToPage(grafico_de_linha);
	}
		
	@Override
	public void setModel(Model model) {
		
		date_de.setValue(model);
		date_ate.setValue(model);
		especialidade.setValue(model);
		statbox_1_title.setValue(model);
		statbox_1_val.setValue(model);
		statbox_1_txt.setValue(model);
		statbox_1_url.setValue(model);
		statbox_1_bg.setValue(model);
		statbox_2_title.setValue(model);
		statbox_2_val.setValue(model);
		statbox_2_txt.setValue(model);
		statbox_2_url.setValue(model);
		statbox_2_bg.setValue(model);	

		grafico_de_barra.loadModel(((Dashboard) model).getGrafico_de_barra());
		grafico_de_pizza.loadModel(((Dashboard) model).getGrafico_de_pizza());
		grafico_de_linha.loadModel(((Dashboard) model).getGrafico_de_linha());
		}
}
