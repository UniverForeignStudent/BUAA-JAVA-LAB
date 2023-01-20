import java.util.Scanner;

public class ShapeFactoryTest {

	public static void main(String[] args) {
		double a,b;
		int c = 0;
		
		IShapeFactory test = null;
		Scanner sc=new Scanner(System.in);
		System.out.println("1:Rectangle 2:Rhombus 3:Ellipse");
		for(int i=0;i<=2;i++) {
			a=sc.nextDouble();
			b=sc.nextDouble();
			if(c==0) {
				System.out.print("Rectangle: ");
				Rectangle.setFactory(test);
				Rectangle.getFactory().makeShape(a,b);
				c++;
			}else if(c==1) {
				System.out.print("Rhombus: ");
				Rhombus.setFactory(test);
				Rhombus.getFactory().makeShape(a,b);
				c++;
			}else if(c==2) {
				System.out.print("Ellipse: ");
				Ellipse.setFactory(test);
				Ellipse.getFactory().makeShape(a,b);
			}
		}
	}
}
