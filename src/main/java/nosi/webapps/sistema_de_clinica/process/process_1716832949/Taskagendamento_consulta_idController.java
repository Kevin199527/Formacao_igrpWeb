package nosi.webapps.sistema_de_clinica.process.process_1716832949;

import java.io.IOException;//
import java.util.List;//
import nosi.core.webapp.Response;//
import jakarta.servlet.ServletException;//
import nosi.core.webapp.Core;//
import nosi.webapps.igrp.dao.TipoDocumentoEtapa;//
import nosi.core.webapp.bpmn.BPMNTaskController;//
import nosi.webapps.sistema_de_clinica.dao.CmTMarcacao;
import nosi.webapps.sistema_de_clinica.dao.CmTPedido;
import nosi.webapps.sistema_de_clinica.pages.agendar_consulta.Agendar_consulta;//
import nosi.webapps.sistema_de_clinica.pages.agendar_consulta.Agendar_consultaView;//
/*----#start-code(packages_import)----*/
import nosi.webapps.sistema_de_clinica.helper.Utils;
import nosi.webapps.sistema_de_clinica.pages.identificacao_do_paciente.Identificacao_do_paciente;
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.core.webapp.activit.rest.entities.TaskService;
import nosi.webapps.sistema_de_clinica.helper.ApiPedido;
import nosi.core.webapp.bpmn.RuntimeTask;
import nosi.core.webapp.helpers.CheckBoxHelper;
import nosi.webapps.sistema_de_clinica.dao.CmTPaciente;

/*----#end-code----*/



/**
 *kevinlily.cv@gmail.com
 *29-05-2024
*/

public class Taskagendamento_consulta_idController extends BPMNTaskController {

	public Response actionIndex() throws IOException, ServletException, IllegalArgumentException, IllegalAccessException {
		var view = new Agendar_consultaView();
		var model = new Agendar_consulta();
		model.load();

		/*----#start-code(index)----*/
		// Configuração inicial para carregar especialidades
		view.especialidade_medica.setListOptions(Utils.getEspecialidade());
		/*----#end-code----*/

		return super.index("sistema_de_clinica",model,view,this);
	}

	public Response actionSave() throws IOException, ServletException, IllegalArgumentException, IllegalAccessException {

		/*----#start-code(save)----*/
		Agendar_consulta model = new Agendar_consulta();
		model.load();

		TaskService task = RuntimeTask.getRuntimeTask().getTask();

		Session session = null;
		Transaction transaction = null;

		try{
			session = Core.getSession(Core.defaultConnection());
			transaction = session.beginTransaction();

			ApiPedido apiPedido = new ApiPedido();

			// Define o número do processo do pedido convertendo o ID da instância do processo da tarefa em um inteiro
			apiPedido.setNrProcesso(Core.toInt(task.getProcessInstanceId()));
			apiPedido.setEstadoPedido("PENDENTE");// Define o estado do pedido como "PENDENTE"
			// Define a descrição do processo usando a chave da definição do processo da tarefa
			apiPedido.setProcessoDesc(task.getProcessDefinitionKey());
			// Define a chave do processo com o ID da definição do processo da tarefa
			apiPedido.setProcessoKey(task.getProcessDefinitionId());
			// Define a etapa atual do pedido usando a chave da definição da tarefa
			apiPedido.setEtapaAtual(task.getTaskDefinitionKey());
			// Salva o objeto ApiPedido na sessão do Hibernate
			apiPedido.save(session);


			// Extrai um objeto CheckBoxHelper usando arrays de parâmetros
			CheckBoxHelper checkBoxHelper = Core.extractCheckBox(Core.getParamArray("p_selecionar_fk"), Core.getParamArray("p_selecionar_check_fk"));

			/*List<String> ViewCheckout = checkBoxHelper.getChekedIds(); // Pegar o checkout que foi checado
			List<String> NotCheckout = checkBoxHelper.getUncheckedIds(); // Pegar o checkout que não foi checado*/

			// Verifica se existem IDs checados e se a lista não está vazia
			if (checkBoxHelper.getChekedIds() != null && !checkBoxHelper.getChekedIds().isEmpty()) {
				// Itera sobre cada ID checado
				for (String checkedId : checkBoxHelper.getChekedIds()) {

					// Cria uma nova instância de CmTMarcacao
					CmTMarcacao marcacao = new CmTMarcacao();
					// Define o ID do agendamento convertendo o ID checado de String para Integer
					marcacao.setAgedamentoId(Integer.valueOf(checkedId));
					// Define a data de registro convertendo a data atual para o formato LocalDateTime
					marcacao.setDataRegistro(Core.convertStringToLocalDateTime(Core.getCurrentDate("yyyy-MM-dd HH-mm-ss"), "yyyy-MM-dd HH-mm-ss"));
					// Define o ID do usuário que fez a atualização, obtido do usuário atualmente logado
					marcacao.setUserUpdate(Core.getCurrentUser().getId());
					// Define o número do processo usando o ID da instância do processo da tarefa
					marcacao.setNrProcesso(Core.toInt(task.getProcessInstanceId()));
					// Persiste o objeto marcacao na sessão do Hibernate
					session.persist(marcacao);
				}
			}

		} catch (Exception e){
			if(transaction != null)
				transaction.rollback();
			return this.forward("Formacao_igrpWeb", "Taskagendamento_consulta_id", "index");
		} finally {
			if(session != null && session.isOpen())
				session.close();
		}
		/*----#end-code----*/

		return super.save();
	}

	public List<TipoDocumentoEtapa> getInputDocumentType() {
		return super.getInputDocumentType();
	}

	public List<TipoDocumentoEtapa> getOutputDocumentType() {
		return super.getOutputDocumentType();
	}



	/*----#start-code(custom_actions)----*/

	/*----#end-code----*/



}
