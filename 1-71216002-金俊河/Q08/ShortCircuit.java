package real;

//ShortCircuit.java
public class ShortCircuit {
 static void print(String s) {
     System.out.println(s);
 }
 static boolean test1(int val) {
     print("1");
     return val < 1;
 }
 static boolean test2(int val) {
     print("2");
     return val < 2;
 }
 static boolean test3(int val) {
     print("3");
     return val < 3;
 }
 public static void main(String[] args) {
     boolean a = test1(0) && test2(2) && test3(2);
     boolean b = test1(1) || test2(1) || test3(1);
     print("a is " + a);
     print("b is " + b);
 }
}