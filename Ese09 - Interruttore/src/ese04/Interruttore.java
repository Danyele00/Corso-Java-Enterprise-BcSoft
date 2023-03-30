package ese04;

public class Interruttore {
	
	private Lampadina lampadina;
	
	
	public Interruttore() {
		super();
	}

	public Interruttore(Lampadina lampadina) {
		this.lampadina = lampadina;
		
	}
	
	public void click() {
		
		lampadina.click();
	}
	

	public Lampadina getLampadina() {
		return lampadina;
	}

	public void setLampadina(Lampadina lampadina) {
		this.lampadina = lampadina;
	}

	
	
	
	

}
