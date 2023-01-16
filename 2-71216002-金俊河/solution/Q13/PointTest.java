package lab2;

class Point {
    int x, y;
    void setArgs(int m, int n) {
        x = m;
        y = n;
    }
}

public class PointTest {
    public static void main(String[] args) {
        Point p1, p2;
        p1 = new Point();
        p2 = new Point();
        System.out.println("p1的引用:" + p1);
        System.out.println("p2的引用:" + p2);
        p1.setArgs(1111, 2222);
        p2.setArgs(-100, -200);
        System.out.println("p1的x,y坐标:" + p1.x + "," + p1.y); // 1
        System.out.println("p2的x,y坐标:" + p2.x + "," + p2.y); // 2
        p1 = p2;
        p1.setArgs(0, 0);
        System.out.println("p1的引用:" + p1);
        System.out.println("p2的引用:" + p2);
        System.out.println("p1的x,y坐标:" + p1.x + "," + p1.y); // 3
        System.out.println("p2的x,y坐标:" + p2.x + "," + p2.y); // 4
    }
}