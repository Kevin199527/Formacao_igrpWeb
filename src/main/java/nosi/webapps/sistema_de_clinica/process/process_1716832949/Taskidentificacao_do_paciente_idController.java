package nosi.webapps.sistema_de_clinica.process.process_1716832949;

import java.io.IOException;//
import java.util.List;//
import nosi.core.webapp.Response;//
import jakarta.servlet.ServletException;//
import nosi.core.webapp.Core;//
import nosi.webapps.igrp.dao.TipoDocumentoEtapa;//
import nosi.core.webapp.bpmn.BPMNTaskController;//
import nosi.webapps.sistema_de_clinica.pages.identificacao_do_paciente.Identificacao_do_paciente;//
import nosi.webapps.sistema_de_clinica.pages.identificacao_do_paciente.Identificacao_do_pacienteView;//
/*----#start-code(packages_import)----*/

/*----#end-code----*/



/**
 *kevinlily.cv@gmail.com
 *29-05-2024
*/

public class Taskidentificacao_do_paciente_idController extends BPMNTaskController {

	public Response actionIndex() throws IOException, ServletException, IllegalArgumentException, IllegalAccessException {
		var view = new Identificacao_do_pacienteView();
		var model = new Identificacao_do_paciente();
		model.load();

		/*----#start-code(index)----*/
		view.tipo_documento_.loadDomain("TP_DOCUMENTO","sistema_de_clinica","-- Selecionar --");
		view.primeira_consulta.loadDomainByApp("SIM_NAO","sistema_de_clinica");

		/*----#end-code----*/

		return super.index("sistema_de_clinica",model,view,this);
	}

	public Response actionSave() throws IOException, ServletException, IllegalArgumentException, IllegalAccessException {

		/*----#start-code(save)----*/

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
