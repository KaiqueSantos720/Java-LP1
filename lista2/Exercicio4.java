package lista2;
import java.util.Scanner;

public class Exercicio4 {
	public static void main (String args[]) {
		
		Scanner sc = new Scanner(System.in);
		Integer numero = 0;
		
		do {
			
			System.out.println("Insira o n�mero de aster�sticos a ser exibidos");
			numero = sc.nextInt();
			
			if((numero > 100) || (numero < 0)) {
				System.out.println("N�mero Inv�lido");
			}
			
			else {
				for(int i = 0; i < numero; i++) {
					System.out.println(" * ");
				}
			}
			
			
		} while(numero != 0);
		
		System.out.println("Voc� digitou o n�mero 0, o programa foi encerrado");
		
		sc.close();
		
	}

}
//Fa�a um programa que solicite um numero entre 1 e 100 ao
//usu�rio. O programa deve imprimir a mesma quantidade de
//asteriscos �*� conforme o numero informado pelo usu�rio. O
//programa deve repetir a pergunta at� o usu�rio informar o numero
//zero.