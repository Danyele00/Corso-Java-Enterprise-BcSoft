package ese04;

public class TestLampadina {

	public static void main(String[] args) {
		
		Lampadina lampadina = new Lampadina(10);
		
		
		
		while(!lampadina.isRotta()) {
			
			String scelta = Tastiera.leggiStringa(">> PREMI 0 PER CLICCARE <<\n>> PREMI e PER USCIRE << ");
			
			switch(scelta) {
				
				case "0":{
					lampadina.click();
				}
				break;
				case "e": {
					System.out.println("\nGrazie ed arrivederci!!");
					return;
				}
				default: System.out.println("Insert Error");
			}
		}
		
		System.out.println("Is rott");

	}

}
