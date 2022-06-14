package br.com.generation.atividadeclasses;

import java.util.Scanner;

public class TestaClientes {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		Clientes pessoa = new Clientes();
		
		System.out.println("Digite aqui seu nome: ");
		pessoa.setNome(entrada.next());	
		System.out.println("Digite aqui o seu sobrenome: ");
		pessoa.setSobrenome(entrada.next());
		System.out.println("Digite aqui seu sexo: ");
		pessoa.setSexo(entrada.next());
		System.out.println("Digite aqui sua Etnia: ");
		pessoa.setEtnia(entrada.next());
		System.out.println("Digite aqui sua Cidade: ");
		pessoa.setEndereco(entrada.next());		
		System.out.println("Digite aqui a sua idade: ");
		pessoa.setIdade(entrada.nextInt());
		System.out.println("Digite o número do seu documento sem pontos e traços: ");
		pessoa.setDocumento(entrada.nextInt());
		System.out.println("Digite seu número de cadastro da loja: ");
		pessoa.setCadastro(entrada.nextInt());
			
		System.out.println("====================================");
		System.out.println("|         CADASTRO DA LOJA         |");
		System.out.println("====================================");
		
		System.out.println();
		
		System.out.println("Nome: "+pessoa.getNome() +" "+ pessoa.getSobrenome());
		System.out.println("Sexo: "+pessoa.getSexo());
		System.out.println("Etnia: "+pessoa.getEtnia());
		System.out.println("Cidade: "+pessoa.getEndereco());
		System.out.println("Idade: "+pessoa.getIdade());
		System.out.println("Número do Documento: "+pessoa.getDocumento());
		System.out.println("Número de Cadastro: "+pessoa.getCadastro());
		
	}
}
