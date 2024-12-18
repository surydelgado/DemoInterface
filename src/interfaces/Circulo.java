package interfaces;



public class Circulo implements FiguraGeometrica {
	
	private double Pi = 3.1416 ;
	private double r;

	@Override
	public double calcularArea() {
		
		return Pi * Math.pow(r, 2);
	}

	public double getPi() {
		return Pi;
	}

	public void setPi(double pi) {
		Pi = pi;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

}
