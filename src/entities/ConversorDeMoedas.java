package entities;

public class ConversorDeMoedas {
	
	public static final double IOF_DOLAR = 0.06; 
	
	public static final double IOF_EURO = 0.10;
	
	public static double converterDolar(double valor, double quantidade) {
		double imposto = valor * quantidade * IOF_DOLAR;
		return valor * quantidade + imposto ;
		
	}
	
	public static double converterEuro(double valor, double quantidade) {
		double imposto = valor * quantidade * IOF_EURO;
		return valor * quantidade + imposto;
	}
}
