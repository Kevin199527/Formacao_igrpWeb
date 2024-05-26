package nosi.webapps.educart_cv.pages.aula_1;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Aula_1 extends Model{		

	@RParam(rParamName = "p_form_1_date_1")
	private String form_1_date_1;

	@RParam(rParamName = "p_form_1_select_1")
	private String form_1_select_1;
	
	private List<Table_1> table_1 = new ArrayList<>();	
	public void setTable_1(List<Table_1> table_1){
		this.table_1 = table_1;
	}
	public List<Table_1> getTable_1(){
		return this.table_1;
	}

	
	public void setForm_1_date_1(String form_1_date_1){
		this.form_1_date_1 = form_1_date_1;
	}
	public String getForm_1_date_1(){
		return this.form_1_date_1;
	}
	
	public void setForm_1_select_1(String form_1_select_1){
		this.form_1_select_1 = form_1_select_1;
	}
	public String getForm_1_select_1(){
		return this.form_1_select_1;
	}


	public static class Table_1 extends IGRPTable.Table{
		private String table_1_text_1;
		public void setTable_1_text_1(String table_1_text_1){
			this.table_1_text_1 = table_1_text_1;
		}
		public String getTable_1_text_1(){
			return this.table_1_text_1;
		}

	}

	public void loadTable_1(BaseQueryInterface query) {
		this.setTable_1(this.loadTable(query,Table_1.class));
	}

}
