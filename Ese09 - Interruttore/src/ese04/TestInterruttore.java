package ese04;

public class TestInterruttore {

	public static void main(String[] args) {
	
		Lampadina lampadina = new Lampadina(10);
		
		Interruttore interruttore = new Interruttore(lampadina);
		Interruttore interruttore2 = new Interruttore(lampadina);
		
	
		while(!lampadina.isRotta()) {
			System.out.println("Stato---> lampadina: " + lampadina.isOn() + "  contatore: " + Lampadina.isCorrente()+"\n");
			String scelta = Tastiera.leggiStringa(">> PREMI 1 PER INTERRUTTORE CUCINA  <<\n"
					+ ">> PREMI 2 PER INTERRUTTORE SALA  <<\n"
					+ ">> PREMI s PER STACCARE IL CONTATORE  <<\n"
					+ ">> PREMI a PER ATTACCARE IL CONTATORE  <<\n"
					+ ">> PREMI e PER USCIRE << ");
			
			switch(scelta) {
				
				case "1":{
					interruttore.click();
					break;
				}
				
				case "2":{
					interruttore2.click();
					break;
				}
				case "e": {
					System.out.println("\nGrazie ed arrivederci!!");
					return;
				}
				case "s": {
					Lampadina.setCorrente(false);
					break;
				}
				case "a":{
					Lampadina.setCorrente(true);
					break;
				}
				default: System.out.println("Insert Error");
			}
		}
		

	}

}
