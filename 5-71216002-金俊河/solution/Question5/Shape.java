class Rectangle extends Shape{
	private double a;
	private double b;
	private double area;
	
	public void chang(double a, double b) {
		if(a<0) {
			this.a=0.0;
		}else {this.a = a;}	
		if(b<0) {
			this.b=0.0;
		}else {this.b =b;}
	}
	public double a() {
		return a;
	}
	public double b() {
		return b;
	}
	@Override
	public double calcArea() {
		area = a*b;
		
		return area;
	}
	
	
}
class Rhombus extends Shape{
	private double a;
	private double b;
	private double area;
	
	public void chang(double a, double b) {
		if(a<0) {
			this.a=0.0;
		}else {this.a = a;}
		if(b<0) {
			this.b=0.0;
		}else {this.b =b;}
	}
	public double geta() {
		return a;
	}
	public double getb() {
		return b;
	}
	@Override
	public double calcArea() {
		area = geta()*getb()/2;
		return area;
	}
}

class Ellipse extends Shape{
	private double a;
	private double b;
	private double area;
	
	public void chang(double a, double b) {
		if(a<0) {
			this.a=0.0;
		}else {this.a = a;}
		if(b<0) {
			this.b=0.0;
		}else {this.b =b;}
	}
	public double geta() {
		return a;
	}
	public double getb() {
		return b;
	}
	@Override
	public double calcArea() {
		area = 3.14*geta()*getb();
		return area;
	}
}

class test{

	Rectangle rc = new Rectangle();
	Rhombus rb = new Rhombus();
	Ellipse el = new Ellipse();
	
	public void test(){
		rc.chang(2.0,2.0);
		rb.chang(1.0,2.0);
		el.chang(1.0,2.0);	
		
		System.out.println("Rectangle's area: "+rc.calcArea()+"; Rhombus's area: "+rb.calcArea()+"; Ellipse's area: "+el.calcArea());
	}

}

public abstract class Shape {
	
    protected double a;
    protected double b;

    public Shape() { this(0.0, 0.0); }
    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    abstract public double calcArea();
    
    
	public static void main(String args[]){
		Rectangle rc = new Rectangle();
		Rhombus rb = new Rhombus();
		Ellipse el = new Ellipse();
		test test=new test();
	
		test.test();
	}
	
    /* Ðìöâù±é©îÜÛ°Ûö£¬Ýïåý getter ûú setter */
}
