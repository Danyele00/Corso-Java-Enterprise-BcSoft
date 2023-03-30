package ereditarieta.classiConcrete;

import ereditarieta.classiAstratte.Moto;


public class MercedesMoto extends Moto {
	
	private static final String etichetta= "--SERIE MERCEDES AUTO--";
	
	private String modello;
	private int anno;
	
	
	
	public MercedesMoto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public MercedesMoto(String targa, String telaio, int nRuote,String modello,int anno) {
		super(targa, telaio, nRuote);
		setModello(modello);
		setAnno(anno);
	}


	@Override
	public void stampa() {
		super.stampa();
		System.out.println(getEtichetta()+"\nmodello: "+getModello()+"  anno: "+getAnno());
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
	
	public static String getEtichetta() {
		return etichetta;
	}
	
	
	
	
	
	
	

}
