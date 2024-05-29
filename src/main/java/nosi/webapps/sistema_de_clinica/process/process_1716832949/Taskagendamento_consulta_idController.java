package nosi.webapps.sistema_de_clinica.process.process_1716832949;

import java.io.IOException;//
import java.util.List;//
import nosi.core.webapp.Response;//
import jakarta.servlet.ServletException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.activit.rest.entities.TaskService;
import nosi.core.webapp.bpmn.RuntimeTask;
import nosi.webapps.igrp.dao.TipoDocumentoEtapa;//
import nosi.core.webapp.bpmn.BPMNTaskController;//
import nosi.webapps.sistema_de_clinica.pages.agendar_consulta.Agendar_consulta;//
import nosi.webapps.sistema_de_clinica.pages.agendar_consulta.Agendar_consultaView;//
/*----#start-code(packages_import)----*/
import nosi.webapps.sistema_de_clinica.helper.Utils;
import org.hibernate.Session;
import org.hibernate.Transaction;
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
