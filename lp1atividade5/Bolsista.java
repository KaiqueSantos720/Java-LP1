package lp1atividade5;

import java.time.LocalDate;

public class Bolsista extends Aluno{
	
	private Double valor;
	
	public Bolsista() {
		super();
		this.valor = 0.0;
	}
	
	public Bolsista(String nome, LocalDate nascimento, String prontuario, String email, Double valor) {
		super(nome, nascimento, prontuario, email);
		this.valor = valor;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return super.toString() + "[valor: " + this.valor + "]";
	}
}
//Escreva o c�digo fonte da classe Bolsista e considerar que a classe Bolsista herda caracter�sticas da classe Aluno.

//a) incluir o atributo valor (Double);

//b) incluir um m�todo construtor que n�o recebe argumentos, incluir um m�todo construtor que recebe argumentos para definir valores iniciais aos atributos;

//c) incluir m�todos de acesso get/set aos respectivos atributos, incluir a sobrecarga do m�todo toString da classe Object.