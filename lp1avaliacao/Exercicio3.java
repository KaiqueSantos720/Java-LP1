package lp1avaliacao;
import java.util.Scanner;
public class Exercicio3 {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual � o valor do produto?");
		double valorProduto = sc.nextDouble();
		double valorVenda = 0;
		
		if((valorProduto < 20) && (valorProduto > 0)) {
			valorVenda = ((valorProduto*0.45) + valorProduto);
			System.out.println("Valor de venda �: " + String.format("%.2f", valorVenda));
		}
		
		if(valorProduto >= 20) {
			valorVenda = ((valorProduto*0.30) + valorProduto);
			System.out.println("Valor de venda �: " + String.format("%.2f", valorVenda));
		}
		
		if(valorProduto <= 0) {
			System.out.println("Entrada Inv�lida");
		}
		
		 sc.close();
		 
	}
}
//Um comerciante comprou um produto e quer vend�-lo com um lucro de 45% se o valor da compra for menor que R$ 20,00; caso contr�rio, o lucro ser� de 30%. Elabore um programa que leia o valor do produto e imprima o valor de venda para o produto.