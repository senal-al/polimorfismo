package aplicacao;

public class Arrays {

	public static void main(String[] args) {

		int tamanho;
		tamanho = 10;
		// Array cores
		String[] cores = new String[tamanho];
		cores[0] = "Branco";
		cores[5] = "Azul";
		cores[2] = "Vermelho";
		cores[1] = "Marom";
		cores[4] = "Preto";
		cores[6] = "Amarelo";
		cores[3] = "Rosa";

		int tArrayCores = cores.length;

		for (int i = 0; i < tArrayCores; i++) {
			System.out.println("A lista de cores é: " + cores[i]);
		}

//		System.out.println(cores[0]);
//		System.out.println(cores[1]);
//		System.out.println(cores[2]);
//		System.out.println(cores[3]);
//		System.out.println(cores[4]);
//		System.out.println(cores[5]);
//		System.out.println(cores[6]);
//		System.out.println(cores[7]);
//		System.out.println(cores[8]);
//		System.out.println(cores[9]);

		// --------------------------------
		System.out.println("--------------------------------");
		String frutas[] = { "Cajú", "Banana", "Maça", "Pinha" };
		System.out.println("O tamanho do array frutas é: " + frutas.length);

		// Leitura do Array frutas com o loop for padrão

		for (int i = 0; i < frutas.length; i++) {
			System.out.println("Index " + i + " :" + frutas[i]);
		}

		// For especial para leitura de Array.
		for (String fruta : frutas) {
			System.out.println("Lista de frutas: " + fruta);
		}

		// Criando o array com os números de 1 a 5

		int[] numeros = { 1, 2, 3, 4, 5 };

		// Loop for para exibir somente os números ímpares
		System.out.println("Números ímpares no array:");

		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 != 0) { // Verifica se o número é ímpar
				System.out.println(numeros[i]);
			}
		}

		// Loop for-each para exibir somente os números ímpares
		for (int numero : numeros) {
			if (numero % 2 != 0) { // Verifica se o número é ímpar
				System.out.println(numero);
			}
		}

		// Array com números
		int numeros1[] = { 2, 5, 3, 4, 1, 10};

		int soma = 0;
		double media;

		for (int i = 0; i < numeros1.length; i++) {
			soma += numeros1[i];
		}

		System.out.println("A soma dos números é: " + soma);

		media = soma / numeros1.length;
		System.out.println("A média é: " + media);
	}
}
