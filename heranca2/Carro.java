package heranca2;

public class Carro extends Veiculo {
	private Integer quantidadePortas;
	
	public Carro() {
		super();
		this.quantidadePortas = 0;
	}
	
	public Carro(String marca, String modelo, Integer quantidadePortas) {
		super(marca, modelo);
		this.quantidadePortas = quantidadePortas;
	}

	public Integer getQuantidadePortas() {
		return quantidadePortas;
	}

	public void setQuantidadePortas(Integer quantidadePortas) {
		this.quantidadePortas = quantidadePortas;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nQuantidade de Portas = " + this.quantidadePortas;
	}
}
