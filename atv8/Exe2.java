package atv8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exe2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean verifica = true;
		Integer valor1 = 0;
		Integer valor2 = 0;
		
		do{
			try {
				System.out.println("Insira o 1° valor");
				valor1 = sc.nextInt();
				System.out.println("Insira o 2° valor");
				valor2 = sc.nextInt();
				verifica = false;
			}
			catch(InputMismatchException e){
				System.out.println("Valor incorreto, insira um inteiro");
				sc.nextLine();
			}
		} while(verifica);
		
		System.out.println("Resultado da Multiplicação entre os termos é: " + (valor1 * valor2));
		sc.close();
	}
}
//Escreva um programa Java que apresente um exemplo de tratamento exceção do tipo: InputMismatchException.