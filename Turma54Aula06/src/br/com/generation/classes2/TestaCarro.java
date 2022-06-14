package br.com.generation.classes2;

public class TestaCarro {

	public static void main(String[] args) {
		
		//estanciar um objeto -----> criar um objeto
		Carro x1 = new Carro();
		//Classe --> Objeto --> Construtor
			
		x1.modelo = "Corcel";
		x1.cor = "Azul";
		x1.ano = 1995;
		x1.legalizado = true;
		x1.velocidade = 0;
		
		System.out.println("Modelo: " + x1.modelo);
		System.out.println("Cor: " + x1.cor);
		System.out.println("Ano: " + x1.ano);
		System.out.println("Legalizado? " + x1.legalizado);
		System.out.println("Velocidade: " + x1.velocidade);
		
		x1.acelerar(100);
		System.out.println("Velocidade: " + x1.velocidade);
		
		x1.freiar(30);
		System.out.println("Nova Velocidade: " + x1.velocidade);
	}
	
}
