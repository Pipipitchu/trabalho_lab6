package br.edu.univas.si6.projeto_escolar.model.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;

abstract class GenericDAO <T, PK> {
	protected EntityManager em;

	public GenericDAO(EntityManager em) {
		this.em = em;
	}

	public void salvar(T entity) {

		em.getTransaction().begin();

		em.persist(entity);

		em.getTransaction().commit();
	}

	public void update(T entity) {

		em.getTransaction().begin();

		em.merge(entity);

		em.getTransaction().commit();
	}

	public void deleteCargo(T entity) {

		em.getTransaction().begin();

		em.remove(entity);

		em.getTransaction().commit();
	}

	public T getById(PK id) {

		@SuppressWarnings("unchecked")
		T entity = (T) em.find(getTypeClass(), id);
		return entity;
	}

	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		Query q = em.createQuery("from" + getTypeClass().getName(),
				getTypeClass());
		return q.getResultList();
	}

	private Class<?> getTypeClass() {

		Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass()
		.getGenericSuperclass()).getActualTypeArguments()[0];
		return clazz;

	}

	@SuppressWarnings("unchecked")
	protected T encontra1Result(String localizarNome,Map<String, Object> parametros) {
		T resultado = null;
		try{			
			Query query = em.createNamedQuery(localizarNome);
			if(parametros!= null && !parametros.isEmpty()){
				populateQueryParameters(query, parametros);
			}
			resultado = (T) query.getSingleResult();
			System.out.println("valor do resultado" +resultado.toString());
			return resultado;
		}catch(NoResultException e){
			System.out.println("No result found for named query: " + localizarNome);
		}catch(Exception e) {
			System.out.println("Error while running query: " + e.getMessage());
			e.printStackTrace();
		}
		return null;
	}
	private void populateQueryParameters(Query query, Map<String, Object> parameters) {
		for (Entry<String, Object> entry : parameters.entrySet()) {
			query.setParameter(entry.getKey(), entry.getValue());
		}
	}
}
