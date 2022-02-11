package lp1;
import java.util.Scanner;
public class Exe5 {
	public static void main (String args[]) {
		Scanner sc = new Scanner (System.in);
		Integer ano = 0;
		Integer idade = 0;
		System.out.println("Entre com o ano de nascimento");
		ano = sc.nextInt();
		idade = (2021 - ano);
		if(ano<=2021) {
			System.out.println("Sua idade é " + idade);
		}
		else {
			System.out.println("Você ainda não nasceu, volte mais tarde.");
		}
		sc.close();
	}
}









//Faça um programa que solicite ao usuário o ano de nascimento. O programa deve informar a
//idade do usuário.