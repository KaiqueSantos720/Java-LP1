package lista5;
import java.util.Scanner;

public class Data {
	private Integer dia;
	private Integer mes;
	private Integer ano;
	
	public Data(Integer dia, Integer mes, Integer ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Integer getDia() {
		return dia;		
	}
	
	public void setDia(Integer dia) {
		this.dia = dia;
	}
	
	public Integer getMes() {
		return mes;		
	}
	
	public void setMes(Integer mes) {
		this.mes = mes;
	}
	
	public Integer getAno() {
		return ano;		
	}
	
	public void setAno(Integer ano) {
		this.ano = ano;
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		Data data1 = new Data(20, 07, 2018);
		data1.imprimir(data1);
		
		Integer dias = data1.calcularDias(data1.mes);
		System.out.println("\nOs dias percorridos até este mês é: " + dias);
		
		System.out.println("\nInsira o nome do mês");
		String mes = sc.nextLine();
		dias = calcularDiasString(mes);
		System.out.println("Os dias percorridos até este mês é: " + dias);
		
		sc.close();
	}
	
	public void imprimir(Data data) {
		System.out.println("A data é: " + dia + "/" + mes + "/" + ano);
	}
	
	public Integer calcularDias(Integer mes) {
		switch(mes) {
			case 1:
				return 31;
			case 2:
				return 31 + 28;
			case 3:
				return 31*2 + 28;
			case 4:
				return 31*2 + 28 + 30;
			case 5:
				return 31*3 + 28 + 30;
			case 6:
				return 31*3 + 28 + 30*2;
			case 7:
				return 31*4 + 28 + 30*2;
			case 8:
				return 31*5 + 28 + 30*2;
			case 9:
				return 31*5 + 28 + 30*3;
			case 10:
				return 31*6 + 28 + 30*3;
			case 11:
				return 31*6 + 28 + 30*4;
			case 12:
				return 31*7 + 28 + 30*4;
			default: return null;
		}
	}
	
	public static Integer calcularDiasString(String mes) {
		switch(mes) {
			case "janeiro":
				return 31;
			case "fevereiro":
				return 31 + 28;
			case "março":
				return 31*2 + 28;
			case "abril":
				return 31*2 + 28 + 30;
			case "maio":
				return 31*3 + 28 + 30;
			case "junho":
				return 31*3 + 28 + 30*2;
			case "julho":
				return 31*4 + 28 + 30*2;
			case "agosto":
				return 31*5 + 28 + 30*2;
			case "setembro":
				return 31*5 + 28 + 30*3;
			case "outubro":
				return 31*6 + 28 + 30*3;
			case "novembro":
				return 31*6 + 28 + 30*4;
			case "dezembro":
				return 31*7 + 28 + 30*4;
			default: return null;
		}
	}
}