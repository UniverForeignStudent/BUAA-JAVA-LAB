package buaa6;

class Ellipse extends Shape {
	Ellipse(double aa,double bb){
		setA(aa);
		setB(bb);
	}
	public double calcArea() {
		return a*b*3.14;
	}
}