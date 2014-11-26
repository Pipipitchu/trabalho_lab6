package br.edu.univas.si6.projeto_escolar.model.to;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Table(name="alunos")
@NamedQuery(name="AlunosTO.LocalizarNome",query="select nome from alunos as a where a.nome=:nome")
public class AlunosTO {
	
public static final String LOCALIZAR_NOME = "AlunosTO.LocalizarNome";
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cod;
	
	@Column(unique=true)
	private String nome;
	private String sexo;
	private String idade;
	private String n_mae;
	private String cidade;
	private String estado;
	private String pais;
	private String intercambio;
	private int ano;
	private String repetente;
	private int qtd_rep;
	private String transferido;
	private String bolsista;
	private String fies;
	private String pne;
	private int Grade;
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getN_mae() {
		return n_mae;
	}
	public void setN_mae(String n_mae) {
		this.n_mae = n_mae;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getIntercambio() {
		return intercambio;
	}
	public void setIntercambio(String intercambio) {
		this.intercambio = intercambio;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getRepetente() {
		return repetente;
	}
	public void setRepetente(String repetente) {
		this.repetente = repetente;
	}
	public int getQtd_rep() {
		return qtd_rep;
	}
	public void setQtd_rep(int qtd_rep) {
		this.qtd_rep = qtd_rep;
	}
	public String getTransferido() {
		return transferido;
	}
	public void setTransferido(String transferido) {
		this.transferido = transferido;
	}
	public String getBolsista() {
		return bolsista;
	}
	public void setBolsista(String bolsista) {
		this.bolsista = bolsista;
	}
	public String getFies() {
		return fies;
	}
	public void setFies(String fies) {
		this.fies = fies;
	}
	public String getPne() {
		return pne;
	}
	public void setPne(String pne) {
		this.pne = pne;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}
}
