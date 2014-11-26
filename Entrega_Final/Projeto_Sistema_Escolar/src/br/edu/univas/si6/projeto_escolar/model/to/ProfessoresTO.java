package br.edu.univas.si6.projeto_escolar.model.to;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name="professores")
@NamedQuery(name="ProfessoresTO.LocalizarNome",query="select nome from professores as p where p.nome=:nome")
public class ProfessoresTO {
	
	public static final String LOCALIZAR_NOME = "ProfessoresTO.LocalizarNome";
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int cod;
	
	@Column(unique=true)
	private String nome;
	private String sexo;
	private String cidade;
	private String estado;
	private String pais;
	private String estado_civil;
	private String graduacao;
	private String instituicao;
	private String especializacao;
	private String area;
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
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getEstado_civil() {
		return estado_civil;
	}
	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}
	public String getGraduacao() {
		return graduacao;
	}
	public void setGraduacao(String graduacao) {
		this.graduacao = graduacao;
	}
	public String getInstituicao() {
		return instituicao;
	}
	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}
	public String getEspecializacao() {
		return especializacao;
	}
	public void setEspecializacao(String especializacao) {
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
