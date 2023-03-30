package EseDue;

import EseUno.*;

public class Test {

	public static void main(String[] args) {
		
		Aereo aereo = new Aereo("ItalFly","IT0002",200,5);
		
		Film film = new Film("Dracula","sconosciuto","Fantastico",120);
		
		Libro libro = new Libro("Il conte di Motecristo","Dumas",2000,22);
		
		Telefono telefono= new Telefono("Nokia","3310","Iacca",false);
		
		System.out.println("Aereo\nCompagnia: "+aereo.compagnia+"\nnumero volo: "+aereo.nVolo+"\nore di volo:"+aereo.oreDiVolo+"\n");
		
		System.out.println("Film\nTitolo: "+film.titolo+"\ngenere: "+film.genere+"\ndurata: "+film.durata+"\n");
		
		System.out.println("Libro\nTitolo: "+ libro.titolo+"\nAutore: "+libro.autore+"\nprezzo: "+libro.prezzo+"\n");
		
		System.out.println("Telefono\nMarca: "+ telefono.marca+"\nmodello: "+telefono.modello+"\ngaranzia: "+telefono.garanzia+"\n");
		

	}

}
