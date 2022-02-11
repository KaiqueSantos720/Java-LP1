package lp1atividade4;

public class Calculadora {	
	
	public static Integer multiplicar(Integer n1, Integer n2) {
		return n1 * n2;
	}
	
	public static Double multiplicar(Double d1, Double d2) {
		return d1 * d2;
	}
	
	public static Integer cubo(Integer numeroCubo) {
		return numeroCubo * numeroCubo * numeroCubo;
	}
	
	public static String parImpar(Integer numero) {
		if(numero % 2 == 0) {
			if(numero == 0) {
				return "Zero";
			}
			else {
				return "Par";
			}
		}
		else {
			return "Impar";
		}
	}
}
//Escreva o código fonte da classe Calculadora. Crie métodos estáticos para:

//a) método multiplicar que recebe dois argumentos do tipo Integer e retorna o valor da multiplicação dos valores;

//b) sobrecarregue o método multiplicar que receba dois argumentos do tipo Double e retorna o valor da multiplicação dos valores;

//c) método cubo que recebe um argumento do tipo Integer e retorna o valor elevado ao cubo;

//d) método parimpar que recebe um argumento do tipo Integer e retorna a String “Par” caso o número seja par,
//ou a String “Impar” caso o número seja impar, ou retorne a String “Zero” caso o número seja igual a zero.