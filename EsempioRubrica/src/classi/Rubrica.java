package classi;

public class Rubrica {
	
	private String proprietario;
	private Contatto[] contatti;

	public Rubrica(String proprietario, Contatto... contatti) {
		super();
		this.proprietario = proprietario;
		this.contatti = new Contatto[contatti.length];
		
		
		for (int i=0; i<contatti.length;i++) {
			this.contatti[i] = contatti[i];
		}
	}

	@Override
	public String toString() {
		
		String stringa ="\nNOME RUBRICA: " + getProprietario();
		int i = 1;
		for (Contatto contatto : this.contatti) {
			stringa= stringa.concat("\n"+ i+"  "+contatto.toString());
			i++;
		}
		return stringa;
	}

	public Contatto[] getContatti() {
		return contatti;
	}

	public void setContatti(Contatto[] contatti) {
		this.contatti = contatti;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

		
	
	
	

}
