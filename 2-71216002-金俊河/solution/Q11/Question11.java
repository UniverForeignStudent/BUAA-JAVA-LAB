package lab2;

import java.util.Scanner;

public class Question11 {
	public static void main(String[] args) {
		int start=0;
		int middle,end;
		int a[]= {12,45,67,89,123,-45,67};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		Scanner reader=new Scanner(System.in);
		System.out.println("请输入要判断的整数:");
		int number=reader.nextInt();
		int count=0;
		end=a.length;
		middle=(start+end)/2;
		while(number!=a[middle]) {
			if(number>a[middle]) {
				start=middle;
			}else {
				end=middle;
			}
			middle=(start+end)/2;
			count++;
			if(count>a.length/2) {
				break;
			}
		}
		if(count>a.length/2) {
			System.out.println(number+"不在数组中");
		}else {
			System.out.println(number+"在数组中");
		}
		System.out.println("---------------");
		System.out.println("从小到大");
		for(int i:a){	
			System.out.print(i+" ");
		}
	}

}
