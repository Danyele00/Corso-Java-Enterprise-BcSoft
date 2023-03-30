package test;

import ereditarieta.classi.sottoClassi.Augusta;
import ereditarieta.classi.sottoClassi.ClasseC;
import ereditarieta.classi.sottoClassi.Scrambler;





public class Test {
	
	public static void main(String[] args) {
	

		Scrambler scrambler = new Scrambler("DC000MT", "xxx01xxx02xx", 2, "v2", 600);
		
		scrambler.stampa();
		scrambler.impenna();
		scrambler.cavalletto(0);
		
		System.out.println("\n---------------");
		
		Augusta augusta = new Augusta("MC111MT", "xxx02xxx55xx", 2, "v4", 2022);
		
		augusta.stampa();
		augusta.impenna();
		augusta.cavalletto(1);
		
		System.out.println("\n---------------");
		
		ClasseC classeC = new ClasseC("MC5425AU","xxx03xxx85xx","benzina","v8",2018,4,5);
		classeC.stampa();
		classeC.apriPorte();
		classeC.sgomma();
		
		
	
	}
	
}
