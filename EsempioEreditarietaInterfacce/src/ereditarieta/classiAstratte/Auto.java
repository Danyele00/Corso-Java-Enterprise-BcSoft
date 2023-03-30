package ereditarieta.classiAstratte;

public abstract class Auto {
	
	private final static String etichetta="--Categoria Auto--";
	
	private String targa;
	private String telaio;
	private String carburante;
	
	public Auto() {};
	
	public Auto(String targa, String telaio, String carburante) {
		super();
		this.targa = targa;
		this.telaio = telaio;
		this.carburante = carburante;
	}



	public void stampa () {
		System.out.println(getEtichetta()+"\ntarga: "+getTarga()+"  telaio: "+ getTelaio()+"  carburante: "+ getCarburante());
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
	
	public String getCarburante() {
		return carburante;
	}
	
	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}
	
	
	


}
