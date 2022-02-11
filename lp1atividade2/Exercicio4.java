package lp1atividade2;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		
		int i = 0;
		while(i < 10) {
			System.out.println("Insira o número " + (i+1));
			numeros[i] = sc.nextInt();
			i++;
		}
		
		int maior = numeros[0];
		i = 0;
		
		while(i < 10) {
			if(maior < numeros[i]) {
				maior = numeros[i];
			}
			i++;
		}
		
		System.out.println("O maior número é " + maior);
		
		sc.close();
		
	}

}
//Escreva um programa em Java que solicita 10 números ao usuário, através de um laço while, e ao final mostre qual destes números é o maior.