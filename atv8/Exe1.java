package atv8;

public class Exe1 {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		String frase = "";
		String palavra1 = null;
		String palavra2 = null;
		
		try {
			frase = frase.concat(palavra1.toLowerCase() + " " + palavra2.toUpperCase());
		}	
		catch(NullPointerException e) {
			System.out.println("As palavras estão com valores null");
			palavra1 = "Olá";
			palavra2 = "Mundo";
			frase = frase.concat(palavra1.toLowerCase() + " " + palavra2.toUpperCase());
		}
		finally {
			System.out.println(frase);
		}
		
	}
}
//Escreva um programa Java que apresente um exemplo de tratamento exceção do tipo: NullPointerException.