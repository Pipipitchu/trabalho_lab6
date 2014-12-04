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
@Table(name="professores")
//@NamedQuery(name="ProfessoresTO.LocalizarNome",query="select nome from professores as p where p.nome=:nome")
public class Professores {
	
	public static final String LOCALIZAR_NOME = "ProfessoresTO.LocalizarNome";
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq_prof")
	@SequenceGenerator( name ="seq_prof",sequenceName ="seq_prof",allocationSize =1) 
	private int cod;
	
	@Column(unique=true)
	private String nome;
	private String sexo;
	private Integer idade;
	private String cidade;
	private String estado;
	private String estado_civil;	
	private String grauDeInstrucao;
	private boolean especializacao;
	private String ultima_inst;
	private String titulacao;
	private String area;
	private String area_inst;
	private String m_principal;
	private String m_secundaria;
	
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

	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getGrauDeInstrucao() {
		return grauDeInstrucao;
	}
	public void setGrauDeInstrucao(String grauDeInstrucao) {
		this.grauDeInstrucao = grauDeInstrucao;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	public String getArea_inst() {
		return area_inst;
	}
	public void setArea_inst(String area_inst) {
		this.area_inst = area_inst;
	}
	public String getUltima_inst() {
		return ultima_inst;
	}
	public void setUltima_inst(String ultima_inst) {
		this.ultima_inst = ultima_inst;
	}
	
	public boolean isEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(boolean especializacao) {
		this.especializacao = especializacao;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getM_principal() {
		return m_principal;
	}
	public void setM_principal(String m_principal) {
		this.m_principal = m_principal;
	}
	public String getM_secundaria() {
		return m_secundaria;
	}
	public void setM_secundaria(String m_secundaria) {
		this.m_secundaria = m_secundaria;
	}
}
