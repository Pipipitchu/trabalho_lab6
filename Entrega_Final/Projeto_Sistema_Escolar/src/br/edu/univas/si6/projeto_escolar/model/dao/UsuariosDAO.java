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
	private int encontrarUsuario2(int cod, String nome,String senha) {
		Map<String, Object> parametros = new HashMap<String, Object>();
//		parametros.put("cod", cod);
		parametros.put("nome", nome);
		parametros.put("senha", senha);
		Object[] object = super.encontra1Result(Usuarios.LOCALIZAR_NOME_E_SENHA,parametros);
		//debugar aqui valor do object[0] é o cod.
		System.out.println(object[0]);
		
		int codr=Integer.parseInt(object[0].toString());
		return codr;
	}
	public boolean verificaLogin(String nome,String senha ){
		System.out.println("entrou em verifica login");
		UsuariosDAO usuarioDAO = new UsuariosDAO(em);
		System.out.println("endereco usuarioDAO: "+usuarioDAO);
		boolean res = encontrarUsuario(nome, senha);
		return res;
	}
	public boolean alteraUsuario(String nome,String senha){
		System.out.println("entrou em Alterar Usuario");
		UsuariosDAO usuarioDAO = new UsuariosDAO(em);
		System.out.println("usuarioDAO criado com sucesso");
		System.out.println("endereco usuarioDAO: "+usuarioDAO);
		boolean res = encontrarUsuario(nome,senha);
		System.out.println("encontrou usuario "+nome);
		return res;
	}
	public int procuraPorNome(String nome,String senha){
		System.out.println("procurando por nome...");
		int cod=0;
		cod=encontrarUsuario2(cod,nome,senha);
		return cod;
	}

}
