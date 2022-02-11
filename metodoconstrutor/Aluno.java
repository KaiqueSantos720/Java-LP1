package metodoconstrutor;

import java.time.LocalDate;

public class Aluno {
	private String nome;
	private Rg identidade;
	private String prontuario;
	private Integer numero;
	
	public Aluno() {
		this.nome = "";
		this.prontuario = "";
		this.identidade = new Rg();
	}
	
	public Aluno(String nome, Integer numero, LocalDate dataemissao, String prontuario) {
		this.prontuario = prontuario;
		this.nome = nome;
		this.identidade = new Rg(numero, dataemissao, nome);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;		
	}
	
	public void setIdentidade(Rg identidade) {
		this.identidade = identidade;
	}
	
	public Rg getIdentidade() {
		return identidade;		
	}
	
	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}
	
	public String getProntuario() {
		return prontuario;		
	}
	
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	
	public Integer getNumero() {
		return numero;		
	}
	
	public static void main(String args[]) {
		Aluno a1 = new Aluno("Kaique", 243, LocalDate.now(), "SP3044203");
		System.out.println(a1.getNome());
		System.out.println(a1.getNumero());
		System.out.println(a1.getProntuario());
		System.out.println(a1.getIdentidade());
	}
}
