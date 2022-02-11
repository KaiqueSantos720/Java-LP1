package lista2;
import java.util.Scanner;

public class Exercicio5 {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Integer numero = 0;
		Integer soma = 0;
		
		do {
			
			System.out.println("Insira um número a ser somado");
			numero = sc.nextInt();
			
			if(numero >= 0) {
				soma = soma + numero;
				System.out.println("A soma é: " + soma);
			}
			
		} while(numero >= 0);
		
		System.out.println("Você inseriu um número negativo, o resultado final é: " + soma);

		sc.close();
		
	}

}
//Construa um programa Java que imprima a soma de todos os
//valores positivos digitados pelo usuário até que ele digite um
//número negativo.