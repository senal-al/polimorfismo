package aplicacao;

import animais.Animal;
import animais.Cachorro;
import animais.Gato;
import calculadora.CalculadoraBase;

public class Main {

	public static void main(String[] args) {
		System.out.println("Aprendendo polimorfismo");

		// Implementar um objeto
		// Polimorfismo em tempo de compilação:
		CalculadoraBase calc = new CalculadoraBase();
		System.out.println(calc.somar(45, 45)); // 90
		System.out.println(calc.somar(45, 5, 45)); // 95
		System.out.println(calc.somar(25.5, 25.5)); // 51
		
		// Implementar a váriável meuAnimal que é do tipo Animal.
		Animal meuAnimal;
		
		// Pode-se usar um objeto da classe derivada através de uma 
		//referência da super classe.
		
		meuAnimal = new Cachorro();
		meuAnimal.fazerSom();
		
		meuAnimal = new Gato();
		meuAnimal.fazerSom();
		
	}

}
