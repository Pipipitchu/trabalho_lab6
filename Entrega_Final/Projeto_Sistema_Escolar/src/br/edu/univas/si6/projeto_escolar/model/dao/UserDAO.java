package br.edu.univas.si6.projeto_escolar.model.dao;

import java.util.HashMap;
import java.util.Map;

import br.edu.univas.si6.projeto_escolar.model.to.UserTO;

public class UserDAO extends GenericDAO<UserTO> {

	private static final long serialVersionUID = 1L;
	public UserDAO() {
		super(UserTO.class);
	}
	public UserTO LocalizarNome(String nome) {
		Map<String, Object> parametros=new HashMap<String, Object>();
		parametros.put("nome", nome);
		
		return super.findOneResult(UserTO.LOCALIZAR_NOME, parametros);
	}
}
