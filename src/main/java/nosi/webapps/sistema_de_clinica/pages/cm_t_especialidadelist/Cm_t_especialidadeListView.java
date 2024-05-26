package nosi.webapps.sistema_de_clinica.pages.cm_t_especialidadelist;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Cm_t_especialidadeListView extends View {

	public Field id;
	public Field nome;
	public Field estado;
	public IGRPTable table_1;

	public IGRPToolsBar toolsbar_1;
	public IGRPButton btn_new;
	public IGRPButton btn_update;
	public IGRPButton btn_delete;

	public Cm_t_especialidadeListView(){

		this.setPageTitle("Listar cm_t_especialidade");
			
		table_1 = new IGRPTable("table_1","Lista de Especialidade");

		id = new HiddenField(model,"id");
		id.setLabel(gt(""));
		id.propertie().add("name","p_id").add("type","hidden").add("java-type","Integer").add("maxlength","30").add("showLabel","true").add("group_in","").add("tag","id");
		
		nome = new TextField(model,"nome");
		nome.setLabel(gt("Nome"));
		nome.propertie().add("name","p_nome").add("type","text").add("maxlength","200").add("showLabel","true").add("group_in","");
		
		estado = new TextField(model,"estado");
		estado.setLabel(gt("Estado"));
		estado.propertie().add("name","p_estado").add("type","text").add("maxlength","3").add("showLabel","true").add("group_in","");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");

		btn_new = new IGRPButton("Novo","sistema_de_clinica","Cm_t_especialidadeList","new","modal|refresh","success|fa-plus","","");
		btn_new.propertie.add("type","specific").add("rel","new").add("refresh_components","");

		btn_update = new IGRPButton("Editar","sistema_de_clinica","Cm_t_especialidadeList","update","mpsubmit|refresh","warning|fa-pencil","","");
		btn_update.propertie.add("id","button_8d97_eedb").add("type","specific").add("class","warning").add("rel","update").add("refresh_components","");

		btn_delete = new IGRPButton("Eliminar","sistema_de_clinica","Cm_t_especialidadeList","delete","confirm","danger|fa-trash","","");
		btn_delete.propertie.add("id","button_e79f_16f0").add("type","specific").add("class","danger").add("rel","delete").add("refresh_components","").add("labelConfirm","Deseja realmente realizar esta operação?");

		
	}
		
	@Override
	public void render(){
		

		table_1.addField(id);
		table_1.addField(nome);
		table_1.addField(estado);

		toolsbar_1.addButton(btn_new);
		table_1.addButton(btn_update);
		table_1.addButton(btn_delete);
		this.addToPage(table_1);
		this.addToPage(toolsbar_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		id.setValue(model);
		nome.setValue(model);
		estado.setValue(model);	

		table_1.loadModel(((Cm_t_especialidadeList) model).getTable_1());
		}
}
