package br.com.generation.polimorfismo;

public class Divisao extends OperacaoMatematica {

	@Override
	public double calcular (double x, double y) {
		System.out.print("Divis�o: ");
		return x/y;
		
	}	
}
