package lp1avaliacao;
import java.util.Scanner;
public class Exercicio1 {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a senha");
		int senha = sc.nextInt();
		
		if(senha == 1234) {
			System.out.println("Acesso Permitido");
		}
		
		else {
			System.out.println("Acesso Negado");
		}
		
		sc.close();
	}
}
//Escreva um programa que verifique a validade de uma senha fornecida pelo usuário. A senha válida é o número 1234. Devem ser impressas as seguintes mensagens:


//ACESSO PERMITIDO caso a senha seja válida.

//ACESSO NEGADO caso a senha seja inválida.