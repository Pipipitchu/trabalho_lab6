package br.edu.univas.si6.projeto_escolar.model.dao;

import javax.persistence.EntityManager;

import br.edu.univas.si6.projeto_escolar.model.to.Eventos;

public class EventosDAO extends GenericDAO<Eventos, Integer> {

	public EventosDAO(EntityManager em) {
		super(em);
	}
	
	@Override
	public void salvar(Eventos evento) {
		super.salvar(evento);
	}
}
