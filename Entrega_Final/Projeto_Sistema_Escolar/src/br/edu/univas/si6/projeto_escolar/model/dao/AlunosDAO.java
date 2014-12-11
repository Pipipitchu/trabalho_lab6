package br.edu.univas.si6.projeto_escolar.model.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;

import br.edu.univas.si6.projeto_escolar.model.to.Alunos;

public class AlunosDAO extends GenericDAO<Alunos, Integer> {

	public AlunosDAO(EntityManager em) {
		super(em);
	}
	public void salvar(Alunos aluno){
		super.salvar(aluno);
	}
	
	public ArrayList<String> procurarAluno(String turma){
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("ano", turma);
		ArrayList<String> object = super.pegaTudoAluno(Alunos.LOCALIZAR_TURMA,parametros);
		if(object==null){
			return null;
		}else{
			System.out.println("Operacao bem sucedida!");
			return object;
		} 
		
	}
}
