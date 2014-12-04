package br.edu.univas.si6.projeto_escolar.model.to;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;
@Entity
@Table(name="usuarios")
@NamedQuery(name="UsuariosTO.LocalizarNomeESenha",query="select cod,nome,senha from Usuarios as u where u.nome=:nome and u.senha=:senha")
public class Usuarios {
	
	public static final String LOCALIZAR_NOME_E_SENHA = "UsuariosTO.LocalizarNomeESenha";
	
	@Id
	@GeneratedValue ( strategy=GenerationType.SEQUENCE,generator ="seq_user")
	@SequenceGenerator ( name ="seq_user", sequenceName ="SEQ_USER",allocationSize =1)
	

	private int cod;
	private String nome;
	private String senha;
	private String nova_senha;
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
		System.out.println("passou em setNome usuario: "+nome);
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		System.out.println("passou em setSenha senha: "+senha);
		this.senha = senha;
	}
	public boolean isAdmin() {
		return admin;
	}
	public void setAdmin(boolean admin) {
		this.admin = admin;
	}
	public String getNova_senha() {
		return nova_senha;
	}
	public void setNova_senha(String nova_senha) {
		this.nova_senha = nova_senha;
	}
	
}
