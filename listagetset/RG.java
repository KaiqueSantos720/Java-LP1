package listagetset;
import java.time.LocalDate;
public class RG {
	
	private String nome;
	private LocalDate dataemissao;
	private Integer numero;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;		
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getNumero() {
		return numero;		
	}
	
	public void setDataemissao(LocalDate dataemissao) {
		this.dataemissao = dataemissao;
	}
	
	public LocalDate getDataemissao() {
		return dataemissao;		
	}


	public static void main(String[] args) {
		RG rg1 = new RG();
		rg1.setNome("Kaique");
		rg1.setNumero(433985432);
		rg1.setDataemissao(LocalDate.now());
		
		System.out.println("Nome: " + rg1.getNome());
		System.out.println("N�mero: " + rg1.getNumero());
		System.out.println("Data de Emiss�o: " + rg1.getDataemissao());
	}	
}
//2. Fa�a um programa em linguagem de programa��o Java para uma classe RG (documento de identidade), incluir os atributos nome (String), dataemissao (LocalDate) e numero (Integer), incluir os m�todos de acesso get/set aos atributos.
