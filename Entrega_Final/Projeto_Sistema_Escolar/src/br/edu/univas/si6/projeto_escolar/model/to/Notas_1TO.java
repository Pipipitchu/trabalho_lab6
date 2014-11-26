package br.edu.univas.si6.projeto_escolar.model.to;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Table(name="notas_1")
@NamedQuery(name="Notas_1TO.LocalizarBimestre",query="select bimestre from notas_1 as n1 where n1.bimestre=:bimestre")
public class Notas_1TO {
	
	public static final String LOCALIZAR_BIMESTRE = "Notas_1TO.LocalizarBimestre";
	public static final String LOCALIZAR_ANO = "Notas_1TO.LocalizarAno";
	public static final String LOCALIZAR_ALUNO = "Notas_1TO.LocalizarAluno";
	public static final String LOCALIZAR_MATERIA = "Notas_1TO.LocalizarMateria";
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cod;
	@Column(unique=true)
	private int bimestre;
	@Column(unique=true)
	private int ano;
	@Column(unique=true)
	private int aluno;
	@Column(unique=true)
	private int materia;
	
	private int n1,n2,n3,n4;

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

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public int getN3() {
		return n3;
	}

	public void setN3(int n3) {
		this.n3 = n3;
	}

	public int getN4() {
		return n4;
	}

	public void setN4(int n4) {
		this.n4 = n4;
	}
}
