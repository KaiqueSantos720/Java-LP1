package atv7;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exe1 {

	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			lista.add(JOptionPane.showInputDialog("Entre com um nome: "));
		}
		
		for(int i = 4; i >= 0; i--) {
			System.out.println(lista.get(i));
		}
		
	}

}