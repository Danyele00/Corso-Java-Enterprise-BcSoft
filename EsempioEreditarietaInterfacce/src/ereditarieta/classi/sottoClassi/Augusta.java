package ereditarieta.classi.sottoClassi;


import ereditarieta.classiConcrete.MercedesMoto;
import interfacce.InterfaceMoto;

public class Augusta extends MercedesMoto implements InterfaceMoto{
	
	private final static String etichetta="--AUGUSTA--";
	
	private int cavalli;
	
	

	public Augusta() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Augusta(String targa, String telaio, int nRuote, String modello, int cavalli) {
		super(targa, telaio, nRuote, modello, cavalli);
		setCavalli(cavalli);
	}

	
	@Override
	public void impenna() {
		System.out.println(getEtichetta()+"\nAzione.. Sto impennando..");
	}
	
	


	@Override
	public void stampa() {
		super.stampa();
		System.out.println(getEtichetta()+"\ncavalli: " +getCavalli());
	}

	public int getCavalli() {
		return cavalli;
	}


	public void setCavalli(int cavalli) {
		this.cavalli = cavalli;
	}


	public static String getEtichetta() {
		return etichetta;
	}
	
	

}
