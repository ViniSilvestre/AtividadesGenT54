package br.com.generation.interface1;

public class Cachorro implements Animal{

	@Override // ---> sobreescrita de metodo
	public void somAnimal() {
		// TODO Auto-generated method stub
		System.out.println("O som do cachorro: au au");
	}

	@Override
	public void dormir() {
		// TODO Auto-generated method stub
		System.out.println("O cachorro dormindo...");
	}
	
	
	
}
