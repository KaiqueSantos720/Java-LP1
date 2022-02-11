package lp1;
import java.util.Scanner;
public class Exe3 {
	public static void main (String args[]){
		Scanner sc = new Scanner(System.in);
		double numeros[] = new double[2];
		for(int i = 0; i<2; i++) {
			System.out.println("Entre com o número " + (i+1));
			numeros[i] = sc.nextDouble();
		}
		double soma = 0;
		double subtracao = 0;
		double multiplicacao = 0;
		for(int i = 0; i<1; i++) {
			soma = (numeros[i] + numeros[i+1]);
			subtracao = (numeros[i] - numeros[i+1]);
			multiplicacao = (numeros[i] * numeros[i+1]);
		}
		System.out.println(soma + "\n" + subtracao + "\n" + multiplicacao);
		sc.close();
	}
}











//Escrever um programa em java que receba dois números e exiba o resultado da sua soma,
//subtração e multiplicação dos números.