package br.edu.univas.si6.projeto_escolar.model.dao;

import javax.persistence.EntityManager;

import br.edu.univas.si6.projeto_escolar.model.to.Grade;

public class GradeDAO extends GenericDAO<Grade, Integer> {

	public GradeDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
