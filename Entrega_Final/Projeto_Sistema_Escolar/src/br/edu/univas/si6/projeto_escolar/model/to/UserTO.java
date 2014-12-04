package br.edu.univas.si6.projeto_escolar.model.to;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;

import br.edu.univas.si6.projeto_escolar.model.dao.UsuariosDAO;
import br.edu.univas.si6.projeto_escolar.orm.HibernateUtil;

@ManagedBean
@ApplicationScoped
public class UserTO {
	public static final String LOCALIZAR_NOME = "UserTO.LocalizarNome";
	private String login;
	private String password;
	private EntityManager em = HibernateUtil.getEntityManager();
	private UsuariosDAO usersDAO = new UsuariosDAO(em);;

	public String getLogin() {
		if(login!=null){
			System.out.println("passou em getlogin usuario: "+login);
			System.out.println("resetando usuário...");
			login=null;
		}
		return login;
	}

	public void setLogin(String login) {
		System.out.println("passou em getlogin usuario: "+login);
		this.login = login;
	}

	public String getPassword() {
		if(password!=null){
			System.out.println("passou em getPassword senha: "+password);
			System.out.println("resetando senha...");
			password=null;
		}
		return password;
	}

	public void setPassword(String password) {
		System.out.println("passou em getPassword senha: "+password);
		this.password = password;
	}
	public String verificaSenha(){
		System.out.println("ok passou onde eu queria!");
		boolean teste=usersDAO.verificaLogin(login,password);
		System.out.println(teste);
		if(teste!=false){
			System.out.println("usuario "+login+" foi encontrado!");
			return "paginaPrincipal";
		}else{
			System.out.println("usuario "+login+" não encontrado!");
			return "login";
		}
	}
}
