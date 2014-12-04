package br.edu.univas.si6.projeto_escolar.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;

import br.edu.univas.si6.projeto_escolar.model.dao.AlunosDAO;
import br.edu.univas.si6.projeto_escolar.model.dao.ProfessoresDAO;
import br.edu.univas.si6.projeto_escolar.model.dao.UsersDAO;
import br.edu.univas.si6.projeto_escolar.model.dao.UsuariosDAO;
import br.edu.univas.si6.projeto_escolar.model.to.Alunos;
import br.edu.univas.si6.projeto_escolar.model.to.Materia;
import br.edu.univas.si6.projeto_escolar.model.to.Professores;
import br.edu.univas.si6.projeto_escolar.model.to.UserTO;
import br.edu.univas.si6.projeto_escolar.model.to.Usuarios;
import br.edu.univas.si6.projeto_escolar.orm.HibernateUtil;



@ManagedBean
public class EscolarBean {
	
	private Alunos alunosTO;
	private AlunosDAO alunosDAO;
	private Professores professoresTO;
	private ProfessoresDAO professoresDAO;
	private Materia materiaTO;
	private Usuarios userTO;
	private UsuariosDAO usersDAO;
	private UsuariosDAO userTestSenha;
//	private ArrayList<AlunosTO> alunos;
//	private ArrayList<ProfessoresTO> professores;
	private EntityManager em = HibernateUtil.getEntityManager();
	
	public EscolarBean() {
		if(alunosTO==null){
			System.out.println("gerando novo alunosTO...");
			alunosTO = new Alunos();
		}
		if(alunosDAO==null){
			System.out.println("gerando AlunosDAO(em)...");
//			System.out.println("gerando array alunos");
//			alunos=new ArrayList<AlunosTO>();
			alunosDAO = new AlunosDAO(em);
		}
		if(professoresTO==null){
			System.out.println("gerando professoresTO...");
			professoresTO = new Professores();
		}
		if(professoresDAO==null){
			System.out.println("gerando ProfessoresDAO(em)...");
			professoresDAO = new ProfessoresDAO(em);
//			System.out.println("gerando array professores");
//			professores=new ArrayList<ProfessoresTO>();
		}
		materiaTO = new Materia();
		userTO = new Usuarios();
		usersDAO = new UsuariosDAO(em);
	}
	
	public Alunos getAlunosTO() {
		return alunosTO;
	}


	public void setAlunosTO(Alunos alunosTO) {
		this.alunosTO = alunosTO;
	}
	
	public Professores getProfessoresTO() {
		return professoresTO;
	}

	public void setProfessoresTO(Professores professoresTO) {
		this.professoresTO = professoresTO;
	}

	public void salvarAluno(ActionEvent actionEvent){
		addMessage("Aluno salvo com sucesso!");
		System.out.println("pra salvar:");
		System.out.println(alunosTO.getCod());
		System.out.println(alunosTO.getNome());
		System.out.println(alunosTO.getSexo());
		System.out.println(alunosTO.getIdade());
		System.out.println(alunosTO.getN_mae());
		System.out.println(alunosTO.getCidade());
		System.out.println(alunosTO.getEstado());
		System.out.println(alunosTO.getPais());
		System.out.println(alunosTO.isIntercambio());
		System.out.println(alunosTO.getTempo_intercambio());
		System.out.println(alunosTO.getQtd_tempo_intercambio());
		System.out.println(alunosTO.isBolsista());
		System.out.println(alunosTO.getV_bolsa());
		System.out.println(alunosTO.isFies());
		System.out.println(alunosTO.isPne());
		System.out.println(alunosTO.getQual_pne());
		System.out.println(alunosTO.getAno());
		System.out.println(alunosTO.isRepetente());
		System.out.println(alunosTO.getQtd_rep());
		System.out.println(alunosTO.isTransferido());
		alunosDAO.salvar(alunosTO);
		//resetando campos...
		alunosTO.setNome(null);
		alunosTO.setSexo(null);
		alunosTO.setIdade(0);
		alunosTO.setN_mae(null);
		alunosTO.setCidade(null);
		alunosTO.setEstado(null);
		alunosTO.setPais(null);
		alunosTO.setIntercambio(false);
		alunosTO.setTempo_intercambio(null);
		alunosTO.setQtd_tempo_intercambio(null);
		alunosTO.setBolsista(false);
		alunosTO.setV_bolsa(null);
		alunosTO.setFies(false);
		alunosTO.setPne(false);
		alunosTO.setQual_pne(null);
		alunosTO.setAno(null);
		alunosTO.setRepetente(false);
		alunosTO.setQtd_rep(0);
		alunosTO.setTransferido(false);
	}
	
	public void salvarProfessor(ActionEvent actionEvent){
		addMessage("Professor salvo com sucesso!");
		System.out.println(professoresTO.getNome());
		System.out.println(professoresTO.getSexo());
		System.out.println(professoresTO.getIdade());
		System.out.println(professoresTO.getCidade());
		System.out.println(professoresTO.getEstado_civil());
		System.out.println(professoresTO.getEstado());
		System.out.println(professoresTO.getGrauDeInstrucao());
		System.out.println(professoresTO.isEspecializacao());
		System.out.println(professoresTO.getUltima_inst());
		System.out.println(professoresTO.getTitulacao());
		System.out.println(professoresTO.getArea());
		System.out.println(professoresTO.getArea_inst());
		professoresDAO.salvar(professoresTO);
		//resetando campos
		professoresTO.setNome(null);
		professoresTO.setSexo(null);
		professoresTO.setIdade(null);
		professoresTO.setCidade(null);
		professoresTO.setEstado_civil(null);
		professoresTO.setEstado(null);
		professoresTO.setGrauDeInstrucao(null);
		professoresTO.setEspecializacao(false);
		professoresTO.setUltima_inst(null);
		professoresTO.setTitulacao(null);
		professoresTO.setArea(null);
		professoresTO.setArea_inst(null);
	}
	
	public Usuarios getUserTO() {
		return userTO;
	}

	public void setUserTO(Usuarios userTO) {
		this.userTO = userTO;
	}

	public void alterarSenha(ActionEvent actionEvent){
		
		Usuarios teste=usersDAO.alteraUsuario(userTO.getCod(),userTO.getNome(),userTO.getSenha());
		if(teste != null){
			userTO.setCod(teste.getCod());
			usersDAO.update(userTO);
			addMessage("Senha alterada com sucesso!");
		}else{
			addErrorMessage("Usuário e/ou senha inválidos!");
		}
	}
	
	private void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	private void addErrorMessage(String summary){
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	
	public Materia getMateriaTO() {
		return materiaTO;
	}

	public void setMateriaTO(Materia materiaTO) {
		this.materiaTO = materiaTO;
	}

	public String paginaPrincipal() {
		return "paginaPrincipal";
	}
	
	public String paginaLogin(){
		return "login";
	}
	public String verificaSenha(){
		boolean teste=usersDAO.verificaLogin(userTO.getNome(),userTO.getSenha());
		if(teste == true){
			System.out.println("usuario "+userTO.getNome()+" foi encontrado!");
			return "paginaPrincipal";
		}else{
			System.out.println("usuario "+userTO.getNome()+" nao encontrado!");
			return "login";
		}
	}
	
}
