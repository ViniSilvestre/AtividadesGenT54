package br.com.generation.metodos;

import java.util.Scanner;

public class TestaMétodos {
	
	static int num3, num4, multiplicacao;//----> variaveis globais, consegue ser usada em qualquer metodo/bloco.
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o valor da variavel num3: ");
		num3 = entrada.nextInt();
		System.out.println("Digite o valor da variavel num4: ");
		num4 = entrada.nextInt();
		
		System.out.println("Olá sou o método principal!");
		
		metodo01();
		metodo02();
		metodo03();
		metodo04();
		TestaMetodoFora.metodo05();
		metodo06(90,20);
	}
	public static void metodo01() {
		System.out.println("Olá sou o método método0 1!");
		
	}
	public static void metodo02() { 
		//dentro do metodo, as variaveis declaradas funcionam apenas dentro dele.
		double num1=10, num2=30, soma; //---> variaveis locais.
			
		soma=num1+num2;
		System.out.println("soma realizada no método02: "+soma);
		
	}
	public static void metodo03() {
		multiplicacao = num3*num4;
			
	}
	public static void metodo04() {
		System.out.println("metodo04 está mostrando o calculo que foi feito no metado03: "+multiplicacao);
	
	}
	public static void metodo06(int num5, int num6) {
		int subtracao = num5-num6;
		System.out.println("A subtração no metodo06 é: "+subtracao);
		
	}
	
}
