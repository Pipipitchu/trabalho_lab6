package br.edu.univas.si6.projeto_escolar.model.to;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Table(name="grade_2")
@NamedQuery(name="Grade_2TO.LocalizarNome",query="select nome from grade_2 as g2 where g2.nome=:nome")
public class Grade_2TO {
	//segundo grau
	
	public static final String LOCALIZAR_NOME = "Grade_2TO.LocalizarNome";	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cod;
	
	@Column(unique=true)
	private String nome;

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
}
