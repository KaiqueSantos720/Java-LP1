package atv7;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exe4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for(int i = 0; i <= 100; i++) {
			if (i % 2 != 0) {
				lista.add(i);
			}
		}
		
		JOptionPane.showMessageDialog(null, "Lista Completa: " + lista);
		
		Integer total = 0;	
		for(int i = 0; i < lista.size(); i++) {
			total += lista.get(i);
		}
		
		JOptionPane.showMessageDialog(null, "Somatória da lista: " + total);

	}

}