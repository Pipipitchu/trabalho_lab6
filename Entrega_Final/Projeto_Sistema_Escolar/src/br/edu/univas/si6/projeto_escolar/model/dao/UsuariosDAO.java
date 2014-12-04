package br.edu.univas.si6.projeto_escolar.model.dao;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.EntityManager;

import br.edu.univas.si6.projeto_escolar.model.to.Usuarios;

public class UsuariosDAO extends GenericDAO<Usuarios, Integer> {

	public UsuariosDAO(EntityManager em) {
		super(em);
	}
	public boolean encontrarUsuario(String usuario_nome,String usuario_senha){
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("nome", usuario_nome);
		parametros.put("senha", usuario_senha);
		Object object = super.encontra1Result(Usuarios.LOCALIZAR_NOME_E_SENHA,parametros);
		if(object==null){
			return false;
		}else{
			System.out.println("usuario encontrado!");
			return true;
		} 
	}
	private Usuarios encontrarUsuario2(int cod, String nome, String senha) {
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("cod", cod);
		parametros.put("nome", nome);
		parametros.put("senha", senha);
		Object object = super.encontra1Result(Usuarios.LOCALIZAR_NOME_E_SENHA,parametros);
		if(object==null){
			return null;
		}else{
			System.out.println("usuario encontrado!");
			return (Usuarios)object;
		} 

	}
	public boolean verificaLogin(String nome,String senha ){
		System.out.println("entrou em verifica login");
		UsuariosDAO usuarioDAO = new UsuariosDAO(em);
		System.out.println("endereco usuarioDAO: "+usuarioDAO);
		boolean res = encontrarUsuario(nome, senha);
		return res;
	}
	public Usuarios alteraUsuario(int cod, String nome,String senha){
		System.out.println("entrou em Alterar Usuario");
		UsuariosDAO usuarioDAO = new UsuariosDAO(em);
		System.out.println("endereco usuarioDAO: "+usuarioDAO);
		Usuarios res = encontrarUsuario2(cod,nome, senha);
		return res;
	}

}
