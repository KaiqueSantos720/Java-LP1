package lp1avaliacao;
import java.util.Scanner;
public class Exercicio2 {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas ma��s deseja comprar?");
		int numeroMacas = sc.nextInt();
		double preco = 0;
		
		if(numeroMacas < 0) {
			System.out.println("Entrada Inv�lida");
		}
		
		if((numeroMacas < 12) && (numeroMacas >= 0)) {
			preco = (numeroMacas*0.30);		
			System.out.println("Pre�o total �: " + String.format("%.2f", preco));
		}
		
		if(numeroMacas >= 12) {
			preco = (numeroMacas*0.25);
			System.out.println("Pre�o total �: " + String.format("%.2f", preco));
		}
		
		sc.close();
	}
}
//As ma��s custam R$ 0,30 cada se forem compradas menos do que uma d�zia, e R$ 0,25 se forem compradas pelo menos doze. Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o valor total da compra.