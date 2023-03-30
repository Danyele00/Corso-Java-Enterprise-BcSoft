package EseUno;

public class Libro {
	
	public String titolo;
	public String autore;
	public int nPagine;
	public double prezzo;
	
	public static int giacienza;
	
	public Libro() {}
	
	public Libro (String titolo, String autore, int nPagine, double prezzo) {
		
		this.titolo=titolo;
		this.autore=autore;
		this.nPagine=nPagine;
		this.prezzo=prezzo;
		
		
	}

}
