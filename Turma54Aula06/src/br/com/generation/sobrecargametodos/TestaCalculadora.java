package br.com.generation.sobrecargametodos;

public class TestaCalculadora {

	public static void main(String[] args) {
		
		MinhaCalculadora calc = new MinhaCalculadora();
		
		//somando dois inteiros...
		System.out.println(calc.soma(10, 100));
		
		//somar dois valores fracionarios...
		System.out.println(calc.soma(10.0, 120.0));
		
		System.out.println(calc.soma(9, 12.0));
		
		System.out.println(calc.multiplicacao(3, 2));
	}
}
