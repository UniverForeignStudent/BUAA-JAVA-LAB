public abstract class Shape {
	abstract public double calcArea();
	
	protected double a;
	protected double b;

	public Shape() {this(0.0, 0.0);}
	public Shape(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() {return a;}
	public double getB() {return b;}
	
	public void setA(double a) {if(a<0) {a=0.0;}else {this.a = a;}}
	public void setB(double b) {if(b<0) {b=0.0;}else {this.b = b;}}}