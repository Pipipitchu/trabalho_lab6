package br.edu.univas.si6.projeto_escolar.model.to;

import java.io.Serializable;

public class Notas_1PK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int cod;
	private int bimestre;
	private int ano;
	private int aluno;
	private int materia;

	public Notas_1PK(){
        // Your class must have a no-arq constructor
    }
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + aluno;
		result = prime * result + ano;
		result = prime * result + bimestre;
		result = prime * result + cod;
		result = prime * result + materia;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Notas_1PK other = (Notas_1PK) obj;
		if (aluno != other.aluno)
			return false;
		if (ano != other.ano)
			return false;
		if (bimestre != other.bimestre)
			return false;
		if (cod != other.cod)
			return false;
		if (materia != other.materia)
			return false;
		return true;
	}
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public int getBimestre() {
		return bimestre;
	}

	public void setBimestre(int bimestre) {
		this.bimestre = bimestre;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public int getAluno() {
		return aluno;
	}

	public void setAluno(int aluno) {
		this.aluno = aluno;
	}

	public int getMateria() {
		return materia;
	}

	public void setMateria(int materia) {
		this.materia = materia;
	}
	
}
