class Outer {
    public int num = 10;
    
    class Inner {
        public int num = 20;
        public void show() {
            int num = 30;
            System.out.println(num);
            System.out.println(new Outer().new Inner().num);
            System.out.println(new Outer().num);
        }
    }
}
public class Test {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.show();
    }
}