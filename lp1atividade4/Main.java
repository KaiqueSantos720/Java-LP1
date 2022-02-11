package lp1atividade4;

public class Main {
	public static void main(String args[]) {
		Integer multiplicarInteger = Calculadora.multiplicar(10, 5);
		System.out.println("O resultado da multiplicação entre inteiros é: " + multiplicarInteger);
		
		Double multiplicarDouble = Calculadora.multiplicar(5.5, 10.0);
		System.out.println("O resultado da multiplicação entre doubles é: " + multiplicarDouble);
		
		Integer cubo = Calculadora.cubo(5);
		System.out.println("O cubo é: " + cubo);
		
		String parImpar = Calculadora.parImpar(22);
		System.out.println("O número é: " + parImpar);
		
		
		System.out.println("\n\n");
		
		
		Integer inteiroMenor = Java.min3(7, 3, 6);
		System.out.println("O menor Integer é: " + inteiroMenor);
		
		Double doubleMenor = Java.min3(2.1, 3.3, 1.9);
		System.out.println("O menor Double é: " + doubleMenor);
		
		
		System.out.println("\n\n");
		
		
		Tempo t1 = new Tempo(10, 2, 03);
		
		t1.imprimir();
		
		Integer hs = t1.horasEmSegundos();
		System.out.println("\nHoras em segundos: " + hs);
		
		hs = t1.minutosEmSegundos();
		System.out.println("Minutos em segundos: " + hs);
		
		t1.minutosEmSegundos();
	}
}
