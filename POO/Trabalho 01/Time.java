package trabalho_poo;
public class Time {
	private String nomeTime;
	private int qtdVitorias;
	private int qtdEmpates;
	private int qtdDerrotas;
	private int qtdPontos;
	
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public int getQtdVitorias() {
		return qtdVitorias;
	}
	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}
	public int getQtdEmpates() {
		return qtdEmpates;
	}
	public void setQtdEmpates(int qtdEmpates) {
		this.qtdEmpates = qtdEmpates;
	}
	public int getQtdDerrotas() {
		return qtdDerrotas;
	}
	public void setQtdDerrotas(int qtdDerrotas) {
		this.qtdDerrotas = qtdDerrotas;
	}
	public int getQtdPontos() {
		return qtdPontos;
	}
	public void setQtdPontos(int qtdPontos) {
		this.qtdPontos = qtdPontos;
	}
	public void listar() {
		System.out.println("Time:" + this.nomeTime);
		System.out.println("Vitórias:" + this.qtdVitorias);
		System.out.println("Empates:" + this.qtdEmpates);
		System.out.println("Derrotas:" + this.qtdDerrotas);
		System.out.println("Pontos:" + this.qtdPontos);
	}
}

