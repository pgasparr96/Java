package polimorfismo_pack;
public class Peixes extends Animal {
	private String corEscama;
	public String getCorEscama() {
		return corEscama;
	}
	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	public void soltarBolha() {
		System.out.println("O Peixe est� soltando bolhas.");
	}
	@Override
	public void alimentar() {
		System.out.println("O Peixe est� se alimentando.");
	}
	@Override 
	public void emitirSom() {
		System.out.println("O Peixe est� emitindo um som.");
	}
	@Override
	public void locomover() {
		System.out.println("O Peixe est� nadando.");
	}
}
