package br.edu.univas.si6.projeto_escolar.controller;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;


@ManagedBean
@ApplicationScoped
public class EscolarBean {

	public String paginaPrincipal() {
		return "paginaPrincipal";
	}
	
	public String paginaLogin(){
		return "login";
	}
	
	
}
