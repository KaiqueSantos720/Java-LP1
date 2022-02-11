package lp1atividade3;

public class Motor {
	private String tipo;
	private Double tamanho;
	
	public Motor() {
		this.tipo = "gasolina";
		this.tamanho = 1.0;
	}
	
	public Motor(String tipo, Double tamanho) {
		this.tipo = tipo;
		this.tamanho = tamanho;
	}
	
	public String getTipo() {
		return tipo;		
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public Double getTamanho() {
		return tamanho;		
	}
	
	public void setTamanho(Double tamanho) {
		this.tamanho = tamanho;
	}
}
//Escreva o c�digo fonte da classe Motor, incluir os atributos tipo (String), tamanho (Double), incluir dois m�todos construtores, incluir os m�todos de acesso get/set aos atributos. Por exemplo: motor - tipo: gasolina, tamanho: 1.0.