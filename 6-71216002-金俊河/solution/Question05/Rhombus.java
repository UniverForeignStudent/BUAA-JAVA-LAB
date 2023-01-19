package buaa6;

class Rhombus extends Shape {
	Rhombus(double aa,double bb){
		setA(aa);
		setB(bb);
	}
	public double calcArea() {
		return a*b/2;
	}
}