package br.edu.univas.si6.projeto_escolar.model.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
//import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name="alunos")
//@NamedQuery(name="AlunosTO.LocalizarNome",query="select nome from alunos as a where a.nome=:nome")
public class Alunos {
	
public static final String LOCALIZAR_NOME = "AlunosTO.LocalizarNome";
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_alu_1")
	@SequenceGenerator( name ="seq_alu_1",sequenceName ="seq_alu_1",allocationSize = 1) 
	private int cod;
	
	@Column(unique=true)
	private String nome;
	private String sexo;
	private int idade;
	private String n_mae;
	private String cidade;
	private String estado;
	private String pais;
	private boolean intercambio;
	private Integer tempo_intercambio;
	private String qtd_tempo_intercambio;
	private boolean bolsista;
	private String v_bolsa;
	private boolean fies;
	private boolean pne;
	private String qual_pne;
	private String ano;
	private boolean repetente;
	private int qtd_rep;
	private boolean transferido;
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
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
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
	public boolean isIntercambio() {
		return intercambio;
	}
	public void setIntercambio(boolean intercambio) {
		this.intercambio = intercambio;
	}
	public Integer getTempo_intercambio() {
		return tempo_intercambio;
	}
	public void setTempo_intercambio(Integer tempo_intercambio) {
		this.tempo_intercambio = tempo_intercambio;
	}
	public String getQtd_tempo_intercambio() {
		return qtd_tempo_intercambio;
	}
	public void setQtd_tempo_intercambio(String qtd_tempo_intercambio) {
		this.qtd_tempo_intercambio = qtd_tempo_intercambio;
	}
	public boolean isBolsista() {
		return bolsista;
	}
	public void setBolsista(boolean bolsista) {
		this.bolsista = bolsista;
	}
	public String getV_bolsa() {
		return v_bolsa;
	}
	public void setV_bolsa(String v_bolsa) {
		this.v_bolsa = v_bolsa;
	}
	public boolean isFies() {
		return fies;
	}
	public void setFies(boolean fies) {
		this.fies = fies;
	}
	
	public boolean isPne() {
		return pne;
	}
	public void setPne(boolean pne) {
		this.pne = pne;
	}
	public String getQual_pne() {
		return qual_pne;
	}
	public void setQual_pne(String qual_pne) {
		this.qual_pne = qual_pne;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public boolean isRepetente() {
		return repetente;
	}
	public void setRepetente(boolean repetente) {
		this.repetente = repetente;
	}
	public int getQtd_rep() {
		return qtd_rep;
	}
	public void setQtd_rep(int qtd_rep) {
		this.qtd_rep = qtd_rep;
	}
	public boolean isTransferido() {
		return transferido;
	}
	public void setTransferido(boolean transferido) {
		this.transferido = transferido;
	}
	public int getGrade() {
		return Grade;
	}
	public void setGrade(int grade) {
		Grade = grade;
	}
	
	
}
