package lp1atividade2;
import java.util.Scanner;

public class Exercicio2 {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int valorInicial = 0;
		int valorFinal = 0;
		int valorOriginal = 0;
		
		do {
			System.out.println("Insira o valor inicial do contador");
		    valorInicial = sc.nextInt();
			
			System.out.println("Insira o valor final do contador");
			valorFinal = sc.nextInt();
			
			if(valorInicial >= valorFinal) {
				System.out.println("Valores Inválidos");
			}
			
			if(valorInicial < valorFinal) {
				while(valorInicial <= valorFinal) {
					System.out.println(valorInicial);
					valorInicial++;
					valorOriginal++;
				}
			}
			
			valorInicial = valorInicial - valorOriginal;
			
		} while(valorInicial >= valorFinal);
		
		sc.close();
		
	}

}
//Faça um programa que leia dois números inteiros, o primeiro é o valor inicial de um contador, e o segundo é o valor final do contador (testar se o valor inicial fornecido é inferior ao valor final). 
//Usando o comando While, escreva na tela uma contagem que comece no primeiro número lido, escreva os números seguintes colocando sempre apenas um número em cada nova linha da tela, e terminando a contagem quando chegar ao valor final indicado.