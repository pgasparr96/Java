package polimorfismo_pack;
public class Aves extends Animal {
	private String corPena;
	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	public String getCorPena() {
		return corPena;
	}
	public void fazerNinho() {
		 System.out.println("A Ave est� construindo um ninho.");
	}
	@Override
	public void alimentar() {
		 System.out.println("A Ave est� se alimentando.");
	}
	@Override
	public void emitirSom() {
		 System.out.println("A Ave est� emitindo som.");
	}
	@Override
	public void locomover() {
		 System.out.println("A Ave est� voando.");
	}
}
