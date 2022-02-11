package heranca;

public class Teste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("Kaique", "SP3044203");
		
		System.out.println(a1.toString());
		
		System.out.println("--------------");
		
		Livro l1 = new Livro ("Zé", "EditaLivro", 21);
		Livro l2 = new Livro ("Zézin", "EditaLivro", 30);
		
		System.out.println(l1.toString());
		System.out.println("--------------");
		System.out.println(l2.toString());

	}

}
