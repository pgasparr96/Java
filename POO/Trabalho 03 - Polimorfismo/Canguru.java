package polimorfismo_pack;
public class Canguru extends Mamiferos{
	public void usarBolsa() {
		System.out.println("O canguru está usando a sua bolsa.");
	}
	@Override
	public void alimentar() {
		System.out.println("O Canguru está se alimentando.");
	}
	@Override
	public void emitirSom() {
		System.out.println("O Canguru está emitindo um som.");
	}
	@Override
	public void locomover() {
		System.out.println("O Canguru está se locomovendo(saltando).");
	}
}
