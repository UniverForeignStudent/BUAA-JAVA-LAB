package real;

public class Test {
    static Integer a;
    static int b;

    public static void main(String[] args) {
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        a = new Integer("1");
        System.out.println("now a is " + a);
        Integer c = new Integer("1");
        System.out.println(a == c);
        System.out.println(a.compareTo(c)); // 0 is true
    }
}
