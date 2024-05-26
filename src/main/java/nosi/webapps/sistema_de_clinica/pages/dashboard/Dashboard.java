package nosi.webapps.sistema_de_clinica.pages.dashboard;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;
import nosi.core.gui.components.IGRPChart2D;
import nosi.core.gui.components.IGRPChart3D;

public class Dashboard extends Model{		

	@RParam(rParamName = "p_date_de")
	private String date_de;

	@RParam(rParamName = "p_date_ate")
	private String date_ate;

	@RParam(rParamName = "p_especialidade")
	private String especialidade;

	@RParam(rParamName = "p_statbox_1_title")
	private String statbox_1_title;

	@RParam(rParamName = "p_statbox_1_val")
	private String statbox_1_val;

	@RParam(rParamName = "p_statbox_1_txt")
	private String statbox_1_txt;

	@RParam(rParamName = "p_statbox_1_url")
	private String statbox_1_url;

	@RParam(rParamName = "p_statbox_1_bg")
	private String statbox_1_bg;

	@RParam(rParamName = "p_statbox_1_icn")
	private String statbox_1_icn;

	@RParam(rParamName = "p_statbox_2_title")
	private String statbox_2_title;

	@RParam(rParamName = "p_statbox_2_val")
	private String statbox_2_val;

	@RParam(rParamName = "p_statbox_2_txt")
	private String statbox_2_txt;

	@RParam(rParamName = "p_statbox_2_url")
	private String statbox_2_url;

	@RParam(rParamName = "p_statbox_2_bg")
	private String statbox_2_bg;

	@RParam(rParamName = "p_statbox_2_icn")
	private String statbox_2_icn;
	
	private List<Grafico_de_barra> grafico_de_barra = new ArrayList<>();	
	public void setGrafico_de_barra(List<Grafico_de_barra> grafico_de_barra){
		this.grafico_de_barra = grafico_de_barra;
	}
	public List<Grafico_de_barra> getGrafico_de_barra(){
		return this.grafico_de_barra;
	}

	
	private List<Grafico_de_pizza> grafico_de_pizza = new ArrayList<>();	
	public void setGrafico_de_pizza(List<Grafico_de_pizza> grafico_de_pizza){
		this.grafico_de_pizza = grafico_de_pizza;
	}
	public List<Grafico_de_pizza> getGrafico_de_pizza(){
		return this.grafico_de_pizza;
	}

	
	private List<Grafico_de_linha> grafico_de_linha = new ArrayList<>();	
	public void setGrafico_de_linha(List<Grafico_de_linha> grafico_de_linha){
		this.grafico_de_linha = grafico_de_linha;
	}
	public List<Grafico_de_linha> getGrafico_de_linha(){
		return this.grafico_de_linha;
	}

	
	public void setDate_de(String date_de){
		this.date_de = date_de;
	}
	public String getDate_de(){
		return this.date_de;
	}
	
	public void setDate_ate(String date_ate){
		this.date_ate = date_ate;
	}
	public String getDate_ate(){
		return this.date_ate;
	}
	
	public void setEspecialidade(String especialidade){
		this.especialidade = especialidade;
	}
	public String getEspecialidade(){
		return this.especialidade;
	}
	
	public void setStatbox_1_title(String statbox_1_title){
		this.statbox_1_title = statbox_1_title;
	}
	public String getStatbox_1_title(){
		return this.statbox_1_title;
	}
	
	public void setStatbox_1_val(String statbox_1_val){
		this.statbox_1_val = statbox_1_val;
	}
	public String getStatbox_1_val(){
		return this.statbox_1_val;
	}
	
	public void setStatbox_1_txt(String statbox_1_txt){
		this.statbox_1_txt = statbox_1_txt;
	}
	public String getStatbox_1_txt(){
		return this.statbox_1_txt;
	}
	
	public void setStatbox_1_url(String statbox_1_url){
		this.statbox_1_url = statbox_1_url;
	}
	public String getStatbox_1_url(){
		return this.statbox_1_url;
	}
	
	public void setStatbox_1_bg(String statbox_1_bg){
		this.statbox_1_bg = statbox_1_bg;
	}
	public String getStatbox_1_bg(){
		return this.statbox_1_bg;
	}
	
	public void setStatbox_1_icn(String statbox_1_icn){
		this.statbox_1_icn = statbox_1_icn;
	}
	public String getStatbox_1_icn(){
		return this.statbox_1_icn;
	}
	
	public void setStatbox_2_title(String statbox_2_title){
		this.statbox_2_title = statbox_2_title;
	}
	public String getStatbox_2_title(){
		return this.statbox_2_title;
	}
	
	public void setStatbox_2_val(String statbox_2_val){
		this.statbox_2_val = statbox_2_val;
	}
	public String getStatbox_2_val(){
		return this.statbox_2_val;
	}
	
	public void setStatbox_2_txt(String statbox_2_txt){
		this.statbox_2_txt = statbox_2_txt;
	}
	public String getStatbox_2_txt(){
		return this.statbox_2_txt;
	}
	
	public void setStatbox_2_url(String statbox_2_url){
		this.statbox_2_url = statbox_2_url;
	}
	public String getStatbox_2_url(){
		return this.statbox_2_url;
	}
	
	public void setStatbox_2_bg(String statbox_2_bg){
		this.statbox_2_bg = statbox_2_bg;
	}
	public String getStatbox_2_bg(){
		return this.statbox_2_bg;
	}
	
	public void setStatbox_2_icn(String statbox_2_icn){
		this.statbox_2_icn = statbox_2_icn;
	}
	public String getStatbox_2_icn(){
		return this.statbox_2_icn;
	}


	public static class Grafico_de_barra extends IGRPChart3D{
		public Grafico_de_barra(String eixoX, String eixoY, Object eixoZ) {
			super(eixoX, eixoY,eixoZ);
		}
		public Grafico_de_barra() {
		}
	}
	public static class Grafico_de_pizza extends IGRPChart2D{
		public Grafico_de_pizza(String eixoX, Object eixoY) {
			super(eixoX, eixoY);
		}
		public Grafico_de_pizza() {
		}
	}
	public static class Grafico_de_linha extends IGRPChart3D{
		public Grafico_de_linha(String eixoX, String eixoY, Object eixoZ) {
			super(eixoX, eixoY,eixoZ);
		}
		public Grafico_de_linha() {
		}
	}

	public void loadGrafico_de_barra(BaseQueryInterface query) {
		this.setGrafico_de_barra(this.loadTable(query,Grafico_de_barra.class));
	}

	public void loadGrafico_de_pizza(BaseQueryInterface query) {
		this.setGrafico_de_pizza(this.loadTable(query,Grafico_de_pizza.class));
	}

	public void loadGrafico_de_linha(BaseQueryInterface query) {
		this.setGrafico_de_linha(this.loadTable(query,Grafico_de_linha.class));
	}

}
