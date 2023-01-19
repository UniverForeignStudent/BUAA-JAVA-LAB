package buaa6;
import java.util.Random;
public class ShapeFactory {
	public static Shape makeShape(ShapeType type, double a, double b) {
		if(a<=0||b<=0)
			return null;
		if(ShapeType.Rectangle==type) {
			Shape p=new Rectangle(a,b);
			return p;
		}
		else if(ShapeType.Rhombus==type) {
			Shape p=new Rhombus(a,b);
			return p;
		}
		else if(ShapeType.Ellipse==type) {
			Shape p=new Ellipse(a,b);
			return p;
		}
		else return null;
	}
	public static Shape randomNextShape() {
		Random rand = new Random(); 
		int num=rand.nextInt(8)+1;
		if(num<=3&&num>=1) {
			Shape p=new Rectangle(Math.random()*10,Math.random()*10);
			if(p.getA()<=0||p.getB()<=0)
				return null;
			return p;
		}
		else if(num>=3&&num<=6) {
			Shape p=new Rhombus(Math.random()*10,Math.random()*10);
			if(p.getA()<=0||p.getB()<=0)
				return null;
			return p;
		}
		else if(num>=6&&num<=9) {
			Shape p=new Ellipse(Math.random()*10,Math.random()*10);
			if(p.getA()<=0||p.getB()<=0)
				return null;
			return p;
		}
		return null;
	}
}
