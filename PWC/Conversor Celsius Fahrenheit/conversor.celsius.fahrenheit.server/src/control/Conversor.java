package control;

public class Conversor {
	public double conversortemp(String valor) throws Exception {
		String[] parts = valor.split(":");
		Integer opSelecionada = Integer.parseInt(parts[0]);
		double valorSeparado = Double.parseDouble(parts[1]);
		
		if(opSelecionada == 1) {
			return this.c2f(valorSeparado);
		}
		else if(opSelecionada == 2) {
			return this.f2c(valorSeparado);
		} else {
			throw new Exception("Erro!");
		}
	}
	
	public double f2c(double celsius) {
		return (celsius - 32)*5/9;
	}
	
	public double c2f(double fahrenheit) {
		return (fahrenheit*1.8)+32;
	}
}
