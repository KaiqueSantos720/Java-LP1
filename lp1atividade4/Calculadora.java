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
//Escreva o c�digo fonte da classe Calculadora. Crie m�todos est�ticos para:

//a) m�todo multiplicar que recebe dois argumentos do tipo Integer e retorna o valor da multiplica��o dos valores;

//b) sobrecarregue o m�todo multiplicar que receba dois argumentos do tipo Double e retorna o valor da multiplica��o dos valores;

//c) m�todo cubo que recebe um argumento do tipo Integer e retorna o valor elevado ao cubo;

//d) m�todo parimpar que recebe um argumento do tipo Integer e retorna a String �Par� caso o n�mero seja par,
//ou a String �Impar� caso o n�mero seja impar, ou retorne a String �Zero� caso o n�mero seja igual a zero.