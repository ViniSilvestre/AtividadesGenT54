package br.com.generation.polimorfismo;

public class Soma extends OperacaoMatematica{
	
	@Override //--> sobreescrita de metodo ou pode ser chamado tbm de polimorfismo.
	public double calcular(double x, double y) {
		System.out.print("Soma: ");
		return x+y;
	}
	
}
