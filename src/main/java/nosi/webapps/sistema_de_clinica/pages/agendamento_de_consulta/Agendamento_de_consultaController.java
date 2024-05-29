package nosi.webapps.sistema_de_clinica.pages.agendamento_de_consulta;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nosi.webapps.sistema_de_clinica.dao.CmTAgendamento;
import nosi.webapps.sistema_de_clinica.dao.CmTEspecialMedico;
import org.hibernate.Session;
import org.hibernate.Transaction;
import nosi.core.gui.components.IGRPSeparatorList;
/*----#end-code----*/
		
public class Agendamento_de_consultaController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Agendamento_de_consulta();
		model.load();
		var view = new Agendamento_de_consultaView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadHorario_de_atendimento(Core.query(null,"SELECT '05-05-2013' as data,'2' as especialidade,'' as consultorio,'15:46' as hora_inicio_,'14:16' as hora_fim,'hidden-f7e7_ef3b' as consultorio_id "));
		view.especialidade.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		// Obtém o ID do médico a partir dos parâmetros da requisição
		Integer id = Core.getParamInt("p_id_medico");

		// Configura a lista de opções de especialidades no view com base no ID do médico
		view.especialidade.setListOptions(getMedicoEspecial(id));

		// Adiciona parâmetros fixos para o lookup do consultório no view
		view.consultorio.addLookupParam("p_nivel", "3");
		view.consultorio.addParam("p_fwl_id", "238");

		// Obtém uma lista de agendamentos do médico com o ID especificado
		List<CmTAgendamento> _angList = new CmTAgendamento().find().andWhere("cmEspMedId.medicoId.id", "=", id).all();

		// Obtém a lista de horários de atendimento do modelo
		List<Agendamento_de_consulta.Horario_de_atendimento> sepList = model.getHorario_de_atendimento();

		// Verifica se a lista de agendamentos não está nula e não está vazia
		if (_angList != null && !_angList.isEmpty()) {

			// Para cada agendamento na lista
			_angList.forEach(d -> {
				// Cria uma nova instância de Horario_de_atendimento
				Agendamento_de_consulta.Horario_de_atendimento row = new Agendamento_de_consulta.Horario_de_atendimento();

				// Define os atributos do Horario_de_atendimento com os dados do agendamento

				// Define o consultório com base no ID do local do agendamento
				row.setConsultorio(new IGRPSeparatorList.Pair("" + d.getLocalId(), "" + d.getLocalId()));

				// Define a data do agendamento, formatando-a como uma string no formato "dd/MM/yyyy"
				row.setData(new IGRPSeparatorList.Pair(
						Core.dateToString(d.getDataAgendamento(), Core.DD_MM_YYYY),
						Core.dateToString(d.getDataAgendamento(), Core.DD_MM_YYYY)
				));

				// Define a especialidade do agendamento com o ID da especialidade e o nome da especialidade
				row.setEspecialidade(new IGRPSeparatorList.Pair("" + d.getCmEspMedId().getId(), d.getCmEspMedId().getEspecialidadeId().getNome()));

				// Define a hora de fim do agendamento
				row.setHora_fim(new IGRPSeparatorList.Pair(d.getHoraFim(), d.getHoraFim()));

				// Define a hora de início do agendamento
				row.setHora_inicio_(new IGRPSeparatorList.Pair(d.getHoraInicio(), d.getHoraInicio()));

				// Define o ID do horário de atendimento do agendamento
				row.setHorario_de_atendimento_id(new IGRPSeparatorList.Pair("" + d.getId(), "" + d.getId()));

				// Adiciona o horário de atendimento à lista
				sepList.add(row);
			});

		}

		// Atualiza a lista de horários de atendimento no modelo
		model.setHorario_de_atendimento(sepList);

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionGravar() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Agendamento_de_consulta();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_clinica","Agendamento_de_consulta","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (gravar)  *//* End-Code-Block  */
		/*----#start-code(gravar)----*/
		Session session = null;
		Transaction transaction = null;

		// Obtém o ID do usuário atual
		Integer userId = Core.getCurrentUser().getId();

		try {
			// Abre uma nova sessão e inicia uma transação
			session = Core.getSession(Core.defaultConnection());
			transaction = session.beginTransaction();

			// Itera sobre a lista de horários de atendimento do modelo
			for (Agendamento_de_consulta.Horario_de_atendimento row : model.getHorario_de_atendimento()){

				// Busca o agendamento no banco de dados pelo ID, se existir
				CmTAgendamento agendamento = session.find(
						CmTAgendamento.class, Core.isNotNull(row.getHorario_de_atendimento_id().getKey())
								? Core.toInt(row.getHorario_de_atendimento_id().getKey()) : 0);

				// Busca a especialidade médica associada ao agendamento
				CmTEspecialMedico espMed = session.find(CmTEspecialMedico.class, Core.toInt(row.getEspecialidade().getKey()));

				// Se o agendamento não existir, cria um novo; caso contrário, atualiza o existente
				if(agendamento == null){
					agendamento = new CmTAgendamento();
					agendamento.setUserRegistro(userId); // Define o usuário que registrou o agendamento
					agendamento.setDataRegistro(LocalDateTime.now()); // Define a data de registro
				}else{
					agendamento.setUserUpdate(userId); // Define o usuário que atualizou o agendamento
					agendamento.setDataRegistro(LocalDateTime.now()); // Atualiza a data de registro
				}

				// Define os atributos do agendamento com base nos dados do formulário
				agendamento.setCmEspMedId(espMed);
				agendamento.setHoraFim(row.getHora_fim().getKey());
				agendamento.setHoraInicio(row.getHora_inicio_().getKey());
				agendamento.setLocalId(row.getConsultorio_id().getKey());
				agendamento.setDataAgendamento(Core.ToDate(row.getData().getKey(), Core.DD_MM_YYYY, Core.YYYY_MM_DD));

				// Persiste o agendamento na sessão
				session.persist(agendamento);
			}

			// Verifica se há agendamentos a serem deletados
			if(Core.isNotNull(model.getP_horario_de_atendimento_del())){
				for(String s : model.getP_horario_de_atendimento_del()){
					// Busca o agendamento pelo ID e deleta da sessão
					CmTAgendamento agendamento = session.find(CmTAgendamento.class, Core.toInt(s));
					session.delete(agendamento);
				}
			}

			// Confirma a transação
			transaction.commit();
			Core.setMessageSuccess("Gravado com Sucesso!");
			this.addQueryString("p_id", userId);
		}catch (Exception e){
			// Em caso de erro, faz o rollback da transação
			if(transaction != null)
				transaction.rollback();

			Core.setMessageError("Não Foi Possível Gravar o Registro! " + e);

			this.addQueryString("p_id", userId);
			return this.forward("sistema_de_clinica", "Agendamento_de_consulta", "index", this.queryString()); // Se ocorrer um erro, carrega os valores submetidos
		} finally {
			// Fecha a sessão se estiver aberta
			if(session != null && session.isOpen())
				session.close();
		}

		// Redireciona para a página de agendamento de consulta
		return this.forward("sistema_de_clinica", "Agendamento_de_consulta", "index", this.queryString());
		/*----#end-code----*/
			
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/
	public Map<Integer, String> getMedicoEspecial(Integer medicoId) {
		// Cria um novo HashMap para armazenar as especialidades dos médicos
		Map<Integer, String> _map = new HashMap<>();

		// Obtém a lista de especialidades médicas associadas ao ID do médico fornecido
		List<CmTEspecialMedico> especialMedicos = new CmTEspecialMedico().find().andWhere("medicoId.id", "=", medicoId).all();

		// Adiciona uma opção padrão "Selecionar" ao mapa
		_map.put(null, "---Selecionar---");

		// Verifica se a lista de especialidades médicas não é nula e não está vazia
		if (especialMedicos != null && !especialMedicos.isEmpty()) {
			// Para cada especialidade médica na lista, adiciona a especialidade ao mapa
			especialMedicos.forEach(d -> {
				_map.put(d.getId(), d.getEspecialidadeId().getNome());
			});
		}

		// Retorna o mapa contendo as especialidades médicas
		return _map;
	}

	/*----#end-code----*/
}
