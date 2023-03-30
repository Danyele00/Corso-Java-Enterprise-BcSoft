package ereditarieta.classi.sottoClassi;

import ereditarieta.classiConcrete.MercedesAuto;
import interfacce.InterfaceAuto;

public class ClasseC extends MercedesAuto implements InterfaceAuto{

	private final static String etichetta="--CLASSEC--";
	
	private int nPosti;

	public ClasseC() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClasseC(String targa, String telaio, String carburante, String modello,
			int anno, int nPorte, int nPosti) {
		super(targa, telaio, carburante, modello, anno, nPorte);
		setnPosti(nPosti);
	}

	@Override
	public void apriPorte() {
		System.out.println(getEtichetta()+":\nAzione.. Sto aprendo le porte..");
		
	}

	@Override
	public void stampa() {
		super.stampa();
		System.out.println(getEtichetta()+"\nnPosti:  "+getnPosti());
	}

	public int getnPosti() {
		return nPosti;
	}

	public void setnPosti(int nPosti) {
		this.nPosti = nPosti;
	}

	public static String getEtichetta() {
		return etichetta;
	}
	
	

}
