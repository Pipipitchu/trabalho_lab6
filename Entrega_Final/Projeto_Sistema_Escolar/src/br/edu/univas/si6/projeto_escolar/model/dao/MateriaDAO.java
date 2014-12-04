package br.edu.univas.si6.projeto_escolar.model.dao;

import javax.persistence.EntityManager;

import br.edu.univas.si6.projeto_escolar.model.to.Materia;

public class MateriaDAO extends GenericDAO<Materia, Integer> {

	public MateriaDAO(EntityManager em) {
		super(em);
		// TODO Auto-generated constructor stub
	}

}
