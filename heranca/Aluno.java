package heranca;

public class Aluno {
	
	private String nome;
	private String prontuario;
	
	public Aluno() {
		this.nome = "";
		this.prontuario = "";
	}
	
	public Aluno(String nome, String prontuario) {
		this.nome = nome;
		this.prontuario = prontuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	
	public String toString() {
		return "nome: " + this.nome + "\nprontuário: " + this.prontuario;
	}
}
//Escreva o código fonte da classe Aluno, incluir dois atributos a
//sua escolha, incluir um método construtor sem argumentos e um
//método construtor com argumentos, e incluir os respectivos
//métodos de acesso get/set aos atributos e incluir a sobreescrita do
//método toString da classe Object.
