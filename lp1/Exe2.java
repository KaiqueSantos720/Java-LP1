package lp1;
public class Exe2 {
	public static void main (String args[]) {
		Integer numero1 = 5;
		Double numero2 = 5.5;
		int n1 = numero1.intValue();
		double n2 = numero2.doubleValue();
		Integer x = Integer.valueOf("160");
		String b = "35.5";
		String a = "2";
		double n3 = Double.parseDouble(b);
		int n4 = Integer.parseInt(a);
	    System.out.println("n1 = " + n1 + "\nn2 = " + n2 + "\nn3 = " + n3 + "\nn4 = " + n4 + "\nx = " + x);
	}
}

















//Faça um programa em linguagem de programação Java que demonstre o uso dos métodos das
//classes Wrappers Integer e Double:
//• Demonstrar o uso dos métodos intValue e doubleValue;
//• Demonstrar o uso dos métodos de conversão valueOf, parseInt, parseDouble;