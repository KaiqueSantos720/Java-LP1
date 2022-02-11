package lista5;

public class Calculadora {
	private Integer n1;
	private Integer n2;
	private Double nn1;
	private Double nn2;
	
	public Calculadora(Integer n1, Integer n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	public Calculadora(Double nn1, Double nn2) {
		this.nn1 = nn1;
		this.nn2 = nn2;
	}
	
	public static void main(String args[]) {
		
		Calculadora c1 = new Calculadora(2, 4);
		Integer resultado = somar(5, 10);
		System.out.println("O resultado da soma é: " + resultado);
		
		Calculadora c2 = new Calculadora(2.4, 4.7);
		Double resultadoDouble = somarDouble(c2.nn1, c2.nn2);
		System.out.println("\nO resultado da soma com doubles é: " + resultadoDouble);
		
		resultado = quadrado(c1.n2);
		System.out.println("\nO quadrado do número é: " + resultado);
		
		resultadoDouble = pi();
		System.out.println("\nPi: " + resultadoDouble);
	}
	
	public static Integer somar(Integer n1, Integer n2) {
		return n1 + n2;
	}
	
	public static Double somarDouble(Double nn1, Double nn2) {
		return nn1 + nn2;
	}
	
	public static Integer quadrado(Integer numero) {
		return numero * numero;
	}
	
	public static Double pi() {
		return Math.PI;
	}
}
