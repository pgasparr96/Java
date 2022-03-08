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
		 System.out.println("A Ave está construindo um ninho.");
	}
	@Override
	public void alimentar() {
		 System.out.println("A Ave está se alimentando.");
	}
	@Override
	public void emitirSom() {
		 System.out.println("A Ave está emitindo som.");
	}
	@Override
	public void locomover() {
		 System.out.println("A Ave está voando.");
	}
}
