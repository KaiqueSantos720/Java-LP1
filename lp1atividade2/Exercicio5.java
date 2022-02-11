package lp1atividade2;
import java.util.Scanner;

public class Exercicio5 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira um número para realizar a tabuada");
		int numero = sc.nextInt();
		double[] tabuada = new double[10];
		
		for(int i = 0; i < 10; i++) {
			tabuada[i] = numero * (i+1); 
		}
		
		System.out.println("Exibindo a tabuada do " + numero);
		
		for(int i = 0; i < 10; i++) {
			System.out.println(numero + " * " + (i+1) + " = " + tabuada[i]);
		}
		
		sc.close();
	}

}
//Escreva um programa Java que pergunta um número ao usuário, e mostra sua tabuada completa (de 1 até 10).
