package nosi.webapps.sistema_de_clinica.pages.agendar_consulta;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.sistema_de_clinica.dao.CmTEspecialMedico;
import nosi.webapps.sistema_de_clinica.helper.Utils;
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
		model.loadFormlist_1(Core.query(null,"SELECT 'Sit doloremque dolor consectetur doloremque' as medico,'Labore laudantium amet unde omnis' as especialidade,'Iste unde amet totam accusantium' as hora_inicio,'Voluptatem doloremque mollit anim ut' as hora_fim_,'1' as selecionar "));
		view.especialidade_medica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.medico_com_especialidade.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/

		// Configuração inicial para carregar especialidades
		view.especialidade_medica.setListOptions(Utils.getEspecialidade());

		/*view.especialidade_medica.setQuery(Core.query(Core.defaultConnection(), "SELECT id, nome FROM cm_t_especialidade WHERE estado = 'A'"), "---Selecionar---");

		String especialidadeID = view.especialidade_medica.getValue().toString();

		if (!especialidadeID.equals("---Selecionar---")){
			try {
				// Construir a consulta SQL para buscar médicos pela especialidade selecionada
				String sql = "SELECT especialidade.*, medico.*" +
						"FROM cm_t_especialidade especialidade" +
						"JOIN cm_t_especial_medico em ON especialidade.id = em.especialidade_id" +
						"JOIN cm_t_medico medico ON em.medico_id = medico.id";

				// Executar a consulta e atualizar o segundo select
				view.medico_com_especialidade.setQuery(Core.query(Core.defaultConnection(), sql), "---Selecionar---");
			}catch (Exception e){
				Core.setMessageError(""+e);
			}
		}*/

		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/
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

	/*----#end-code----*/
}
