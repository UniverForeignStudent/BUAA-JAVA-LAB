package Q8;

import java.util.Scanner;
public class Triangle_Test {
	public static void main(String[] args) {

		Scanner reader=new Scanner(System.in);
		int i=0;
		double x,y,z;
		
		Triangle[] tri = new Triangle[5];
		
		while(i<5) {
			
			x=reader.nextDouble();
			y=reader.nextDouble();
			z=reader.nextDouble();
			
			tri[i]=new Triangle(x,y,z);
			
			try {
				if(!(x>0 && y>0 && z>0 && x+y>z && x+z>y && y+z>x)) {
					throw new NotTriangleException(x,y,z);
				}
				System.out.println("Area: "+tri[i].getArea());
				tri[i].showInfo();
			}
			catch(NotTriangleException e){
				
				System.out.println("It isn't triangle");
			}
			
			i++;
		}
	}
}
