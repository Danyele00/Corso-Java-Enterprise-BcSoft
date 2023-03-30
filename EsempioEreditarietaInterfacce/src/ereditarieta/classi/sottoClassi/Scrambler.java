package ereditarieta.classi.sottoClassi;

import ereditarieta.classiConcrete.Ducati;
import interfacce.InterfaceMoto;

public class Scrambler extends Ducati implements InterfaceMoto{
	
	private final static String etichetta="--SCRAMBLER--";
	private int cavalli;
	

	public Scrambler() {
		super();
	}

	
	public Scrambler(String targa, String telaio, int nRuote, String modello, int cavalli) {
		super(targa, telaio, nRuote, modello);
		this.cavalli=cavalli;
		
	}

	@Override
	public void impenna() {
		System.out.println(getEtichetta()+"\nAzione.. Sto impennando..");
		
	}

	@Override
	public void stampa() {
		super.stampa();
		System.out.println(getEtichetta()+"\ncavalli: "+ getCavalli());
	}
	
	



	public static String getEtichetta() {
		return etichetta;
	}


	public int getCavalli() {
		return cavalli;
	}



	public void setCavalli(int cavalli) {
		this.cavalli = cavalli;
	}
	
	

}
