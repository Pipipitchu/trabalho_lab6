package br.edu.univas.si6.projeto_escolar.model.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

//import javax.faces.bean.ApplicationScoped;
//import javax.faces.bean.ManagedBean;

//@ManagedBean
//@ApplicationScoped
@Entity
@Table(name="usuarios")
@NamedQuery(name="UserTO.LocalizarNome",query="select nome from usuarios as u where u.nome=:nome")
public class UserTO {
	
	public static final String LOCALIZAR_NOME = "UserTO.LocalizarNome";
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cod;
	
	@Column(unique=true)
	private String nome;
	private String senha;
	private boolean admin;
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
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	@Override
	public int hashCode() {
		return getCod();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof UserTO) {
			UserTO user = (UserTO) obj;
			return user.getCod() == cod;
		}

		return false;
	}	
}