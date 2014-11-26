package br.edu.univas.si6.projeto_escolar.model.dao;

import java.util.HashMap;
import java.util.Map;

import br.edu.univas.si6.projeto_escolar.model.to.UsuariosTO;

public class UserDAO extends GenericDAO<UsuariosTO> {

	private static final long serialVersionUID = 1L;
	public UserDAO() {
		super(UsuariosTO.class);
	}
	public UsuariosTO LocalizarNome(String nome) {
		Map<String, Object> parametros=new HashMap<String, Object>();
		parametros.put("nome", nome);
		
		return super.findOneResult(UsuariosTO.LOCALIZAR_NOME, parametros);
	}
}
