package lab2;

public class Question09 {
	public static void main(String[] args) {
        
        int max = 1000;
        double item = 0;
        double sum = 0;
        int n = -1;
        for (int i = 0; i <= max; i++) {
            n *= -1;
            item = n * 1.0 / (2 * i + 1);
            sum += item;
        }
        System.out.println("π=" + sum * 4);
 
    }
 
}