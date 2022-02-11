package heranca;

public class Livro {
	private String autor;
	private String editora;
	private Integer codigo;
	
	public Livro() {
		this.autor = "";
		this.editora = "";
		this.codigo = 0;
	}
	
	public Livro(String autor, String editora, Integer codigo) {
		this.autor = autor;
		this.editora = editora;
		this.codigo = codigo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public String toString() {
		return "autor: " + this.autor + "\neditora: " + this.editora + "\ncódigo: " + this.codigo;
	}
}
//Escreva o código fonte da classe Livro, incluir três atributos a sua
//escolha, incluir um método construtor sem argumentos e um
//método construtor com argumentos, e incluir os respectivos
//métodos de acesso get/set aos atributos e incluir a sobreescrita do
//método toString da classe Object.