package lab03;

import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.Objects;

class wufuhao{
	private static String pattern1 = new String("^[1-9][0-9]*");
    private static String pattern2 = new String("0");
    
	 public boolean isReasonable(String s) {
	        if(Pattern.matches(pattern1, s) || Pattern.matches(pattern2, s)) {
	        	
	            return true; 
	        }
	        	
	            return false;
	       }
}


class huiwenshu {

	public boolean isDC(int num) {

		String string = String.valueOf(num);
		boolean flag = true;

		if (string.length()==1) {			
			flag = true;
		}else if(string.length()==2||string.length()==0){			
			flag = false;	
		}else {
			for(int i=0;i<string.length()/2;i++) {
				if(string.charAt(i)!= string.charAt(string.length()-1-i)) {				
					flag = false;
					break;
				}
			}
		}
		return flag;
		} 	
	}



public class Question8 {
	
	public static void main(String args[]){
		
		wufuhao w = new wufuhao();
		huiwenshu h = new huiwenshu();
		
	    Scanner sc = new Scanner(System.in);
	    
	    String s = sc.nextLine();
	    
	    w.isReasonable(s);
	    
	    if(w.isReasonable(s)==true) {
	    	System.out.println("没有前导 0 的无符号整数 - ture");
	    	int num = Integer.parseInt(s);
	    	h.isDC(num);
	    	if(h.isDC(num)==true) {
	    		System.out.println("回文数 - true");
	    	}else {
		    	System.out.println("回文数 - false");
	    	}
	    }else {
	    	System.out.println("没有前导 0 的无符号整数 - false");
	    }
	}

}
