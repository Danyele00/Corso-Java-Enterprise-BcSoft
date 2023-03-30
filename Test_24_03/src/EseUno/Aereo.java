package EseUno;

public class Aereo {
	
	public String compagnia;
	public String nVolo;
	public int nPasseggeri;
	public int oreDiVolo;
	
	public static String aereoporto;

	public Aereo(){}
	
	public Aereo(String compagnia, String nVolo, int nPasseggeri, int oreDiVolo) {
		this.compagnia=compagnia;
		this.nVolo=nVolo;
		this.nPasseggeri=nPasseggeri;
		this.oreDiVolo=oreDiVolo;
		
	}
}
