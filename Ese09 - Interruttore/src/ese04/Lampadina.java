package ese04;

public class Lampadina {
	
	private static boolean corrente;
	
	private boolean isOn;
	private boolean isRotta;
	private int nClick;
	private int contClick=0;
	

	public Lampadina() {
	}

	public Lampadina(int nClick) {
		this.isOn = false;
		this.isRotta = false;
		this.nClick=nClick;
	}
	
	public String stato() {
		
		String stringa ="";
		if (isOn)
			stringa="((((======= ON =========)))) <" + (nClick - contClick) + ">\n";
		else if (!isOn)
			stringa= "((((        OFF          ))))  <" + (nClick - contClick) + ">\n ";
		else if (isRotta)
			stringa= "((((   -  -ROTTA-  -   -)))) <" + (nClick - contClick) + ">\n";
		
		return stringa;
	}
	
	public void click() {
		
		if (!corrente) {
			System.out.println("Errore corrente staccata");
			return;
		}
		
		if (isRotta) {
			System.out.println("Errore lampadina rotta");
			return;
		}
		
		isOn = !isOn;
		contClick++;
		
		System.out.println(stato());
			
		if (contClick==nClick)
			isRotta=true;
	}
	
	

	public static boolean isCorrente() {
		return corrente;
	}

	public static void setCorrente(boolean corrente) {
		Lampadina.corrente = corrente;
	}

	public int getContClick() {
		return contClick;
	}

	public void setContClick(int contClick) {
		this.contClick = contClick;
	}

	public int getnClick() {
		return nClick;
	}
	public void setnClick(int nClick) {
		this.nClick = nClick;
	}

	public boolean isOn() {
		return isOn;
	}

	public void setOn(boolean isOn) {
		this.isOn = isOn;
	}

	public boolean isRotta() {
		return isRotta;
	}

	public void setRotta(boolean isRotta) {
		this.isRotta = isRotta;
	}
	
	

}
