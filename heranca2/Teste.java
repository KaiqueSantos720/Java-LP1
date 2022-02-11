package heranca2;

public class Teste {

	public static void main(String[] args) {
		Carro c1 = new Carro("Chevrolet", "Zentorno", 4);
		System.out.println(c1.toString());
		
		System.out.println("-------------------");
		
		Moto m1 = new Moto();
		System.out.println(m1.toString());
		
		System.out.println("-------------------");
		
		Barco b1 = new Barco("Barco Turbo", "Hiper Barco", 1200);
		System.out.println(b1.toString());

	}

}
