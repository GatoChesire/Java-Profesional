package es.com.escuela_it.main.dtfutbol;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Dinero {
	
	public static void main(String[] args) {
		
		BigDecimal presupuesto = new BigDecimal(2332.33);
		BigDecimal suma = presupuesto.add(new BigDecimal(343434.3));
		
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.CANADA);
		
		String libras = formatter.format(suma);
		
		Currency currency = formatter.getCurrency();
		
		System.out.println(currency.getDisplayName() + " "+ currency.getNumericCode() + " " + currency.getSymbol()) ;
		
		System.out.println(libras);
		
		
		
		
		
	}

}
