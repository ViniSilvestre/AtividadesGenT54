package br.com.generation.polimorfismo;

public class Subtracao extends OperacaoMatematica {

	@Override
	public double calcular (double x, double y) {
		System.out.print("Subtra��o: ");
		return x-y;
		
	}	
}
