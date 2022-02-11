package metodoconstrutor;

import java.time.LocalDate;

public class Rg {
	private String nome;
	private LocalDate dataemissao;
	private Integer numero;
	
	public Rg() {
		this.nome = "";
		this.dataemissao = LocalDate.now();
		this.numero = 1;
	}
	
	public Rg(Integer numero, LocalDate dataemissao, String nome) {
		this.numero = numero;
		this.dataemissao = dataemissao;
		this.nome = nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;		
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getNumero() {
		return numero;		
	}
	
	public void setDataemissao(LocalDate dataemissao) {
		this.dataemissao = dataemissao;
	}
	
	public LocalDate getDataemissao() {
		return dataemissao;		
	}
	
	public static void main(String[] args) {
		Rg rg1 = new Rg();
		rg1.setNome("Kaique Santos");
		rg1.setNumero(368214);
		rg1.setDataemissao(LocalDate.now());
		
		System.out.println("Nome: " + rg1.getNome());
		System.out.println("Número: " + rg1.getNumero());
		System.out.println("Data de Emissão: " + rg1.getDataemissao());
	}	
}
