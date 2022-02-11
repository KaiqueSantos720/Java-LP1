package lista2;
import java.util.Scanner;

public class Exercicio4 {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Integer numero = 0;
		
		do {
			
			System.out.println("Insira o número de asterísticos a ser exibidos");
			numero = sc.nextInt();
			
			if((numero > 100) || (numero < 0)) {
				System.out.println("Número Inválido");
			}
			
			else {
				for(int i = 0; i < numero; i++) {
					System.out.println(" * ");
				}
			}
			
			
		} while(numero != 0);
		
		System.out.println("Você digitou o número 0, o programa foi encerrado");
		
		sc.close();
		
	}

}
//Faça um programa que solicite um numero entre 1 e 100 ao
//usuário. O programa deve imprimir a mesma quantidade de
//asteriscos ‘*’ conforme o numero informado pelo usuário. O
//programa deve repetir a pergunta até o usuário informar o numero
//zero.