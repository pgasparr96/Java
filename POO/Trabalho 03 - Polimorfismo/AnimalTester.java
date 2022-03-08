package polimorfismo_pack;
public class AnimalTester {
	public static void main(String[] args) {
		System.out.println("*************************************");
		System.out.println("Nome: Pedro Henrique");
		System.out.println("Matrícula: 0050013938");
		System.out.println("*************************************");
		
		Aves A= new Aves();
		Mamiferos M = new Mamiferos();
		Peixes P = new Peixes();
		Repteis R = new Repteis();
		Canguru C = new Canguru();
		
		A.setCorPena("Azul");
		A.setIdade(3);
		A.setMembros(2);
		A.setPeso(3);
		A.listar();
		A.fazerNinho();
		A.alimentar();
		A.emitirSom();
		A.locomover();
		System.out.println("********************************************************");
		System.out.println("\n");
		
		M.setCorPelo("Marrom");
		M.setIdade(9);
		M.setMembros(5);
		M.setPeso(70);
		M.listar();
		M.alimentar();
		M.emitirSom();
		M.locomover();
		System.out.println("********************************************************");
		System.out.println("\n");
		
		P.setCorEscama("Azul Claro");
		P.setIdade(7);
		P.setMembros(3);
		P.setPeso(1);
		P.listar();
		P.alimentar();
		P.emitirSom();
		P.locomover();
		P.soltarBolha();
		System.out.println("********************************************************");
		System.out.println("\n");
		
		R.setCorEscama("Verde");
		R.setIdade(19);
		R.setMembros(6);
		R.setPeso(50);
		R.listar();
		R.alimentar();
		R.emitirSom();
		R.locomover();
		System.out.println("********************************************************");
		System.out.println("\n");
		
		C.setCorPelo("Marrom");
		C.setIdade(9);
		C.setMembros(6);
		C.setPeso(70);
		C.listar();
		C.alimentar();
		C.emitirSom();
		C.locomover();
		C.usarBolsa();
		System.out.println("********************************************************");
		System.out.println("\n");
		
		
		
		
		
		
		

	}

}
