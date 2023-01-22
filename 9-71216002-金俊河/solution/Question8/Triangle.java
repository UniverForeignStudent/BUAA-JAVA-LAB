package Q8;

public class Triangle {
	private double x;
	private double y;
	private double z;
	public Triangle(double xx,double yy,double zz) {
		x=xx;
		y=yy;
		z=zz;
	}
	public double gX() {return x;}
	public void sX(double x) {this.x = x;}
	public double gY() {return y;}
	public void sY(double y) {this.y = y;}
	public double gZ() {return z;}
	public void sZ(double z) {this.z = z;}
	
	public double getArea() throws NotTriangleException{
		
		double a=(x+y+z)/2;
		double r=Math.sqrt(a*(a-x)*(a-y)*(a-z));	
		return r;
	}
	
	public void showInfo() throws NotTriangleException{
		System.out.println("X: "+x+", Y: "+y+", Z: "+z);
	}
	
}
