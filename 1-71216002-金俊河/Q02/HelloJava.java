package folder;

import java.util.Scanner;

public class HelloJava {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        while (true) {
            String quit = scan.nextLine();
            if (quit.equals("QUIT")) {
                System.out.println("----- Good Bye! -----");
                break;
            }
            else System.out.println("Hello, World!");
        }
    }
		
	}
	




