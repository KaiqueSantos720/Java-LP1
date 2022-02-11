package listagetset;

public class Aluno {
	
	private String nome;
	private Integer idade;
	private String prontuario;
	
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
	
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	
	public String getProntuario() {
		return prontuario;		
	}


	public static void main(String[] args) {
		Aluno a1 = new Aluno();
		a1.setNome("Kaique");
		a1.setIdade(17);
		a1.setProntuario("SP3044203");
		
		System.out.println("Nome: " + a1.getNome());
		System.out.println("Idade: " + a1.getIdade());
		System.out.println("Prontuário: " + a1.getProntuario());
	}
	
}
//1. Escreva o código fonte da classe Aluno, incluir os atributos nome(String), idade (Integer) e prontuario (String), incluir os métodos de acesso get/set aos atributos.