package nosi.webapps.sistema_de_clinica.pages.agendar_consulta;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
/*----#end-code----*/
		
public class Agendar_consultaController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Agendar_consulta();
		model.load();
		var view = new Agendar_consultaView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		model.loadFormlist_1(Core.query(null,"SELECT 'Ipsum laudantium perspiciatis sit amet' as medico,'Officia anim officia unde aperiam' as especialidade,'Magna sit aliqua ipsum iste' as hora_inicio,'Accusantium aperiam natus stract ut' as hora_fim_,'1' as selecionar "));
		view.especialidade_medica.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		view.medico_com_especialidade.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		/*// Configuração inicial para carregar especialidades
		view.especialidade_medica.setQuery(Core.query(Core.defaultConnection(), "SELECT id, nome FROM cm_t_especialidade WHERE estado = 'A'"), "---Selecionar---");

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


/*----#end-code----*/
}
