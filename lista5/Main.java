package lista5;

public class Main {

	public static void main(String[] args) {
		
		Integer[] numeros = {3, 2, 3};
		Integer maior = maior(numeros);
		System.out.println("O maior número é: " + maior);
		
		Double[] valores = {3.6, 3.8, 4.0};
		Double maiorDouble = maiorDouble(valores);
		System.out.println("O maior valor é: " + maiorDouble);
	}
	
	public static Integer maior(Integer[] numeros) {
		Integer maior = numeros[0];
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		return maior;
	}
	
	public static Double maiorDouble(Double[] valores) {
		Double maior = valores[0];
		for(int i = 0; i < valores.length; i++) {
			if(valores[i] > maior) {
				maior = valores[i];
			}
		}
		return maior;
	}

}
