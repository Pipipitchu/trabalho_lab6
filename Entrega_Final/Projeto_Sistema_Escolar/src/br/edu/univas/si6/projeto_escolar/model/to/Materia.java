package br.edu.univas.si6.projeto_escolar.model.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="materia")
public class Materia {
	@Id
	@GeneratedValue ( strategy = GenerationType . SEQUENCE ,
	generator ="seq_materia")

	@SequenceGenerator ( name ="seq_materia",

	 sequenceName ="SEQ_MATERIA",

	 allocationSize =1)
	private int cod;
	private String nome;
	private int grade;
	
	public int getCod() {
		return cod;
	}
	public void setCod(int cod) {
		this.cod = cod;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	

}
