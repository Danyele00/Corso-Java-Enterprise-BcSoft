package interfacce;

public interface InterfaceMoto {
	
	
	public void impenna();
	
	
	public default void cavalletto(int i) {
		if (i<=0) {
			System.out.println("Azione.. metto il cavalletto laterale");
		}else {
			System.out.println("Azione.. metto il cavalletto centrale");
		}
	}
	

}
