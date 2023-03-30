package ese01;

public class TestFigure {

	public static void main(String[] args) {
		
		Quadrato quadrato = new Quadrato (10);
		
		Triangolo triangolo = new Triangolo(10,15,12,20);
		
		quadrato.calcolaArea();
		quadrato.calcolaPerimetro();
		
		triangolo.calcolaArea();
		triangolo.calcolaPerimetro();
	}

}
