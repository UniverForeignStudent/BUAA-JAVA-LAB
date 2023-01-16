package lab2;

public class Unicode {
    public static void main(String[] args) {
        char c = '大';
        System.out.println("'" + c + "'的Unicode编码：" + (int) c);
        int num = 23398;
        System.out.println("Unicode编码为" + num + "的字符是：" + (char) num);
    }
}