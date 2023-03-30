package ereditarieta.classiConcrete;

import ereditarieta.classiAstratte.Auto;


public class MercedesAuto extends Auto {
	
	private static final String etichetta= "--SERIE MERCEDES--";
	
	private String modello;
	private int anno;
	private int nPorte;
	
	
	public MercedesAuto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MercedesAuto(String targa, String telaio, String carburante, String modello, int anno, int nPorte) {
		super(targa, telaio, carburante);
		setModello(modello);
		setAnno(anno);
		setnPorte(nPorte);
	}
	
	
	@Override
	public void stampa() {
		super.stampa();
		System.out.println(getEtichetta()+"\nmodello: "+getModello()+"  anno: "+getAnno()+" nPorte:  "+getnPorte());
	}
	
	
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public int getAnno() {
		return anno;
	}
	public void setAnno(int anno) {
		this.anno = anno;
	}
	public int getnPorte() {
		return nPorte;
	}
	public void setnPorte(int nPorte) {
		this.nPorte = nPorte;
	}
	public static String getEtichetta() {
		return etichetta;
	}
	
	
	
	
	
	
	

}
