import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		
		ShapeSequence sh=new ShapeSequence(n);

		sh.add(new Ellipse(1,1));
		
		String s=sh.toString();
		
		System.out.println(s);
		
		IIterator iter1=sh.iterator();
		
		Shape sh1;
		
		while(!iter1.isEnd()) {
			System.out.println(iter1.isEnd());
			sh1=iter1.current();
			System.out.print("a="+sh1.getA()+","+"b="+sh1.getB()+",Area="+sh1.calcArea());
			iter1.moveNext();
		}
		
		System.out.println();
		System.out.println(iter1.isEnd());
		
		if(!iter1.isEnd()) {
			sh1=iter1.current();
			System.out.print("a="+sh1.getA()+","+"b="+sh1.getB()+",Area="+sh1.calcArea());
		}
	
	}
}
