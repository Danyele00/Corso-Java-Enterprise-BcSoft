package ese01;


public class Triangolo extends FiguraGeometrica {
    
    private double altezza;
    private double lato1;
    private double lato2;
    private double base;
    
    public Triangolo(double altezza, double lato1, double lato2, double base) {
		super();
		this.altezza = altezza;
		this.lato1 = lato1;
		this.lato2 = lato2;
		this.base = base;
	}
    
    

	@Override
	public void calcolaArea() {
		System.out.println("L'area e': " + ((base*altezza)/2));
	}



	@Override
	public void calcolaPerimetro() {
		System.out.println("Il perimetro e': " + (lato1+lato2+base));
	}



	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getLato1() {
		return lato1;
	}

	public void setLato1(double lato1) {
		this.lato1 = lato1;
	}

	public double getLato2() {
		return lato2;
	}

	public void setLato2(double lato2) {
		this.lato2 = lato2;
	}



	public double getBase() {
		return base;
	}



	public void setBase(double base) {
		this.base = base;
	}

	
    
    

    
   

 
    
}
