package lab2;

import java.util.*;

public class Question08 {
	public static void main(String[] args) {
		
		System.out.println("输入数字： *一定是奇数*");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for (int i = 1; i <= n - 3; i++) {
			for (int j = n - 2; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i <= n - 3; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = (n-2)*2; j > 2 * i + 1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
