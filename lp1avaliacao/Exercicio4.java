package lp1avaliacao;
import java.util.Scanner;
public class Exercicio4 {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva um n�mero");
		int numero = sc.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("N�mero Par");
		}
		
		else {
			System.out.println("N�mero �mpar");
		}
		
		sc.close();
	}
}
//Escreva um programa na linguagem de programa��o Java que recebe um n�mero inteiro do usu�rio e informe se o n�mero � par ou �mpar.