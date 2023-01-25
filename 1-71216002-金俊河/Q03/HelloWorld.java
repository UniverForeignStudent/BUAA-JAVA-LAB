
public class HelloWorld {
	public static void main(String[] args) {
        System.out.println("Hello World!");
        int a = 1;
        a=a+1;
        a=a+2;
        System.out.println("a is " + a);
        a=a+3;  //断点行       a:4
        a=a+4;
        System.out.println("a is " + a);
    }
}
