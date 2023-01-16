package lab2;

public class dinner 
{  
	String who; 
	String weile;
	int weight;  
	public dinner()
	{  
		
	}  
	public void cook()
	{
	
		System.out.println(who+"协同制作年夜饭为了"+weile+"。"); 
		}  
	public static void main(String[] args) 
	{  
		dinner d=new dinner();  
		d.who="爸爸和婶婶"; 
		d.weile="姑姑，妈妈和我";
		d.cook(); 
		}
	}
