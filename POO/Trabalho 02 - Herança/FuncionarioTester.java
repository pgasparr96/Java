package trabalhopoo2_heranca_pack;
import java.util.Scanner;
public class FuncionarioTester {
	public static void main(String[] args) {
		System.out.println("***********************************");
		System.out.println("NomeAluno: Pedro Henrique");
		System.out.println("matricula: 0080013938");
		System.out.println("************************************");
		Funcionario funcionario = new Funcionario();
		Gerente gerente = new Gerente(12345);
		funcionario.setNomeFuncionario("Marcos Henrique");
		funcionario.setCpfFuncionario("356.809.857-70");
		funcionario.setSalarioFuncionario(900.00);
		funcionario.listar();
		System.out.println("\n");
		gerente.setNomeFuncionario("Larissa Rojas");
		gerente.setCpfFuncionario("860.037.060-39");
		gerente.setSalarioFuncionario(1400.00);
		gerente.listar(); 
	}
}
