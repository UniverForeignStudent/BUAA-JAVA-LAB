class Rhombus extends Shape {
	private static Rhombus rhombus=new Rhombus();
	private static IShapeFactory factory;
	Rhombus(double aa,double bb){setA(a);setB(b);}
	
	public static void setFactory(IShapeFactory factory) {
		factory = new IShapeFactory() {
			public Shape makeShape(double a, double b) {
				Shape sh = Rhombus.rhombus;;
				sh.setA(a);sh.setB(b);
				System.out.println(sh.calcArea());
				return sh;
			}
		};
		Rhombus.factory=factory;
	}
	
	private Rhombus(){ }
	
	public double calcArea() {return a*b/2;}
	
	public static IShapeFactory getFactory() {return factory;}
	
}