package br.com.generation.encapsulamento;

import java.util.Scanner;

public class TestaVeiculo {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Veiculo carro = new Veiculo();
		
		
		System.out.println("Digite a Cor do Veiculo: ");
		carro.setCor(entrada.next());
		System.out.println("Digite o ano do Veiculo: ");
		carro.setIdade(entrada.nextInt());
		System.out.println("Digite a Marca do Veiculo: ");
		carro.setMarca(entrada.next());
		System.out.println("Digite o Modelo do Veiculo: ");
		carro.setModelo(entrada.next());
		
		System.out.println();
		
		System.out.println(carro.getCor());
		System.out.println(carro.getIdade());
		System.out.println(carro.getMarca());
		System.out.println(carro.getModelo());
		
	}
}