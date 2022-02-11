package lp1avaliacao;
import java.util.Scanner;
public class Exercicio4 {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um número");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("Número Par");
		}
		
		else {
			System.out.println("Número Ímpar");
		}
		
		sc.close();
	}
}
//Escreva um programa na linguagem de programação Java que recebe um número inteiro do usuário e informe se o número é par ou ímpar.