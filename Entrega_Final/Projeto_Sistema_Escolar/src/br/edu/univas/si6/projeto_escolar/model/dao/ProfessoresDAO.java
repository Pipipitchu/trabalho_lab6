package br.edu.univas.si6.projeto_escolar.model.dao;

import java.util.HashMap;
import java.util.Map;

import br.edu.univas.si6.projeto_escolar.model.to.ProfessoresTO;

public class ProfessoresDAO extends GenericDAO<ProfessoresTO> {

	private static final long serialVersionUID = 1L;

	public ProfessoresDAO() {
		super(ProfessoresTO.class);
	}
	public ProfessoresTO LocalizarNome(String nome) {
		Map<String, Object> parametros=new HashMap<String, Object>();
		parametros.put("nome", nome);
		
		return super.findOneResult(ProfessoresTO.LOCALIZAR_NOME, parametros);
	}
}