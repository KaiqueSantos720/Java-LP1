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
			System.out.println("Sua idade � " + idade);
		}
		else {
			System.out.println("Voc� ainda n�o nasceu, volte mais tarde.");
		}
		sc.close();
	}
}









//Fa�a um programa que solicite ao usu�rio o ano de nascimento. O programa deve informar a
//idade do usu�rio.