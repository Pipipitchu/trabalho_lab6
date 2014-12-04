package br.edu.univas.si6.projeto_escolar.model.dao;

import javax.persistence.EntityManager;

import br.edu.univas.si6.projeto_escolar.model.to.UserTO;

public class UsersDAO extends GenericDAO<UserTO, Integer> {

	public UsersDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
