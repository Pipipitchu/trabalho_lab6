package br.edu.univas.si6.projeto_escolar.model.dao;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;

import br.edu.univas.si6.projeto_escolar.model.to.Materias_Incl;
import br.edu.univas.si6.projeto_escolar.model.to.Usuarios;

public class Materias_InclDAO extends GenericDAO<Materias_Incl, Integer> {

	public Materias_InclDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}
	
	public boolean encontrarMaterias(String usuario_nome,String usuario_senha){
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("nome", usuario_nome);
		parametros.put("senha", usuario_senha);
		Object object = super.encontra1Result(Usuarios.LOCALIZAR_NOME_E_SENHA,parametros);
		if(object==null){
			return false;
		}else{
			return true;
		} 
	}
}
