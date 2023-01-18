class Parent {
    int num = 4;

    protected void foo() {
        System.out.println("foo() of Parent");
    }

    static protected void bar() {
        System.out.println("bar() of Parent");
    }
}

class Child extends Parent {
    int num = 5;

    protected void foo() {
        System.out.println("foo() of Child");
    }

    static protected void bar() {
        System.out.println("bar() of Child");
    }
}

public class Test {
    public static void main(String[] args) {
        Parent f1 = new Parent();
        System.out.println(f1.num);

        Parent f2 = new Child();
        System.out.println(f2.num);

        Child c = new Child();
        System.out.println(c.num);

        f1.foo();
        f2.foo();
        c.foo();

        f1.bar();
        f2.bar();
        c.bar();
    }
}