package nosi.webapps.sistema_de_clinica.pages.registrar_um_medico;

import nosi.core.webapp.Controller;//
import java.io.IOException;//
import nosi.core.webapp.Core;//
import nosi.core.webapp.Response;//
/* Start-Code-Block (import) */
/* End-Code-Block */
/*----#start-code(packages_import)----*/
import nosi.webapps.sistema_de_clinica.dao.CmTEspecialMedico;
import nosi.webapps.sistema_de_clinica.dao.CmTEspecialidade;
import nosi.webapps.sistema_de_clinica.dao.CmTMedico;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*----#end-code----*/
		
public class Registrar_um_medicoController extends Controller {
	public Response actionIndex() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Registrar_um_medico();
		model.load();
		var view = new Registrar_um_medicoView();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		view.especialidade.setQuery(Core.query(null,"SELECT 'id' as ID,'name' as NAME "));
		  ----#gen-example */
		/* Start-Code-Block (index) *//* End-Code-Block (index) */
		/*----#start-code(index)----*/
		view.especialidade.setQuery(Core.query(Core.defaultConnection(), "Select id, nome from cm_t_especialidade where estado ='A'"), "---Selecionar---");

		// Integer id = Core.getParamInt("p_id_medico");


		// Verifica se o ID do médico no modelo não é nulo ou zero
		if (Core.isNotNullOrZero(model.getId_medico())) {

			// Encontra o objeto CmTMedico usando o ID do médico do modelo
			CmTMedico cmTMedico = new CmTMedico().findOne(model.getId_medico());

			// Verifica se o objeto CmTMedico não é nulo e não possui erros
			if (Core.isNotNull(cmTMedico) && !cmTMedico.hasError()) {

				model.setNome(cmTMedico.getNome()); // Define o nome do médico no modelo

				model.setTelefones(cmTMedico.getTelefone()); // Define os telefones do médico no modelo

				model.setNumero_da_ordem_dos_medicos(cmTMedico.getNumeroOrdem()); // Define o número da ordem dos médicos no modelo

				// Define o estado do médico no modelo com base no estado do objeto CmTMedico
				if (cmTMedico.getEstado().equals("A")) {
					model.setEstado(1);
				} else {
					model.setEstado(0);
				}

				// Verifica se a foto do médico não é nula e define a foto no campo de visualização
				if(Core.isNotNull(cmTMedico.getFoto()));
				view.foto.setValue(Core.isNotNull(cmTMedico.getFoto()) ? Core.getLinkFileByUuid(cmTMedico.getFoto()) : "../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg");

				// Busca a lista de especialidades do médico
				List<CmTEspecialMedico> especialMedicoList = new CmTEspecialMedico().find().andWhere("medicoId.id", "=", cmTMedico.getId()).all();

				// Cria um array de strings para armazenar as IDs das especialidades
				String [] list = new String[especialMedicoList.size()];

				// Popula o array de especialidades com as IDs das especialidades do médico
				if (Core.isNotNull(especialMedicoList)){
					for (int i = 0; i < especialMedicoList.size(); i++) {
						list[i] = especialMedicoList.get(i).getEspecialidadeId().getId() + "";
						//Core.setMessageInfo(list[i]);
					}
				}

				// Define as especialidades no modelo
				model.setEspecialidade(list);

				// Atualiza o objeto CmTMedico no banco de dados com base no ID do médico
				cmTMedico.update().where("id = " + Core.getParam("p_id_medico"));
			}

		}
		/*----#end-code----*/
		view.setModel(model);
		return this.renderView(view);	
	}
	
	public Response actionRegistrar() throws IOException, IllegalArgumentException, IllegalAccessException{
		var model = new Registrar_um_medico();
		model.load();
		/*----#gen-example
		  EXAMPLES COPY/PASTE:
		  INFO: Core.query(null,... change 'null' to your db connection name, added in Application Builder.
		  this.addQueryString("p_id","12"); //to send a query string in the URL
		  return this.forward("sistema_de_clinica","Listar_medico","index",this.queryString()); //if submit, loads the values
		  Use model.validate() to validate your model
		  ----#gen-example */
		/* Start-Code-Block (registrar)  *//* End-Code-Block  */
		/*----#start-code(registrar)----*/

		Session session = null;  // Declara um objeto Session, inicialmente nulo.
		Transaction transaction = null;  // Declara um objeto Transaction, inicialmente nulo.
		Integer userId = Core.getCurrentUser().getId();  // Obtém o ID do usuário atual.

		try {
			session = Core.getSession(Core.defaultConnection());  // Abre uma nova sessão usando a conexão padrão.
			transaction = session.beginTransaction();  // Inicia uma nova transação no banco de dados.
			CmTMedico medico = new CmTMedico();  // Cria uma nova instância de CmTMedico.

			if (Core.isNotNull(model.getId_medico())) {  // Verifica se o ID do médico não é nulo (ou seja, atualização de um médico existente).
				medico = session.find(CmTMedico.class, model.getId_medico());  // Busca o médico existente no banco de dados.
				medico.setUserUpdate(userId);  // Define o usuário que atualizou este registro.
				medico.setDataUpdate(Core.convertStringToLocalDateTime(Core.getCurrentDate("yyyy-MM-dd HH:mm:ss"), "yyyy-MM-dd HH:mm:ss"));  // Define a data e hora da atualização.
			} else {  // Se o ID do médico é nulo (ou seja, criação de um novo médico).
				medico.setUserRegisto(userId);  // Define o usuário que registrou este novo médico.
				medico.setDataRegisto(Core.convertStringToLocalDateTime(Core.getCurrentDate("yyyy-MM-dd HH:mm:ss"), "yyyy-MM-dd HH:mm:ss"));  // Define a data e hora do registro.
			}

			// Define as propriedades do médico.
			medico.setNome(model.getNome());  // Define o nome do médico.
			medico.setTelefone(model.getTelefones());  // Define o número de telefone do médico.
			medico.setNumeroOrdem(model.getNumero_da_ordem_dos_medicos());  // Define o número da ordem dos médicos.

			if (model.getEstado() == 1)  // Verifica o estado do médico.
				medico.setEstado("A");  // Define o estado como "A" se o estado do modelo for 1 (ativo).
			else
				medico.setEstado("I");  // Define o estado como "I" se o estado do modelo não for 1 (inativo).

			medico.setFoto(model.getFoto_uuid());  // Define o UUID da foto do médico.
			session.persist(medico);  // Persiste a entidade médico no banco de dados.

			if (Core.isNotNull(model.getEspecialidade())) {  // Verifica se há alguma especialidade fornecida.
				for (String especialidade : model.getEspecialidade()) {  // Itera sobre cada especialidade.
					CmTEspecialidade esp = session.find(CmTEspecialidade.class, Core.toInt(especialidade));  // Busca a especialidade no banco de dados.
					CmTEspecialMedico espMed = new CmTEspecialMedico().find().keepConnection()
							.andWhere("medicoId.id", "=", medico.getId())
							.andWhere("especialidadeId.id", "=", Core.toInt(especialidade))
							.one();  // Tenta encontrar uma associação existente entre médico e especialidade.

					if (espMed == null) {  // Se não existe associação.
						espMed = new CmTEspecialMedico();  // Cria uma nova associação.
						espMed.setUserRegisto(userId);  // Define o usuário que registrou esta associação.
						espMed.setDataRegisto(Core.convertStringToLocalDateTime(Core.getCurrentDate("yyyy-MM-dd HH:mm:ss"), "yyyy-MM-dd HH:mm:ss"));  // Define a data e hora do registro.
					} else {  // Se existe uma associação.
						espMed.setUserUpdate(userId);  // Define o usuário que atualizou esta associação.
						espMed.setDataUpdate(Core.convertStringToLocalDateTime(Core.getCurrentDate("yyyy-MM-dd HH:mm:ss"), "yyyy-MM-dd HH:mm:ss"));  // Define a data e hora da atualização.
					}

					// Define as propriedades da associação.
					espMed.setMedicoId(medico);  // Define o médico na associação.
					espMed.setEspecialidadeId(esp);  // Define a especialidade na associação.
					espMed.setEstado("A");  // Define o estado da associação como ativo.
					session.persist(espMed);  // Persiste a entidade de associação no banco de dados.
				}
			}

			transaction.commit();  // Confirma a transação.
			Core.setMessageSuccess();  // Define uma mensagem de sucesso.

		} catch (Exception e) {  // Trata qualquer exceção que ocorra durante o processo.
			if (transaction != null)
				transaction.rollback();  // Desfaz a transação se ocorrer uma exceção.
			Core.setMessageError();  // Define uma mensagem de erro.
			return this.forward("sistema_clinica_medica", "Registrar_um_medico", "index", this.queryString());  // Redireciona para a página inicial com a query string.

		} finally {
			if (session != null && session.isOpen())
				session.close();  // Fecha a sessão se estiver aberta.
		}

		if (Core.isNotNull(model.getId_medico())) {
			return this.forward("sistema_de_clinica", "Registrar_um_medico", "index", this.queryString());  // Redireciona para a página inicial com a query string se o ID do médico não for nulo.
		}

		/*----#end-code----*/
		return this.redirect("sistema_de_clinica","Listar_medico","index", this.queryString());
	}
	/* Start-Code-Block (custom-actions)  *//* End-Code-Block  */
/*----#start-code(custom_actions)----*/

/*----#end-code----*/
}
