package br.com.generation.atividades;

import java.util.Scanner;

public class Veterinaria {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("===============================");
		System.out.println("|      CLINICA VETERINARIA    |");
		System.out.println("|             DO              |");
		System.out.println("|         DR. VINICIUS        |");
		System.out.println("===============================");
		
		Cachorro dog = new Cachorro();
				
		dog.setNome("Kiara");
		dog.setIdade(4);
		dog.setCorre("Sim, bastante!");
		dog.setLate("Sim, faz auau");
		
		System.out.println("Nome: "+dog.getNome());
		System.out.println("Idade: "+dog.getIdade()+" anos");
		System.out.println("Corre? "+dog.getCorre());
		System.out.println("Emite som? "+dog.getLate());
		System.out.println();
		
		Cavalo cavalin = new Cavalo();
		
		cavalin.setNome("Pédipano");
		cavalin.setIdade(15);
		cavalin.setCorre("Sim, muito rapido!");
		cavalin.setRelincha("Sim, o mais bonito do Brasil!");
		
		System.out.println("Nome: "+cavalin.getNome());
		System.out.println("Idade: "+cavalin.getIdade()+" anos");
		System.out.println("O animal corre? "+cavalin.getCorre());
		System.out.println("Emite som? "+cavalin.getRelincha());
		System.out.println();
		
		Preguica sonin = new Preguica();
		
		sonin.setNome("Sid");
		sonin.setIdade(23);
		sonin.setSom("Sim, um grunhido esquisito");
		sonin.setArvores("Demora pra subir, mas sobe");
		
		System.out.println("Nome: "+sonin.getNome());
		System.out.println("Idade: "+sonin.getIdade()+" anos");
		System.out.println("Emite som? "+sonin.getSom());
		System.out.println("Sobe em arvores? "+sonin.getArvores());
		
	
	}
}
