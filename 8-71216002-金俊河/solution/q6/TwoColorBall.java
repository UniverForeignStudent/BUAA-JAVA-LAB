package q6;

import java.util.HashSet;
import java.util.Random;

public class TwoColorBall {
	public static void main(String[] args) {
		
		HashSet<String> TwoBall = new HashSet<>();
		
		do {
			int i = (new Random().nextInt(33)) + 1;
			String s = "红球 " + i;
			TwoBall.add(s);
		} 
		while (TwoBall.size() != 6);
		
		TwoBall.add("篮球 " + ((new Random().nextInt(16)) + 1));
		
		for (String s : TwoBall) {
			System.out.println(s);
		}
	}
}
