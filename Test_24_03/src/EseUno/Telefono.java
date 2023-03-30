package EseUno;

public class Telefono {

	public String marca;
	public String modello;
	public String proprietario;
	public boolean garanzia;
	
	public static int giacienza;

	public Telefono() {}
	
	public Telefono(String marca, String modello, String proprietario, boolean garanzia) {
		this.marca=marca;
		this.modello=modello;
		this.proprietario=proprietario;
		this.garanzia= garanzia;
	}
}
