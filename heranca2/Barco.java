package heranca2;

public class Barco extends Veiculo {
	private Integer potenciaMotor;
	
	public Barco() {
		super();
		this.potenciaMotor = 0;
	}
	
	public Barco(String marca, String modelo, Integer potenciaMotor) {
		super(marca, modelo);
		this.potenciaMotor = potenciaMotor;
	}

	public Integer getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(Integer potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nPotência do Motor = " + this.potenciaMotor;
	}
}
