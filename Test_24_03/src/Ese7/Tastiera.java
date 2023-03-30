package Ese7;

import java.util.Scanner;

public class Tastiera {
	
	public static Scanner scanner;
	public static int intero;
	
	
	public static String leggiStringa (String messaggio) {
		String stringa;
		scanner = new Scanner(System.in);
		
		System.out.print(messaggio);
		stringa = scanner.nextLine();
		System.out.println();
		
		return stringa;
	}
	
	public static int leggiIntero(String messaggio) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(messaggio);
		intero = scanner.nextInt();
		System.out.println();
		
		return intero;
		
	}
	
	public static double leggiDouble(String messaggio) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(messaggio);
		double virgola = scanner.nextInt();
		System.out.println();
		
		return virgola;
		
	}
	
	
		

}
