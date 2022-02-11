package listagetset;

public class Pessoa {
	
	private String nome;
	private Integer idade;
	private Integer peso;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;		
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public Integer getIdade() {
		return idade;		
	}
	
	public void setPeso(Integer peso) {
		this.peso = peso;
	}
	
	public Integer getPeso() {
		return peso;		
	}


	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("Kaique");
		p1.setIdade(17);
		p1.setPeso(75);
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Peso: " + p1.getPeso());
	}
}
//3. Escreva o código fonte Java da classe Pessoa, incluir três atributos a sua escolha, incluir os métodos de acesso get/set aos atributos.