package br.edu.univas.si6.projeto_escolar.model.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Notas_1")
@IdClass(value=Notas_1PK.class)
public class Notas_1 {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator ="seq_notas_1")
	@SequenceGenerator ( name ="seq_notas_1",sequenceName ="SEQ_NOTAS_1",allocationSize =1)
	private int cod;
	@Id
	private int bimestre;
	@Id
	private int ano;
	@Id
//	@OneToOne(mappedBy="Alunos")
	private int aluno;
	@Id
//	@OneToOne(mappedBy="Materias_Incl")
	private int materia;
	private int n1;
	private int n2;
	private int n3;
	private int n4;
	
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
