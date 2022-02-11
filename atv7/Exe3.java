package atv7;

import java.util.ArrayList;

import java.util.Random;

import javax.swing.JOptionPane;

public class Exe3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Random aleatorio = new Random();
		
		for(int i = 0; i < 10; i++) {
			lista.add(aleatorio.nextInt(100));
		}
		
		JOptionPane.showMessageDialog(null, "Lista Completa: " + lista);
		
		Integer maior = 0;
		for(int i = 0; i < lista.size(); i++) {
			if(maior < lista.get(i)) {
				maior = lista.get(i);
			}
		}
		
		JOptionPane.showMessageDialog(null, "Maior elemento: " + maior);
	}

}