package q5;

import java.util.HashMap;
import java.util.Map;

public class EmailSplit {
    public static void main(String[] args)
    {
    	int len;
    	
        String str = "aa@sohu.com,bb@163.com,cc@sina.com";
        Map<String, String> emailMap = new HashMap<String, String>();
        
        String[] email = str.split(",");
        len=email.length;
        
        for(int i=0;i<len;i++) {
        	String[] email_fuhao =email[i].split("@");
        	emailMap.put(email_fuhao[0],email_fuhao[1]);
        }
        
        System.out.println(emailMap.toString());
    }
}
