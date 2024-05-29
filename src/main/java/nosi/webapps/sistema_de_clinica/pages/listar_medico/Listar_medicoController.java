package nosi.webapps.sistema_de_clinica.pages.listar_medico;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.util.ArrayList;
import java.util.List;

import nosi.webapps.sistema_de_clinica.dao.CmTEspecialMedico;
import nosi.webapps.sistema_de_clinica.dao.CmTMedico;

/*----#end-code----*/
		
public class Listar_medicoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Listar_medico();
		model.load();
		var view = new Listar_medicoView();
		view.id_medico.setParam(true);
		view.estado.loadDomain("ESTADO","sistema_de_clinica","-- Selecionar --");
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadTable_1(Core.query(null,"SELECT 'A' as table_1_color_1,'../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg' as foto,'Adipiscing deserunt doloremque magna sed' as nome_medico,'Aperiam totam anim totam dolor' as contacto,'226' as numero,'hidden-b30b_30d6' as id_medico "));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/

		// Busca uma lista de objetos CmTMedico com base nos critérios fornecidos
		List<CmTMedico> medicoList = new CmTMedico().find()
				.andWhere("nome", "=", model.getNome())
				.andWhere("estado", "=", model.getEstado()).all();

	// Inicializa uma lista para armazenar os resultados formatados para exibição na tabela
		List<Listar_medico.Table_1> table1List = new ArrayList<>();

	// Verifica se a lista de médicos não está vazia
		if (Core.isNotNull(medicoList)) {
			// Itera sobre cada objeto CmTMedico na lista
			for (CmTMedico medico : medicoList) {
				// Cria um novo objeto da classe Table_1 para representar uma linha na tabela
				Listar_medico.Table_1 row = new Listar_medico.Table_1();

				// Define os atributos do objeto Table_1 com base nos dados do médico atual
				row.setId_medico(medico.getId());
				row.setNome_medico(medico.getNome());
				row.setNumero(medico.getNumeroOrdem());
				row.setContacto(medico.getTelefone());

				// Verifica se o médico possui uma foto e, se sim, define o link da foto no objeto Table_1
				row.setFoto(Core.isNotNull(medico.getFoto()) ? Core.getLinkFileByUuid(medico.getFoto()) : "");

				// Define a cor da linha com base no estado do médico
				row.setTable_1_color_1(medico.getEstado());

				// Adiciona o objeto Table_1 à lista de resultados
				table1List.add(row);
			}
		}

	// Define a lista formatada como parte do modelo para uso na visualização
		model.setTable_1(table1List);

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionNovo_1() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Listar_medico();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_medico",Core.getParam("p_id_medico"));
		  return this.forward("sistema_de_clinica","Registrar_um_medico","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (novo_1)  *//* End-Code-Block  */
		/*----#start-code(novo_1)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sistema_de_clinica","Registrar_um_medico","index", this.queryString());	
	}
	
	public Response actionDashboard() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Listar_medico();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_medico",Core.getParam("p_id_medico"));
		  return this.forward("sistema_de_clinica","Dashboard","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (dashboard)  *//* End-Code-Block  */
		/*----#start-code(dashboard)----*/
		
		
		/*----#end-code----*/
		return this.redirect("sistema_de_clinica","Dashboard","index", this.queryString());	
	}
	
	public Response actionPesquisar() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Listar_medico();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_medico",Core.getParam("p_id_medico"));
		  return this.forward("sistema_de_clinica","Listar_medico","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (pesquisar)  *//* End-Code-Block  */
		/*----#start-code(pesquisar)----*/
		 return this.forward("sistema_de_clinica","Listar_medico","index",this.queryString());
		
		/*----#end-code----*/
			
	}
	
	public Response actionEditar() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Listar_medico();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_medico",Core.getParam("p_id_medico"));
		  return this.forward("sistema_de_clinica","Registrar_um_medico","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (editar)  *//* End-Code-Block  */
		/*----#start-code(editar)----*/
			/* É necessario para poder fazer a editaçao no nosso registro */
		this.addQueryString("p_id_medico", Core.getParamInt("p_id_medico"));
		
		/*----#end-code----*/
		return this.redirect("sistema_de_clinica","Registrar_um_medico","index", this.queryString());	
	}
	
	public Response actionHorarios_de_atendimento() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Listar_medico();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_medico",Core.getParam("p_id_medico"));
		  return this.forward("sistema_de_clinica","Agendamento_de_consulta","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (horarios_de_atendimento)  *//* End-Code-Block  */
		/*----#start-code(horarios_de_atendimento)----*/

		this.addQueryString("p_id_medico", Core.getParam("p_id_medico"));
		/*----#end-code----*/
		return this.redirect("sistema_de_clinica","Agendamento_de_consulta","index", this.queryString());	
	}
	
	public Response actionVer_consultas_agendada() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Listar_medico();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_medico",Core.getParam("p_id_medico"));
		  return this.forward("sistema_de_clinica","Consultas_marcadas","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (ver_consultas_agendada)  *//* End-Code-Block  */
		/*----#start-code(ver_consultas_agendada)----*/
		this.addQueryString("p_id_medico", Core.getParam("p_id_medico"));


		/*----#end-code----*/
		return this.redirect("sistema_de_clinica","Consultas_marcadas","index", this.queryString());	
	}
	
	public Response actionEliminar() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Listar_medico();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  this.addQueryString("p_id_medico",Core.getParam("p_id_medico"));
		  return this.forward("sistema_de_clinica","Listar_medico","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (eliminar)  *//* End-Code-Block  */
		/*----#start-code(eliminar)----*/

		/*try {
			Core.delete(Core.defaultConnection(), "cm_t_especial_medico")
					.where("medico_id", "=", Core.getParamInt("p_id_medico")).execute();

			Core.delete(Core.defaultConnection(), "cm_t_medico")
					.where("id", "=", Core.getParamInt("p_id_medico")).execute();

			Core.setMessageSuccess("Medico Eliminado com Sucesso!");
		}catch (Exception e){
			Core.setMessageError(""+e);
		}*/
		/*// Obtém uma instância de CmTMedico com base no ID do médico fornecido como parâmetro
		CmTMedico cmtmedico = new CmTMedico().findOne(Core.getParamInt("p_id_medico"));

		// Verifica se a instância de CmTMedico foi encontrada e se não contém erros
		if (cmtmedico != null && !cmtmedico.hasError()) {

			// Deleta todas as entradas na tabela "cm_t_especial_medico" relacionadas ao médico especificado
			Core.delete(Core.defaultConnection(), "cm_t_especial_medico")
					.where("medico_id", "=", Core.getParamInt("p_id_medico"))
					.execute();

			// Tenta deletar a entrada do médico da tabela "CmTMedico"
			if (cmtmedico.delete(Core.getParamInt("p_id_medico"))) {
				// Se a deleção for bem-sucedida, exibe uma mensagem de sucesso
				Core.setMessageSuccess("Médico Deletado com Sucesso!");
			} else {
				// Se ocorrer um erro durante a deleção, exibe uma mensagem de erro
				Core.setMessageError("Erro no processo de deletar o Médico!");
			}
		} else {
			// Se o médico não for encontrado ou houver um erro ao buscar o médico, exibe uma mensagem de erro
			Core.setMessageError("Médico não encontrado ou erro ao buscar o Médico!");
		}*/


		List<CmTEspecialMedico> especialMedicoList = new CmTEspecialMedico()
				.find().andWhere("medicoId.id","=",
						Core.getParamInt("p_id_medico")).all();
		if(Core.isNotNull(especialMedicoList)
				&& !especialMedicoList.isEmpty()){
			for(CmTEspecialMedico especialMedico : especialMedicoList){
				especialMedico.delete();
			}
		}
		CmTMedico medico = new CmTMedico()
				.findOne(Core.getParamInt("p_id_medico"));
		if(Core.isNotNull(medico) && !medico.hasError()){
			if(medico.delete())
				Core.setMessageSuccess();
			else Core.setMessageError();
		}

		/*----#end-code----*/
		return this.redirect("sistema_de_clinica","Listar_medico","index", this.queryString());	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/


/*----#end-code----*/
}
