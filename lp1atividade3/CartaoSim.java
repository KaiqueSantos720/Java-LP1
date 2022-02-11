package lp1atividade3;

public class CartaoSim {
	private String operadora;
	private String tamanho;
	private Integer numero;
	
	public CartaoSim() {
		this.operadora = "Tim";
		this.tamanho = "nano";
		this.numero = 988888888;
	}
	
	public CartaoSim(String operadora, String tamanho, Integer numero) {
		this.operadora = operadora;
		this.tamanho = tamanho;
		this.numero = numero;
	}
	
	public String getOperadora() {
		return operadora;		
	}
	
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	public String getTamanho() {
		return tamanho;		
	}
	
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	
	public Integer getNumero() {
		return numero;		
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
}
//Escreva o código fonte da classe CartaoSIM, incluir os atributos operadora (String), tamanho (String) e numero (Integer), incluir dois métodos construtores e incluir os métodos de acesso get/set aos atributos. Por exemplo: cartãoSim – Tim, nano, 98888-8888.