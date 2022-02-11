package lp1;
import java.util.Scanner;
public class Exe6 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		Integer numerointeiro[] = new Integer[2];
		for(int i = 0; i<2; i++) {
			System.out.println("Entre com o numero " + (i+1));
			numerointeiro[i] = sc.nextInt();
		}
		Integer menor = numerointeiro[0];
		for(int i = 0; i<2; i++) {
			if(menor>numerointeiro[i]) {
				menor = numerointeiro[i];
			}
		}
		System.out.println("Menor número: " + menor);
		sc.close();
	}
}










//Escreva um programa em Java que leia dois números inteiros e determine qual é o menor.