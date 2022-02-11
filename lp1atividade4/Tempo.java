package lp1atividade4;

public class Tempo {
	
	private Integer horas;
	private Integer minutos;
	private Integer segundos;
	
	public Tempo() {
		this.horas = 0;
		this.minutos = 0;
		this.segundos = 0;
	}
	
	public Tempo(Integer horas, Integer minutos, Integer segundos) {
		this.horas = horas;
		this.minutos = minutos;
		this.segundos = segundos;
	}
	
	public Integer getHoras() {
		return horas;		
	}
	
	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
	public Integer getMinutos() {
		return minutos;		
	}
	
	public void setMinutos(Integer minutos) {
		this.minutos = minutos;
	}
	
	public Integer getSegundos() {
		return segundos;		
	}
	
	public void setSegundos(Integer segundos) {
		this.segundos = segundos;
	}
	
	public void imprimir() {
		System.out.println("O tempo �: " + String.format("%02d", this.horas) + ":" + String.format("%02d", this.minutos) + ":" + String.format("%02d", this.segundos));
	}
	
	public Integer horasEmSegundos() {
		if(this.horas > 0) {
			return this.horas * 3600;
		}	
		else {
			return 0;
		}
	}
	
	public Integer minutosEmSegundos() {
		if(this.minutos > 0) {
			return this.minutos * 60;
		}
		else {
			return 0;
		}
	}

}
//Crie uma classe Tempo com tr�s atributos: horas, minutos e segundos. 
//Crie dois construtores: um para inicializar os atributos com valor zero e outro para inicializar os atributos com valores passados como argumentos. Crie m�todos para:

//a) m�todos de acesso get/set para os atributos;

//b) m�todo para imprimir os atributos no formato hh:mm:ss;

//c) m�todo horasemsegundos que n�o recebe argumentos e caso o valor do atributo horas seja maior que zero retorna o valor da quantidade de horas em segundos, caso contr�rio retorna o valor zero;

//d) m�todo minutosemsegundos que n�o recebe argumentos e caso o valor do atributo minutos seja maior que zero retorna o valor da quantidade de minutos em segundos, caso contr�rio retorna o valor zero;