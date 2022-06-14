package br.com.generation.sobrecargametodos;

//Sobrecarga dos metodos 
public class MinhaCalculadora {

	public int soma(int numero1, int numero2) {
		return numero1 + numero2;
	}
	
	public double soma(double numero1, double numero2) {
		return numero1 + numero2;
	}
	
	public int multiplicacao(int numero1, int numero2) {
		return numero1 * numero2;
	}
}
