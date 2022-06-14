package br.com.generation.heranca;

public class TestaTodoMundo {

	public static void main(String[] args) {
		
		Professor prof1 = new Professor();//construtor de classe, abre um espaço em memoria para criação do objeto
				
		prof1.setNome("Mario dos Santos");
		prof1.setIdade(25);
		prof1.setEndereco("Rua das Nações 255 - SP");
		
		prof1.setSalario(10000.00);
		
		prof1.setDisciplina("Geografia");
		System.out.println("=================");
		System.out.println("Nome: "+prof1.getNome());
		System.out.println("Idade: "+prof1.getIdade());
		System.out.println("End: "+prof1.getEndereco());
		System.out.println("Salario: "+" R$ "+prof1.getSalario());
		System.out.println("Disc: "+prof1.getDisciplina());
		
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome("Vinicius Silvestre");
		aluno1.setIdade(22);
		aluno1.setEndereco("Rua Gaivota 551 - SP");
		aluno1.setSemestre("6° Semestre");
		aluno1.setCurso("Analise de Sistemas");
		
		System.out.println("=================");
		System.out.println("Nome: "+aluno1.getNome());
		System.out.println("Idade: "+aluno1.getIdade());
		System.out.println("End: "+aluno1.getEndereco());
		System.out.println("Semestre: "+aluno1.getSemestre());
		System.out.println("Curso: "+aluno1.getCurso());
	
		FuncAdm func1 = new FuncAdm();
		
		func1.setNome("Maria Rosario");
		func1.setIdade(56);
		func1.setEndereco("Rua Almirantes 565 - SP");
		func1.setSetor("Secretaria");
		func1.setFuncao("Inspetora");
		func1.setSalario(2500.00);
		
		System.out.println("=================");
		System.out.println("Nome: "+func1.getNome());
		System.out.println("Idade: "+func1.getIdade());
		System.out.println("End: "+func1.getEndereco());
		System.out.println("Setor: "+func1.getSetor());
		System.out.println("Função: "+func1.getFuncao());
		System.out.println("Salário: "+" R$ "+func1.getSalario());
			
		
	}

}
