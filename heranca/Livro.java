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
		return "autor: " + this.autor + "\neditora: " + this.editora + "\nc�digo: " + this.codigo;
	}
}
//Escreva o c�digo fonte da classe Livro, incluir tr�s atributos a sua
//escolha, incluir um m�todo construtor sem argumentos e um
//m�todo construtor com argumentos, e incluir os respectivos
//m�todos de acesso get/set aos atributos e incluir a sobreescrita do
//m�todo toString da classe Object.