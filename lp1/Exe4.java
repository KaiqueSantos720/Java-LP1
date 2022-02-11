package lp1;
import java.util.Scanner;
public class Exe4 {
	public static void main (String args []) {
		Scanner sc = new Scanner (System.in);
		double notas[] = new double[4];
		double soma = 0;
		for(int i = 0; i<4; i++) {
			System.out.println("Entre com a nota " + (i+1));
			notas[i] = sc.nextDouble();
			soma = soma + notas[i];
		}
		double media = (soma/4);
		if(media>=7) {
			System.out.println("Parabéns, você foi aprovado, sua média é " + media);
		}
		if(media<4) {
			System.out.println("Game Over, você foi reprovado amigão, sua média é " + media);		
		}
		if(media>=4 && media<7) {
			System.out.println("Você está de recuperação, sua média é " + media);
			double provarecuperacao = 0;
			System.out.println("Insira a nota da prova de recuperação");
			provarecuperacao = sc.nextDouble();
			if(provarecuperacao>=7) {
				System.out.println("Parabéns, você foi aprovado, sua nota na prova de recuperação é " + provarecuperacao);
			}
			else {
		    	System.out.println("Game over, você foi reprovado amigão, sua nota na prova de recuperação é " + provarecuperacao);
			}
		}
		sc.close();
	}
}







//– Faça um programa que a partir da média de 4 notas fornecidas por um aluno, informe se ele foi
//aprovado, ficou de recuperação ou foi reprovado.
//média >=7 - Aprovado;
//média <=4 e <7 - Recuperação;
//média <4 - Reprovado.