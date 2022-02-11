package lp1atividade2;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		double soma = 0;
		int numero = 0;
		
		do {
			
			System.out.println("Insira um n�mero inteiro");
			numero = sc.nextInt();
			
			if(numero < 0) {
				System.out.println("N�mero inv�lido");
			}
			
			if (numero > 0) {
				soma = soma + numero;
				contador++;		
			}
			
		} while ((numero > 0) || (numero < 0));
		
		
		
		if(contador <= 0) {
			System.out.println("N�o � poss�vel obter m�dia");
		}
		
		if(contador > 0) {
			double media = (soma/contador);
			System.out.println("Foram digitados " + contador + " n�meros v�lidos e a m�dia � " + String.format("%.2f", media));
			
		}
		
		sc.close();
		
	}

}
//Fa�a um programa em linguagem de programa��o Java que leia n�meros inteiros maiores que zero. Quando for digitado o n�mero zero, o programa dever� apresentar quantos n�meros foram digitados e a m�dia destes.