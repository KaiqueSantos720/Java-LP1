package lp1avaliacao;
import java.util.Scanner;
public class Exercicio5 {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a idade");
		int idade = sc.nextInt();
		
		if(idade < 0) {
			System.out.println("Idade Inv�lida");
		}
		
		if((idade >= 0) && (idade < 16)) {
			System.out.println("N�o Pode Votar");
		}
		
		if(idade >= 16) {
			System.out.println("Pode Votar");
		}
		
		sc.close();
		
	}
}

//Fa�a um programa Java que solicita a idade de uma pessoa e informa se ela pode votar (idade>=16).