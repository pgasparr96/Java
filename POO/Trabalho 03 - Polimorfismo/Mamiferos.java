package polimorfismo_pack;
public class Mamiferos extends Animal {
	private String corPelo;
	public String getCorPelo() {
		return corPelo;
	}
	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}
	@Override
	public void alimentar() {
		System.out.println("O Mam�fero est� se alimentando.");
	}
	@Override
	public void emitirSom() {
		System.out.println("O Mam�fero est� emitindo som.");
	}
	@Override
	public void locomover() {
		System.out.println("O Mam�fero est� se locomovendo.");
	}
}