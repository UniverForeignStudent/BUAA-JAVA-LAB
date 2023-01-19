package buaa6;

class Rectangle extends Shape {
	Rectangle(double aa,double bb){
		setA(aa);
		setB(bb);
	}
	public double calcArea() {
		return a*b;
	}
}