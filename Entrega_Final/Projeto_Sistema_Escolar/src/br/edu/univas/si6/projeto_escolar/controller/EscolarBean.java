package br.edu.univas.si6.projeto_escolar.controller;

import java.util.ArrayList;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.persistence.EntityManager;

import org.primefaces.event.CellEditEvent;

import br.edu.univas.si6.projeto_escolar.model.dao.AlunosDAO;
import br.edu.univas.si6.projeto_escolar.model.dao.EventosDAO;
import br.edu.univas.si6.projeto_escolar.model.dao.NotasDAO;
import br.edu.univas.si6.projeto_escolar.model.dao.ProfessoresDAO;
import br.edu.univas.si6.projeto_escolar.model.dao.UsuariosDAO;
import br.edu.univas.si6.projeto_escolar.model.to.Alunos;
import br.edu.univas.si6.projeto_escolar.model.to.Eventos;
import br.edu.univas.si6.projeto_escolar.model.to.LancarNotas;
import br.edu.univas.si6.projeto_escolar.model.to.Materia;
import br.edu.univas.si6.projeto_escolar.model.to.MateriasMedio;
import br.edu.univas.si6.projeto_escolar.model.to.MateriasPrimario;
import br.edu.univas.si6.projeto_escolar.model.to.Professores;
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
	private Eventos eventosTO;
	private LancarNotas lancarNotas;
	private MateriasPrimario materiasPrimario;
	private MateriasMedio materiasMedio;
	private UsuariosDAO usersDAO;
	private EventosDAO eventosDAO;
	private NotasDAO notasDAO;
