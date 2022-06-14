package br.com.generation.polimorfismo;

public class Subtracao extends OperacaoMatematica {

	@Override
	public double calcular (double x, double y) {
		System.out.print("Subtração: ");
		return x-y;
		
	}	
}
