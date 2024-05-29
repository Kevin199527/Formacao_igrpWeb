package nosi.webapps.sistema_de_clinica.pages.listar_medico;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;
import java.util.Map;
import java.util.LinkedHashMap;

public class Listar_medicoView extends View {

	public Field nome;
	public Field numero_da_ordem_dos_medicos;
	public Field estado;
	public Field table_1_color_1;
	public Field foto;
	public Field nome_medico;
	public Field contacto;
	public Field numero;
	public Field id_medico;
	public IGRPForm form_1;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_novo_1;
	public IGRPButton btn_dashboard;
	public IGRPButton btn_pesquisar;
	public IGRPButton btn_editar;
	public IGRPButton btn_horarios_de_atendimento;
	public IGRPButton btn_ver_consultas_agendada;
	public IGRPButton btn_eliminar;

	public Listar_medicoView(){

		this.setPageTitle("Listar medico");
			
		form_1 = new IGRPForm("form_1","");

		table_1 = new IGRPTable("table_1","Listar Medico");

		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("Nome do medico")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		numero_da_ordem_dos_medicos = new NumberField(model,"numero_da_ordem_dos_medicos");
		numero_da_ordem_dos_medicos.setLabel(gt("Número da Ordem dos Médicos"));
		numero_da_ordem_dos_medicos.propertie().add("name","p_numero_da_ordem_dos_medicos").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("placeholder",gt("O número de registro do médico junto ao órgão regulador.")).add("desclabel","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		estado = new ListField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","ESTADO « sistema_de_clinica").add("maxlength","250").add("required","false").add("disabled","false").add("java-type","").add("tooltip","false").add("disable_copy_paste","false");
		
		table_1_color_1 = new ColorField(model,"table_1_color_1");
		table_1_color_1.setLabel(gt("Color"));
		table_1_color_1.propertie().add("name","p_table_1_color_1").add("type","color").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		foto = new TextField(model,"foto");
		foto.setLabel(gt("Foto"));
		foto.setValue(gt(""));
		foto.propertie().add("name","p_foto").add("type","img").add("img","../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg").add("width","").add("height","").add("croppie","false").add("rounded","false").add("autoupload","false").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		nome_medico = new TextField(model,"nome_medico");
		nome_medico.setLabel(gt("Nome"));
		nome_medico.propertie().add("name","p_nome_medico").add("type","text").add("maxlength","300").add("showLabel","true").add("group_in","");
		
		contacto = new TextField(model,"contacto");
		contacto.setLabel(gt("Contacto"));
		contacto.propertie().add("name","p_contacto").add("type","text").add("maxlength","30").add("showLabel","true").add("group_in","");
		
		numero = new NumberField(model,"numero");
		numero.setLabel(gt("Nº Ordem"));
		numero.propertie().add("name","p_numero").add("type","number").add("min","").add("max","").add("calculation","false").add("mathcal","").add("numberformat","").add("maxlength","300").add("showLabel","true").add("total_footer","false").add("group_in","").add("java-type","");
		
		id_medico = new HiddenField(model,"id_medico");
		id_medico.setLabel(gt(""));
		id_medico.propertie().add("name","p_id_medico").add("type","hidden").add("maxlength","30").add("showLabel","true").add("group_in","").add("java-type","Integer").add("tag","id_medico");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_novo_1 = new IGRPButton("Novo","sistema_de_clinica","Listar_medico","novo_1","modal|refresh","success|fa-plus","","");
		btn_novo_1.propertie.add("type","specific").add("rel","novo_1").add("refresh_components","");

		btn_dashboard = new IGRPButton("Dashboard","sistema_de_clinica","Listar_medico","dashboard","_newtab","primary|fa-dashboard","","");
		btn_dashboard.propertie.add("type","specific").add("rel","dashboard").add("refresh_components","");

		btn_pesquisar = new IGRPButton("Pesquisar","sistema_de_clinica","Listar_medico","pesquisar","submit","grey|fa-search","","");
		btn_pesquisar.propertie.add("id","button_6771_fcb9").add("type","form").add("class","grey").add("rel","pesquisar").add("refresh_components","table_1");

		btn_editar = new IGRPButton("Editar","sistema_de_clinica","Listar_medico","editar","modal","warning|fa-edit","","");
		btn_editar.propertie.add("id","button_f713_311b").add("type","specific").add("class","warning").add("rel","editar").add("refresh_components","");

		btn_horarios_de_atendimento = new IGRPButton("Horários de Atendimento","sistema_de_clinica","Listar_medico","horarios_de_atendimento","modal","primary|fa-calendar","","");
		btn_horarios_de_atendimento.propertie.add("id","button_5f00_2792").add("type","specific").add("class","primary").add("rel","horarios_de_atendimento").add("refresh_components","");

		btn_ver_consultas_agendada = new IGRPButton("Ver consultas agendada","sistema_de_clinica","Listar_medico","ver_consultas_agendada","modal","info|fa-eye","","");
		btn_ver_consultas_agendada.propertie.add("id","button_f6b7_a243").add("type","specific").add("class","info").add("rel","ver_consultas_agendada").add("refresh_components","");

		btn_eliminar = new IGRPButton("Eliminar","sistema_de_clinica","Listar_medico","eliminar","alert_submit","danger|fa-trash-o","","");
		btn_eliminar.propertie.add("id","button_35e8_4403").add("type","specific").add("class","danger").add("rel","eliminar").add("refresh_components","").add("labelConfirm","Deseja realmente realizar esta operação?");

		
	}
		
	@Override
	public void render(){
		
		form_1.addField(nome);
		form_1.addField(numero_da_ordem_dos_medicos);
		form_1.addField(estado);


		table_1.addField(table_1_color_1);
		table_1.addField(foto);
		table_1.addField(nome_medico);
		table_1.addField(contacto);
		table_1.addField(numero);
		table_1.addField(id_medico);
		/* start table_1 legend colors*/
		Map<Object, Map<String, String>> table_1_colors= new LinkedHashMap<>();
		Map<String, String> color_dc2b4c_table_1 = new LinkedHashMap<>();
		color_dc2b4c_table_1.put("#dc2b4c","Inativo");
		table_1_colors.put("I",color_dc2b4c_table_1);
		Map<String, String> color_95c11f_table_1 = new LinkedHashMap<>();
		color_95c11f_table_1.put("#95c11f","Ativo");
		table_1_colors.put("A",color_95c11f_table_1);
		this.table_1.setLegendColors(table_1_colors);
		/* end table_1 legend colors*/
		toolsbar_1.addButton(btn_novo_1);
		toolsbar_1.addButton(btn_dashboard);
		form_1.addButton(btn_pesquisar);
		table_1.addButton(btn_editar);
		table_1.addButton(btn_horarios_de_atendimento);
		table_1.addButton(btn_ver_consultas_agendada);
		table_1.addButton(btn_eliminar);
		this.addToPage(form_1);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome.setValue(model);
		numero_da_ordem_dos_medicos.setValue(model);
		estado.setValue(model);
		table_1_color_1.setValue(model);
		nome_medico.setValue(model);
		contacto.setValue(model);
		numero.setValue(model);
		id_medico.setValue(model);	

		table_1.loadModel(((Listar_medico) model).getTable_1());
		}
}
