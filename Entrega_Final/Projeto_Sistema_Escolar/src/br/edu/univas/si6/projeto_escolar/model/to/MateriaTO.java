package br.edu.univas.si6.projeto_escolar.model.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="materia")
@NamedQuery(name="MateriaTO.LocalizarNome",query="select cod from materia as m where m.nome=:nome")
public class MateriaTO {
	
	public static final String LOCALIZAR_NOME = "MateriaTO.LocalizarNome";
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cod;
	
	@Column(unique=true)
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
