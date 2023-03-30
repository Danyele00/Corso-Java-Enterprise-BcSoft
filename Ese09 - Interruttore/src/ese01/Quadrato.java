
package ese01;

public class Quadrato extends FiguraGeometrica{
    
	private double lato1;
	
    public Quadrato (double lato1){
    	super();
    	this.lato1=lato1;
    }

	public Quadrato() {
		super();
	}
	
	

	@Override
	public void calcolaArea() {
		System.out.println("L'area e' : "+ (lato1*lato1));
	}

	@Override
	public void calcolaPerimetro() {
		System.out.println("Il perimetro e' : "+ (lato1*4));
	}

	public double getLato1() {
		return lato1;
	}

	public void setLato1(double lato1) {
		this.lato1 = lato1;
	}
    
    
    
}
