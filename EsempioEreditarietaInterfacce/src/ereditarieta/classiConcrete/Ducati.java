package ereditarieta.classiConcrete;

import ereditarieta.classiAstratte.Moto;

public class Ducati extends Moto {
	
	private static final String etichetta= "--SERIE DUCATI--";
	private String modello;
	
	
	public Ducati() {
		super();
	}


	public Ducati(String targa, String telaio, int nRuote, String modello) {
		super(targa,telaio,nRuote);
		this.modello = modello;
		
	}
	

	@Override
	public void stampa() {
		super.stampa();
		System.out.println(getEtichetta()+"\nmodello: "+getModello());
	}


	public String getModello() {
		return modello;
	}


	public void setModello(String modello) {
		this.modello = modello;
	}


	public static String getEtichetta() {
		return etichetta;
	}


}
