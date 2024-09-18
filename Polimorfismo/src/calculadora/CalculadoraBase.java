package calculadora;

public class CalculadoraBase {
/**
 * Está calsse é uma super classe. 
 * Será utilizada como base para estudo de polimorfismo.
 * 
 * */
	
	// Sobrecarga de método para somar dois inteiros
	public int somar(int a, int b) {
		return a + b;
	}
	
	// Sobrecarga de método para somar três inteiros
	public int somar(int a, int b, int c) {
		return a + b + c;
	}
	
	// Sobrecarga de método para somar dois números de ponto flutuante
	public double somar(double a, double b) {
		return a + b;
	}

}
