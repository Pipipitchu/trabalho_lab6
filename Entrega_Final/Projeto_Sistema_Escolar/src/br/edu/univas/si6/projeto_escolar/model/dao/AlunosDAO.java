package br.edu.univas.si6.projeto_escolar.model.dao;

import javax.persistence.EntityManager;

import br.edu.univas.si6.projeto_escolar.model.to.Alunos;

public class AlunosDAO extends GenericDAO<Alunos, Integer> {

	public AlunosDAO(EntityManager em) {
		super(em);
	}
	public void salvar(Alunos aluno){
		super.salvar(aluno);
	}
}
