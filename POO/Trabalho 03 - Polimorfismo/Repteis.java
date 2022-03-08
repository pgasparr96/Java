package polimorfismo_pack;
public class Repteis extends Animal {
	private String corEscama;
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	@Override
	public void alimentar() {
		System.out.println("O Réptil está comendo.");
	}
	@Override
	public void emitirSom() {
		System.out.println("O Réptil está emitindo um som.");
	}
	@Override
	public void locomover() {
		System.out.println("O Réptil está se locomovendo");
	}
}
