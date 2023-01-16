package lab2;

import java.util.*;


public class Question07 {
 
    public static void main(String[] args) {
        
        int b,i,j,d=1;
        
        Scanner a=new Scanner(System.in);
        System.out.println("输入数字");
        b=a.nextInt();
        
        for(i=0;i<b;i++)
        {
            for(j=0;j<b;j++)
            {
                System.out.print(d+" ");
                if(d<10)
                	System.out.print(" ");
                d++;
            }
            System.out.println( );
        }
 
    }
 
}
