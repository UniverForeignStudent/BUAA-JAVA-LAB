package buaa6;

public abstract class Shape {
	protected double a;
	protected double b;

	public Shape() {
		this(0.0, 0.0);
	}

	public Shape(double a, double b) {
		this.a = a;
		this.b = b;
	}

	abstract public double calcArea();

	public double getA() {
		return a;
	}

	public void setA(double a) {
		if(a<0)
			a=0.0;
		else 
			this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		if(b<0)
			b=0.0;
		else 
			this.b = b;
	}
}