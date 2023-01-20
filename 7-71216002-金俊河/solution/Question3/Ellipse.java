class Ellipse extends Shape {	
	private static Ellipse ellipse=new Ellipse();
	private static IShapeFactory factory;
	Ellipse(double a,double b){setA(a);setB(b);}
	
	public static void setFactory(IShapeFactory factory) {
		factory = new IShapeFactory() {
			public Shape makeShape(double a, double b) {
				Shape sh = Ellipse.ellipse;
				sh.setA(a);sh.setB(b);
				System.out.println(sh.calcArea());
				return sh;
			}
		};
		Ellipse.factory=factory;
	}
	
	private Ellipse(){ }
	
	public double calcArea() {return a*b*3.14;}
	
	public static IShapeFactory getFactory() {return factory;}
}