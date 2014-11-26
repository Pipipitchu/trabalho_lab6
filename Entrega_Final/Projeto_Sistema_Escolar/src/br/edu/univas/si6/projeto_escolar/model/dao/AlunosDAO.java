package br.edu.univas.si6.projeto_escolar.model.dao;

import java.util.HashMap;
import java.util.Map;

import br.edu.univas.si6.projeto_escolar.model.to.AlunosTO;

public class AlunosDAO extends GenericDAO<AlunosTO> {

	private static final long serialVersionUID = 1L;

	public AlunosDAO() {
		super(AlunosTO.class);
	}
	public AlunosTO LocalizarNome(String nome) {
		Map<String, Object> parametros=new HashMap<String, Object>();
		parametros.put("nome", nome);
		
		return super.findOneResult(AlunosTO.LOCALIZAR_NOME, parametros);
	}
}
