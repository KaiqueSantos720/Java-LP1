package lp1atividade5;

import java.time.LocalDate;

public class Aluno extends Pessoa{
	
	private String prontuario;
	private String email;
	
	public Aluno() {
		super();
		this.prontuario = "";
		this.email = "";
	}
	
	public Aluno(String nome, LocalDate nascimento, String prontuario, String email) {
		super(nome, nascimento);
		this.prontuario = prontuario;
		this.email = email;
	}

	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return super.toString() + "[prontuario: " + this.prontuario + ", email: " + this.email + "]";
	}
}
//Escreva o c�digo fonte da classe Aluno e considerar que a classe Aluno herda caracter�sticas da classe Pessoa.

//a) incluir os atributos prontu�rio (String) e email (String);

//b) incluir um m�todo construtor que n�o recebe argumentos, incluir um m�todo construtor que recebe argumentos para definir valores iniciais aos atributos;

//c) incluir m�todos de acesso get/set aos respectivos atributos, incluir a sobrecarga do m�todo toString da classe Object.