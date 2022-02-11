package atv7;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exe2 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		lista.add("Rafael");
		lista.add("Eduardo");
		lista.add("Bruno");
		lista.add("Rodrigo");
		lista.add("Felipe");
		
		JOptionPane.showMessageDialog(null, "Lista de Nomes Completa: " + lista);
		
		lista.remove(JOptionPane.showInputDialog("Escreva um nome para ser removido: "));
		
		System.out.println("---------------------");
		
		JOptionPane.showMessageDialog(null, "Lista Atualizada: " + lista);
		
	}

}