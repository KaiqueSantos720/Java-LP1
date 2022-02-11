package lp1atividade3;

public class Mobile {
	private CartaoSim cartao;
	private String marca;
	private String modelo;
	
	public Mobile() {
		this.cartao = new CartaoSim();
		this.marca = "";
		this.modelo= "";
	}
	
	public Mobile(CartaoSim cartao, String marca, String modelo) {
		this.cartao = cartao;
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
	
	public CartaoSim getCartao() {
		return cartao;		
	}
	
	public void setCartao(CartaoSim cartao) {
		this.cartao = cartao;
	}
}
//Escreva o código fonte da classe Mobile, incluir os atributos modelo(String), marca(String) e cartao(CartaoSim), incluir dois métodos construtores, incluir os métodos de acesso get/set aos atributos.