package ereditarieta.classiAstratte;

public abstract class Moto {
	
	private final static String etichetta="--Categoria Moto--";
	private String targa;
	private String telaio;
	private int nRuote;

	public Moto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Moto(String targa, String telaio, int nRuote) {
		super();
		this.targa = targa;
		this.telaio = telaio;
		this.nRuote = nRuote;
	}

	public void stampa () {
		System.out.println(getEtichetta()+"\ntarga: "+getTarga()+"  telaio: "+ getTelaio()+"   nRuote: "+ getnRuote() );
	}
	
	

	public static String getEtichetta() {
		return etichetta;
	}

	public String getTarga() {
		return targa;
	}

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public String getTelaio() {
		return telaio;
	}

	public void setTelaio(String telaio) {
		this.telaio = telaio;
	}

	public int getnRuote() {
		return nRuote;
	}

	public void setnRuote(int nRuote) {
		this.nRuote = nRuote;
	}
	
	

}
