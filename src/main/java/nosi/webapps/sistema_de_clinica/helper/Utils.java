package nosi.webapps.sistema_de_clinica.helper;

import nosi.webapps.sistema_de_clinica.dao.CmTEspecialMedico;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {

    public static Map<Integer, String> getEspecialidade(){

        // Obtém a lista de especialidades médicas associadas ao ID do médico fornecido
        List<CmTEspecialMedico> especialMedicos = new CmTEspecialMedico().findAll();

        Map<Integer, String> map = new HashMap<>();

        map.put(null, "---Selecionar---");

        if (especialMedicos ==  null || especialMedicos.isEmpty()){
            return map;
        }
        especialMedicos.forEach(d->{
            map.put(d.getEspecialidadeId().getId(), d.getEspecialidadeId().getNome());
        });

        return map;
    }
}
