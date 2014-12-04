package br.edu.univas.si6.projeto_escolar.model.dao;

import javax.persistence.EntityManager;

import br.edu.univas.si6.projeto_escolar.model.to.Professores;

public class ProfessoresDAO extends GenericDAO<Professores, Integer> {

	public ProfessoresDAO(EntityManager em) {
		super(em);
	}
	
	public void salvar(Professores professor){
		super.salvar(professor);
	}

}