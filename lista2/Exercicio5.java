package lista2;
import java.util.Scanner;

public class Exercicio5 {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Integer numero = 0;
		Integer soma = 0;
		
		do {
			
			System.out.println("Insira um n�mero a ser somado");
			numero = sc.nextInt();
			
			if(numero >= 0) {
				soma = soma + numero;
				System.out.println("A soma �: " + soma);
			}
			
		} while(numero >= 0);
		
		System.out.println("Voc� inseriu um n�mero negativo, o resultado final �: " + soma);

		sc.close();
		
	}

}
//Construa um programa Java que imprima a soma de todos os
//valores positivos digitados pelo usu�rio at� que ele digite um
//n�mero negativo.