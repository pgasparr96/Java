package trabalhopoo2_heranca_pack;
public class Gerente extends Funcionario {
	private int senhaEspecial;
	private int numeroFunGen;
	public double getBonificacao() {
		double bonificacao = super.getBonificacao();
		return bonificacao+1000;
	}
	public void autentica(int senhaEspecial) {
		if(senhaEspecial == 12345) {
			System.out.println("Acesso permitido!");
		}
		else {
			System.out.println("Acesso negado!");
		}
	}
	public int getNumerodeFuncionariosGerenciados() {
		return numeroFunGen;
	}
	public void setNumerodeFuncionariosGerenciados(int numeroFunGen) {
		this.numeroFunGen = numeroFunGen;
	}
	public Gerente(int senha) {
		this.senhaEspecial = senha;
	}
}
