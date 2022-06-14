package br.com.generation.classes2;

public class Carro {

	//Atributos 
	
	String cor;
	String modelo;
	int ano;
	boolean legalizado;
	int velocidade=0;
	
	
	//Métodos
	void acelerar(int aceleracao) {
		velocidade = velocidade + aceleracao;
	}
	void freiar(int reduzir) {
		velocidade = velocidade - reduzir;
	}

	
}
