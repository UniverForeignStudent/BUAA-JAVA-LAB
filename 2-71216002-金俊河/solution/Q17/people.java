package lab2;

public class people 
{  
	String name; 
	int weight;  
	public people()
	{  
		
	}  
	public void jianfei()
	{
		int t=weight; 
		weight-=25; 
		System.out.println(name+"的体重由原来的"+t+"kg减到"+weight+"kg"); 
		}  
	public static void main(String[] args) 
	{  
		people pp=new people();  
		pp.name="⼩王"; 
		pp.weight=70;  
		pp.jianfei(); 
		}
	}