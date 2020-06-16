package es.com.escuela_it.main.dtfutbol;

import java.time.LocalDate;

public class JodaTime {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println(localDate);
		
		localDate = localDate.minusYears(2022);
		
		System.out.println(localDate.getDayOfWeek());
		System.out.println(localDate.getDayOfMonth());
		System.out.println(localDate.getDayOfYear());
		System.out.println(localDate.getMonth() + "("+localDate.getMonthValue()+")");
		System.out.println(localDate.getYear());
		System.out.println(localDate.getEra());
		
		localDate.isAfter(LocalDate.now());
		localDate.isBefore(LocalDate.now());
		
		
		
		
		
	}

}
