package lista5;

public class Java {
	private Integer valor1;
	private Integer valor2;
	private Integer valor3;
	
	public Java(Integer valor1, Integer valor2, Integer valor3) {
		this.valor1 = valor1;
		this.valor2 = valor2;
		this.valor3 = valor3;
	}
	
	public static void main(String args[]) {
		Java j1 = new Java(7, 7, 7);
		Integer maior = maior(j1.valor1, j1.valor2, j1.valor3);
		System.out.println("O maior número é: " + maior);
		
		Double maiorDouble = maiorDouble(6.7, 6.6, 6.6);
		System.out.println("O maior número é: " + maiorDouble);
	}
	
	public static Integer maior(Integer valor1, Integer valor2, Integer valor3) {
		if(valor1 > valor2 && valor1 > valor3) {
			return valor1;
		}
		if(valor2 > valor1 && valor2 > valor3) {
			return valor2;
		}
		if(valor3 > valor1 && valor3 > valor2) {
			return valor3;
		}
		if(valor1 == valor2 && valor2 == valor3) {
			System.out.println("Os números são iguais");
			return valor1;
		}
		if(valor1 == valor2) {
			if(valor1 > valor3) {
				return valor1;
			} else {
				return valor3;
			}
		}
		if(valor1 == valor3) {
			if(valor1 > valor2) {
				return valor1;
			} else {
				return valor2;
			}
		}
		if(valor2 == valor3) {
			if(valor3 > valor1) {
				return valor3;
			} else {
				return valor1;
			}
		}
		return null;
	}
	
	public static Double maiorDouble(Double valor1, Double valor2, Double valor3) {
		if(valor1 > valor2 && valor1 > valor3) {
			return valor1;
		}
		if(valor2 > valor1 && valor2 > valor3) {
			return valor2;
		}
		if(valor3 > valor1 && valor3 > valor2) {
			return valor3;
		}
		if(valor1.equals(valor2) && valor2.equals(valor3)) {
			System.out.println("Os números são iguais");
			return valor1;
		}
		if(valor1.equals(valor2)) {
			if(valor1 > valor3) {
				return valor1;
			} else {
				return valor3;
			}
		}
		if(valor1.equals(valor3)) {
			if(valor1 > valor2) {
				return valor1;
			} else {
				return valor2;
			}
		}
		if(valor2.equals(valor3)) {
			if(valor3 > valor1) {
				return valor3;
			} else {
				return valor1;
			}
		}
		return null;
	}
}
