package lp1atividade2;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		
		int i = 0;
		while(i < 10) {
			System.out.println("Insira o n�mero " + (i+1));
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
		
		System.out.println("O maior n�mero � " + maior);
		
		sc.close();
		
	}

}
//Escreva um programa em Java que solicita 10 n�meros ao usu�rio, atrav�s de um la�o while, e ao final mostre qual destes n�meros � o maior.