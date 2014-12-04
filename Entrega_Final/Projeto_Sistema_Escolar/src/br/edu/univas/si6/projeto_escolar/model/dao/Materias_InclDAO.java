package br.edu.univas.si6.projeto_escolar.model.dao;

import javax.persistence.EntityManager;

import br.edu.univas.si6.projeto_escolar.model.to.Materias_Incl;

public class Materias_InclDAO extends GenericDAO<Materias_Incl, Integer> {

	public Materias_InclDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
