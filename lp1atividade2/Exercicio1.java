package lp1atividade2;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		double soma = 0;
		int numero = 0;
		
		do {
			
			System.out.println("Insira um número inteiro");
			numero = sc.nextInt();
			
			if(numero < 0) {
				System.out.println("Número inválido");
			}
			
			if (numero > 0) {
				soma = soma + numero;
				contador++;		
			}
			
		} while ((numero > 0) || (numero < 0));
		
		
		
		if(contador <= 0) {
			System.out.println("Não é possível obter média");
		}
		
		if(contador > 0) {
			double media = (soma/contador);
			System.out.println("Foram digitados " + contador + " números válidos e a média é " + String.format("%.2f", media));
			
		}
		
		sc.close();
		
	}

}
//Faça um programa em linguagem de programação Java que leia números inteiros maiores que zero. Quando for digitado o número zero, o programa deverá apresentar quantos números foram digitados e a média destes.