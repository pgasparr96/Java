package polimorfismo_pack;
public class Canguru extends Mamiferos{
	public void usarBolsa() {
		System.out.println("O canguru est� usando a sua bolsa.");
	}
	@Override
	public void alimentar() {
		System.out.println("O Canguru est� se alimentando.");
	}
	@Override
	public void emitirSom() {
		System.out.println("O Canguru est� emitindo um som.");
	}
	@Override
	public void locomover() {
		System.out.println("O Canguru est� se locomovendo(saltando).");
	}
}
