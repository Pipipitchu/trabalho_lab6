package br.edu.univas.si6.projeto_escolar.model.to;

public class LancarNotas {

	private Integer ano;
	private Integer turma;
	private Integer bimestre;
	
	private boolean prova1;
	private boolean prova2;
	private boolean prova3;
	private boolean trabalho;
	private boolean exercicio;
	
	public Integer getAno() {
		return ano;
	}
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	public Integer getTurma() {
		return turma;
	}
	public void setTurma(Integer turma) {
		this.turma = turma;
	}
	public Integer getBimestre() {
		return bimestre;
	}
	public void setBimestre(Integer bimestre) {
		this.bimestre = bimestre;
	}
	public boolean isProva1() {
		return prova1;
	}
	public void setProva1(boolean prova1) {
		this.prova1 = prova1;
	}
	public boolean isProva2() {
		return prova2;
	}
	public void setProva2(boolean prova2) {
		this.prova2 = prova2;
	}
	public boolean isProva3() {
		return prova3;
	}
	public void setProva3(boolean prova3) {
		this.prova3 = prova3;
	}
	public boolean isTrabalho() {
		return trabalho;
	}
	public void setTrabalho(boolean trabalho) {
		this.trabalho = trabalho;
	}
	public boolean isExercicio() {
		return exercicio;
	}
	public void setExercicio(boolean exercicio) {
		this.exercicio = exercicio;
	}
	
	
}
