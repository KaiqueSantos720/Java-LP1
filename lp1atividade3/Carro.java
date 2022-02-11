package lp1atividade3;

public class Carro {
	private String marca;
	private String modelo;
	private Motor motor;
	
	public Carro() {
		this.motor = new Motor();
		this.marca = "";
		this.modelo= "";
	}
	
	public Carro(Motor motor, String marca, String modelo) {
		this.motor = motor;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	public String getMarca() {
		return marca;		
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;		
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public Motor getMotor() {
		return motor;		
	}
	
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
}
//Escreva o código fonte da classe Carro, incluir os atributos marca (String), modelo (String) e motor (Motor), incluir dois métodos construtores, incluir os métodos de acesso get/set aos atributos.