package interfacce;

public interface InterfaceAuto {
	
	public void apriPorte();
	
	public default void sgomma() {
		System.out.println("Azione.. sto sgommando");
	}
	

}