//	private Collection<AlunosDAO> object; 
	private ArrayList<String> resultado; 
	private ArrayList<String> testes;
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
		eventosTO = new Eventos();
		lancarNotas = new LancarNotas();
		resultado = new ArrayList<String>();
		testes = new ArrayList<String>();
		materiasPrimario = new MateriasPrimario();
		materiasMedio = new MateriasMedio();
		usersDAO = new UsuariosDAO(em);
		eventosDAO = new EventosDAO(em);
		notasDAO = new NotasDAO(em);
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
		if(alunosTO.getAno().equals("1col") || alunosTO.getAno().equals("2col") || alunosTO.getAno().equals("3col")){
			alunosTO.setGrade(2);
		}else{
			alunosTO.setGrade(1);
		}
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
	
	public void salvarEvento(ActionEvent actionEvent){
		addMessage("Evento salvo com sucesso!");
		eventosDAO.salvar(eventosTO);
		System.out.println(eventosTO.getData());
		System.out.println(eventosTO.getTurma());
		System.out.println(eventosTO.getBimestre());
		System.out.println(eventosTO.isProva1());
		System.out.println(eventosTO.isProva2());
		System.out.println(eventosTO.isProva3());
		System.out.println(eventosTO.isTrabalho());
		System.out.println(eventosTO.isExercicio());
		eventosTO.setData(null);
		eventosTO.setTurma(null);
		eventosTO.setBimestre(null);
		eventosTO.setProva1(false);
		eventosTO.setProva2(false);
		eventosTO.setProva3(false);
		eventosTO.setTrabalho(false);
		eventosTO.setTrabalho(false);
	}
	
	public Usuarios getUserTO() {
		return userTO;
	}

	public void setUserTO(Usuarios userTO) {
		this.userTO = userTO;
	}
	

	public Eventos getEventosTO() {
		return eventosTO;
	}

	public void setEventosTO(Eventos eventosTO) {
		this.eventosTO = eventosTO;
	}

	public void alterarSenha(ActionEvent actionEvent){
		
		boolean teste=usersDAO.alteraUsuario(userTO.getNome(),userTO.getSenha());
		if(teste != false){
			userTO.setCod(usersDAO.procuraPorNome(userTO.getNome(),userTO.getSenha())); 
			System.out.println("procurando por: "+userTO.getNome()+"cod: "+userTO.getCod());
			userTO.setSenha(userTO.getNova_senha());
			userTO.setNova_senha(null);
			usersDAO.update(userTO);
			addMessage("Senha alterada com sucesso!");
		}else{
			addErrorMessage("Usuário e/ou senha inválidos!");
		}
	}
	
	public LancarNotas getLancarNotas() {
		return lancarNotas;
	}

	public void setLancarNotas(LancarNotas lancarNotas) {
		this.lancarNotas = lancarNotas;
	}
	
	//Este método contém os valores do select para buscar as notas
	public String buscarAsNotas() {
		System.out.println(lancarNotas.getAno());
		System.out.println(lancarNotas.getTurma());
		System.out.println(lancarNotas.getBimestre());
		System.out.println(lancarNotas.isProva1());
		System.out.println(lancarNotas.isProva2());
		System.out.println(lancarNotas.isProva3());
		System.out.println(lancarNotas.isExercicio());
		System.out.println(lancarNotas.isTrabalho());
		String aluno = null;
		switch (lancarNotas.getTurma()) {
		case 1:
			aluno = "1ano";
			break;
		case 2:
			aluno = "2ano";
			break;
		case 3:
			aluno = "3ano";
			break;
		case 4:
			aluno = "4ano";
			break;
		case 5:
			aluno = "5ano";
			break;
		case 6:
			aluno = "6ano";
			break;
		case 7:
			aluno = "7ano";
			break;
		case 8:
			aluno = "8ano";
			break;
		case 9:
			aluno = "9ano";
			break;
		case 21:
			aluno = "1col";
			break;
		case 22:
			aluno = "2col";
			break;
		case 23:
			aluno = "3col";
			break;
		}
		resultado = alunosDAO.procurarAluno(aluno);
		System.out.println("teste "+resultado);
		int count=1;
		for (String elementos : resultado) {
			testes.add(elementos);
			System.out.println(count+" elemento contido: "+elementos);
		}
		count=1;
		System.out.println("teste concluido no EscolarBean...");
		System.out.println(testes.size());
//		ArrayList<Alunos> listaAlunos=new ArrayList<Alunos>();
//		object = object.toString();
//		System.out.println(resultado.toString());
		
//		alunosTO.setNome();

		if(lancarNotas.getTurma() == 21 || lancarNotas.getTurma() == 22 || lancarNotas.getTurma() == 23){
			return "lancarNotas1";
		}else{
			return "lancarNotas11";
		}
	}
	
	public ArrayList<String> getTestes() {
		return testes;
	}

	public void setTestes(ArrayList<String> testes) {
		this.testes = testes;
	}
		
	public void salvarPrimario(ActionEvent actionEvent){
		System.out.println(lancarNotas.getAno());
		System.out.println(lancarNotas.getTurma());
		System.out.println(lancarNotas.getBimestre());
		System.out.println(lancarNotas.isProva1());
		System.out.println(lancarNotas.isProva2());
		System.out.println(lancarNotas.isProva3());
		System.out.println(lancarNotas.isExercicio());
		System.out.println(lancarNotas.isTrabalho());
		System.out.println(materiasPrimario.getPortugues()+", "+materiasPrimario.getPortuguesCod());
		System.out.println(materiasPrimario.getMatematica()+", "+materiasPrimario.getMatematicaCod());
		System.out.println(materiasPrimario.getHistoria()+", "+materiasPrimario.getHistoriaCod());
		System.out.println(materiasPrimario.getGeografia()+", "+materiasPrimario.getGeografiaCod());
		System.out.println(materiasPrimario.getCiencias()+", "+materiasPrimario.getCienciasCod());
		System.out.println(materiasPrimario.getInformatica()+", "+materiasPrimario.getInformaticaCod());
		System.out.println(materiasPrimario.getEdFisica()+", "+materiasPrimario.getEdFisicaCod());
		System.out.println(materiasPrimario.getEdReligiosa()+", "+materiasPrimario.getEdReligiosaCod());
		//notasDAO.salvar(materiasPrimario);
		addMessage("Notas salvas com sucesso!");
	}
	
	public void salvarMedio(ActionEvent actionEvent){
		System.out.println(lancarNotas.getAno());
		System.out.println(lancarNotas.getTurma());
		System.out.println(lancarNotas.getBimestre());
		System.out.println(lancarNotas.isProva1());
		System.out.println(lancarNotas.isProva2());
		System.out.println(lancarNotas.isProva3());
		System.out.println(lancarNotas.isExercicio());
		System.out.println(lancarNotas.isTrabalho());
		System.out.println(materiasMedio.getPortugues()+", "+materiasMedio.getPortuguesCod());
		System.out.println(materiasMedio.getMatematica()+", "+materiasMedio.getMatematicaCod());
		System.out.println(materiasMedio.getHistoria()+", "+materiasMedio.getHistoriaCod());
		System.out.println(materiasMedio.getGeografia()+", "+materiasMedio.getGeografiaCod());
		System.out.println(materiasMedio.getFisica()+", "+materiasMedio.getFisicaCod());
		System.out.println(materiasMedio.getQuimica()+", "+materiasMedio.getQuimicaCod());
		System.out.println(materiasMedio.getBiologia()+", "+materiasMedio.getBiologiaCod());
		System.out.println(materiasMedio.getInformatica()+", "+materiasMedio.getInformaticaCod());
		System.out.println(materiasMedio.getEdFisica()+", "+materiasMedio.getEdFisicaCod());
		//notasDAO.salvar(materiasMedio);
		addMessage("Notas salvas com sucesso!");
	}

	public MateriasPrimario getMateriasPrimario() {
		return materiasPrimario;
	}

	public void setMateriasPrimario(MateriasPrimario materiasPrimario) {
		this.materiasPrimario = materiasPrimario;
	}

	public MateriasMedio getMateriasMedio() {
		return materiasMedio;
	}

	public void setMateriasMedio(MateriasMedio materiasMedio) {
		this.materiasMedio = materiasMedio;
	}

	private void addMessage(String summary) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
	}
	
	private void addErrorMessage(String summary){
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_FATAL, summary,  null);
        FacesContext.getCurrentInstance().addMessage(null, message);
	}

	public ArrayList<String> getResultado() {
		return resultado;
	}

	public void setResultado(ArrayList<String> resultado) {
		this.resultado = resultado;
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
	
	public void onCellEdit(CellEditEvent event) {
        Object oldValue = event.getOldValue();
        Object newValue = event.getNewValue();
         
        if(newValue != null && !newValue.equals(oldValue)) {
            FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Cell Changed", "Old: " + oldValue + ", New:" + newValue);
            FacesContext.getCurrentInstance().addMessage(null, msg);
        }
    }
}
