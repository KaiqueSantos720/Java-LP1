package lp1atividade5;

import java.time.LocalDate;

public class Pessoa {
	
	private String nome;
	private LocalDate nascimento;
	
	public Pessoa() {
		this.nome = "";
		this.nascimento = LocalDate.now();
	}
	
	public Pessoa(String nome, LocalDate nascimento) {
		this.nome = nome;
		this.nascimento = nascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	@Override
	public String toString() {
		return "[nome: " + this.nome + ", nascimento: " + this.nascimento + "]";
	}
}
//Escreva o c�digo fonte da classe Pessoa conforme apresentado no diagrama.

//a) incluir os atributos nome (String) e nascimento (LocalDate);

//b) incluir um m�todo construtor que n�o recebe argumentos, incluir um m�todo construtor que recebe argumentos para definir valores iniciais aos atributos;

//c) incluir os m�todos de acesso get/set aos respectivos atributos, incluir a sobrecarga do m�todo toString da classe Object.