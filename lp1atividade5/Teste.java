package lp1atividade5;

import java.time.LocalDate;

public class Teste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("João", LocalDate.of(2000, 04, 20));
		Aluno a1 = new Aluno("Kaique", LocalDate.of(2004, 07, 20), "SP3044203", "kaique@hotmail.com");
		Bolsista b1 = new Bolsista("José", LocalDate.of(2004, 12, 12), "SP3044123", "jose@hotmail.com", 1000.00);
		Atleta atl1 = new Atleta("Rodrigo", LocalDate.of(1990, 01, 10), "SP3044321", "rodrigo@hotmail.com", "Atletismo");
		
		System.out.println(p1.toString());
		System.out.println(a1.toString());
		System.out.println(b1.toString());
		System.out.println(atl1.toString());

	}

}
