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
			System.out.println("Parab�ns, voc� foi aprovado, sua m�dia � " + media);
		}
		if(media<4) {
			System.out.println("Game Over, voc� foi reprovado amig�o, sua m�dia � " + media);		
		}
		if(media>=4 && media<7) {
			System.out.println("Voc� est� de recupera��o, sua m�dia � " + media);
			double provarecuperacao = 0;
			System.out.println("Insira a nota da prova de recupera��o");
			provarecuperacao = sc.nextDouble();
			if(provarecuperacao>=7) {
				System.out.println("Parab�ns, voc� foi aprovado, sua nota na prova de recupera��o � " + provarecuperacao);
			}
			else {
		    	System.out.println("Game over, voc� foi reprovado amig�o, sua nota na prova de recupera��o � " + provarecuperacao);
			}
		}
		sc.close();
	}
}







//� Fa�a um programa que a partir da m�dia de 4 notas fornecidas por um aluno, informe se ele foi
//aprovado, ficou de recupera��o ou foi reprovado.
//m�dia >=7 - Aprovado;
//m�dia <=4 e <7 - Recupera��o;
//m�dia <4 - Reprovado.