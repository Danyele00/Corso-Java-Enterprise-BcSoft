package Ese6;

public class Cerchio {
	
	public static final double PI_GRECO=3.14;
	
	public static void main(String[] args) {
		
		int raggio= 20;
		
		System.out.println("Calcolo Area: "+ calcolaArea(raggio));
		System.out.println("Calcolo Circonferenza: " + calcolaCirconferenza(raggio));

	}
	
	public static double calcolaArea(double raggio) {
		return (raggio*2)*PI_GRECO;
	}
	
	public static double calcolaCirconferenza(double raggio) {
		return (2*PI_GRECO*raggio);
	}
	
	

}
