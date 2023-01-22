package Q8;

public class NotTriangleException extends Exception{
	double a,b,c;
	NotTriangleException(double a,double b,double c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
}
