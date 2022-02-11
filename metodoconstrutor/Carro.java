package metodoconstrutor;

public class Carro {
	private Integer valor;
	private Integer ano;
	private String modelo;
	
	public Carro() {
		this.valor = 2;
		this.modelo = "";
		this.ano = 2020;
	}
	
	public Carro(Integer valor, Integer ano, String modelo) {
		this.valor = valor;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	
	public Integer getValor() {
		return valor;		
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getModelo() {
		return modelo;		
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public Integer getAno() {
		return ano;		
	}
	
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.setValor(100000);
		c1.setModelo("Toyota");
		c1.setAno(2021);
		
		System.out.println("valor: " + c1.getValor());
		System.out.println("modelo: " + c1.getModelo());
		System.out.println("ano: " + c1.getAno());
	}
}
