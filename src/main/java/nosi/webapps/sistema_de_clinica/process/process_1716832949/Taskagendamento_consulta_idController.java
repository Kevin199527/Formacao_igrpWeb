package nosi.webapps.sistema_de_clinica.process.process_1716832949;

import java.io.IOException;//
import java.util.List;//
import nosi.core.webapp.Response;//
import jakarta.servlet.ServletException;//
import nosi.core.webapp.Core;//
import nosi.webapps.igrp.dao.TipoDocumentoEtapa;//
import nosi.core.webapp.bpmn.BPMNTaskController;//
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

			/*ApiPedido apiPedido = new ApiPedido();

			apiPedido.setNrProcesso(Core.toInt(task.getProcessInstanceId()));
			apiPedido.setEstadoPedido("PENDENTE");
			apiPedido.setProcessoDesc(task.getProcessDefinitionKey());
			apiPedido.setProcessoKey(task.getProcessDefinitionId());
			apiPedido.setEtapaAtual(task.getTaskDefinitionKey());
			apiPedido.save(session);

			CheckBoxHelper checkBoxHelper = Core.extractCheckBox(Core.getParamArray("_fk"), Core.getParamArray("_check_fk"));

			if (checkBoxHelper.getChekedIds() != null && !checkBoxHelper.getChekedIds().isEmpty()) {
				for (String checkedId : checkBoxHelper.getChekedIds()) {
					CmTPaciente paciente = new CmTPaciente();
					Identificacao_do_paciente identificacaoDoPaciente = new Identificacao_do_paciente();

					// Presumindo que você tem um método setId ou similar para associar o ID ao paciente
					paciente.setId(Core.toInt(identificacaoDoPaciente.getNome()));
					paciente.setNome(identificacaoDoPaciente.getNome());
					paciente.setNomeMae(identificacaoDoPaciente.getNome_de_mae());
					paciente.setNomePai(identificacaoDoPaciente.getNome_de_pai());
					paciente.setTipoDocumento(identificacaoDoPaciente.getTipo_documento_());
					paciente.setNrDocumento(identificacaoDoPaciente.getNumero_documento());

					if (identificacaoDoPaciente.getPrimeira_consulta() == 1){

					}

					// Salvando ou atualizando o paciente na sessão
					session.saveOrUpdate(paciente);
				}
			}
*/
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
