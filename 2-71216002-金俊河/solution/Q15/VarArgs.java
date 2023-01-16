package lab2;

public class VarArgs {
    public static void main(String[] args) {
        f(1, 2);
        f(-1, -2, -3, -4); //给参数传值时，实参的个数很灵活
        f(9, 7, 6);
    }

    public static void f(int... x) {    //x是可变参数的代表，代表若干个int型参数
        for (int i = 0; i < x.length; i++) {  //x.length是x代表的参数的个数
            System.out.println(x[i]);  //x[i]是x代表的第i个参数(类似数组)
        }
    }
}