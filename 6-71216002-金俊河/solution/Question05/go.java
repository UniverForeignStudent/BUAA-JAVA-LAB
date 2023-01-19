package buaa6;

public class go {
	
	@SuppressWarnings("null")
	
	public static void main(String[] args) {
		
		Shape[] p1 = new Shape[5];
		Shape[] p2 = new Shape[5];
		ShapeType rec=ShapeType.Rectangle;
		ShapeType rhb=ShapeType.Rhombus;
		ShapeType el=ShapeType.Ellipse;
		
		p1[0]=ShapeFactory.makeShape(rec, 4, 4);
		p1[1]=ShapeFactory.makeShape(rhb, 4, 4);
		p1[3]=ShapeFactory.makeShape(el, 4, 4);
		p1[4]=ShapeFactory.makeShape(el, 1, 1);

		
		for(Shape i:p1) {
			if(i!=null) {
				System.out.println(i.calcArea());
			}
			else {System.out.println("exception");}
		}
		
		for(int i=0;i<5;i++) {
			p2[i]=ShapeFactory.randomNextShape();
		}
		
		for(Shape i:p2) {
			if(i!=null) {
				System.out.println(i.calcArea());
			}
			else {System.out.println("exception");}
		}
	}
}
