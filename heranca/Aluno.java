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
		return "nome: " + this.nome + "\nprontu�rio: " + this.prontuario;
	}
}
//Escreva o c�digo fonte da classe Aluno, incluir dois atributos a
//sua escolha, incluir um m�todo construtor sem argumentos e um
//m�todo construtor com argumentos, e incluir os respectivos
//m�todos de acesso get/set aos atributos e incluir a sobreescrita do
//m�todo toString da classe Object.
