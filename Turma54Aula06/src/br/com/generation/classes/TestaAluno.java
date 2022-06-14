package br.com.generation.classes;

public class TestaAluno {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		
		aluno1.nome = "Felipe Camilo";
		aluno1.idade = 22;
		aluno1.curso = "Java Bloco I";
		
		
		System.out.println(aluno1.nome);
		System.out.println(aluno1.idade);
		System.out.println(aluno1.curso);
		aluno1.assistirAula();
		aluno1.estudar();
		
	}

}
