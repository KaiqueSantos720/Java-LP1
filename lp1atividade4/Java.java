package lp1atividade4;

public class Java {
	
	public static Integer min3(Integer n1, Integer n2, Integer n3) {
		if(n1 < n2) {
			if(n1 < n3) {
				return n1;
			}
			else {
				return n3;
			}
		}
		
		else {
			if(n2 < n3) {
				return n2;
			}
			else {
				return n3;
			}
		}
	}
	
	public static Double min3(Double d1, Double d2, Double d3) {
		if(d1 < d2) {
			if(d1 < d3) {
				return d1;
			}
			else {
				return d3;
			}
		}
		
		else {
			if(d2 < d3) {
				return d2;
			}
			else {
				return d3;
			}
		}
	} 
}
//Crie uma classe Java com um m�todo est�tico min3(), que recebe tr�s valores inteiros como argumentos e retorna o valor do menor n�mero. 
//Adicione a esta classe uma sobrecarga do m�todo min3(), que faz a mesma opera��o com valores do tipo Double.