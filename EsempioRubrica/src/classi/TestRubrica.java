package classi;

public class TestRubrica {

	public static void main(String[] args) {
		
		
		Contatto contatto1 = new Contatto("Daniele", "320 4444 222", "dani@ihfsdf.it" );
		Contatto contatto2 = new Contatto("Paolo", "320 5555 222", "d@ihfsd.it" );
		Contatto contatto3 = new Contatto("Carmine", "320 6665 222", "i@ifsdh.it" );
		Contatto contatto4 = new Contatto("Iris", "320 7777 345", "di@igfdh.it" );
		Contatto contatto5 = new Contatto("Luca", "320 8888 227", "dni@ivsddh.it" );
		Contatto contatto6 = new Contatto("Daniela", "323 888 262", "dai@ifdsh.it" );
		
		
		Rubrica rubrica1 = new Rubrica("Nuova rubrica",contatto1);
		Rubrica rubrica2 = new Rubrica("La mia rubrica del cuore", contatto1,contatto2,contatto3,contatto4,contatto5);
		Rubrica rubrica3 = new Rubrica("Rubrica Mia", contatto3,contatto5,contatto6);
		
		
		System.out.println(rubrica1.toString());
		System.out.println(rubrica2.toString());
		System.out.println(rubrica3.toString());

	}

}
