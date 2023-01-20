class Rectangle extends Shape {
	private static Rectangle rectangle=new Rectangle();
	private static IShapeFactory factory;
	
	public static void setFactory(IShapeFactory factory) {
		factory = new IShapeFactory() {
			public Shape makeShape(double a, double b) {
				Shape shape = Rectangle.rectangle;
				shape.setA(a);shape.setB(b);
				System.out.println(shape.calcArea());
				return shape;
			}
		};
		Rectangle.factory=factory;
	}
	
	private Rectangle(){ }
	
	public double calcArea() {return a*b;}
	
	public static IShapeFactory getFactory() {return factory;}
}