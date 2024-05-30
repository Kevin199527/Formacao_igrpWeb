package nosi.webapps.sistema_de_clinica.pages.agendar_consulta;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.sistema_de_clinica.dao.CmTAgendamento;
import nosi.webapps.sistema_de_clinica.dao.CmTEspecialMedico;
import nosi.webapps.sistema_de_clinica.helper.Utils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*----#end-code----*/
		
public class Agendar_consultaController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Agendar_consulta();
		model.load();
		var view = new Agendar_consultaView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadLista_de_consulta(Core.query(null,"SELECT 'Accusantium aliqua adipiscing' as data_de_agendamento,'Laudantium omnis iste amet tot' as hora_inicio_1,'Stract labore laudantium labor' as hora_fim,'1' as selecionar,'hidden-913b_e3a2' as id_medico "));
		view.especialidade_medica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.medico_com_especialidade.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		// Configuração inicial para carregar especialidades
		view.especialidade_medica.setListOptions(Utils.getEspecialidade());
		
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/
	/* Esses metodos sao para programar o Remote Combo Box (Regra de Rules) Essas regra estao na pagina Agendar Consulta nos Select*/

	public Response actionFindMedico() throws IOException, IllegalArgumentException, IllegalAccessException{
		// Cria uma nova instância da view Agendar_consultaView
		Agendar_consultaView view = new Agendar_consultaView();

		// Busca a lista de especialidades médicas baseadas no ID da especialidade selecionada na view
		List<CmTEspecialMedico> cmTEspecialMedicoList = new CmTEspecialMedico().find()
				.andWhere("especialidadeId.id", "=",
						Core.getParamInt(view.especialidade_medica.getParamTag())) // Obtém o ID da especialidade médica selecionada na view
				.all();

		// Cria um mapa para armazenar os IDs dos médicos e seus nomes
		Map<Integer, String> _map = new HashMap<>();

		// Verifica se a lista de especialidades médicas não é nula e não está vazia
		if(cmTEspecialMedicoList != null && !cmTEspecialMedicoList.isEmpty())
			// Para cada especialidade médica encontrada, coloca o ID do médico e o nome do médico no mapa
			cmTEspecialMedicoList.forEach(d -> {
				_map.put(d.getMedicoId().getId(), d.getMedicoId().getNome());
			});

		// Gera um XML para um combobox remoto utilizando o mapa de médicos e especialidades
		String xml = Core.remoteComboBoxXml(_map, view.medico_com_especialidade, null);

		// Retorna a resposta renderizada com o XML gerado
		return this.renderView(xml);
	}

	public Response actionFindList() throws IOException, IllegalArgumentException, IllegalAccessException {

		// Cria uma instância do modelo Agendar_consulta
		Agendar_consulta model = new Agendar_consulta();
		// Carrega os dados do modelo
		model.load();

		// Cria uma nova instância da view Agendar_consultaView
		Agendar_consultaView view = new Agendar_consultaView();

		// Busca a lista de agendamentos com base no ID da especialidade médica selecionada na view
		List<CmTAgendamento> agendamentoList = new CmTAgendamento().find()
				.andWhere("cmEspMedId.id", "=",
						// Obtém o ID da especialidade médica selecionada na view
						Core.getParamInt(view.medico_com_especialidade.getParamTag()))
				.all();

		// Cria uma lista para armazenar os dados formatados para exibição na view
		List<Agendar_consulta.Lista_de_consulta> tableList = new ArrayList<>();

		// Verifica se a lista de agendamentos não é nula e não está vazia
		if (agendamentoList != null && !agendamentoList.isEmpty()) {
			// Itera sobre cada agendamento encontrado
			agendamentoList.forEach(d -> {
				// Cria uma nova linha para a lista de consultas
				Agendar_consulta.Lista_de_consulta row = new Agendar_consulta.Lista_de_consulta();
				// Define os valores da linha com os dados do agendamento
				row.setHora_fim(d.getHoraFim());
				row.setHora_inicio_1(d.getHoraInicio());
				row.setData_de_agendamento("" + d.getDataAgendamento());
				row.setSelecionar(d.getCmEspMedId().getId());
				row.setSelecionar_check(0);
				// Adiciona a linha formatada à lista
				tableList.add(row);
			});
		}

		// Define a lista de consultas no modelo
		model.setLista_de_consulta(tableList);
		// Define o modelo na view
		view.setModel(model);
		// Renderiza a view com os dados do modelo e retorna a resposta
		return this.renderView(view);
	}

	/*----#end-code----*/
}
