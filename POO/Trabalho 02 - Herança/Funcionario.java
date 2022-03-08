package trabalhopoo2_heranca_pack;
public class Funcionario {
	private String nomeFuncionario;
	private String cpfFuncionario;
	private Double salarioFuncionario;
	public double getBonificacao() {
		double bonificacao = 0.5;
		return bonificacao*salarioFuncionario;
	}
	public String getNomeFuncionario() {
		return nomeFuncionario;
	}
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public String getCpfFuncionario() {
		return cpfFuncionario;
	}
	public void setCpfFuncionario(String cpfFuncionario) {
		this.cpfFuncionario = cpfFuncionario;
	}
	public Double getSalarioFuncionario() {
		return salarioFuncionario;
	}
	public void setSalarioFuncionario(Double salarioFuncionario) {
		this.salarioFuncionario = salarioFuncionario;
	}
	public void listar() {
		System.out.println("Nome:" + this.nomeFuncionario);
		System.out.println("CPF:" + this.cpfFuncionario);
		System.out.println("Salário:" + this.salarioFuncionario);
		System.out.println("Bonificação:"+this.getBonificacao());
	} 
}
