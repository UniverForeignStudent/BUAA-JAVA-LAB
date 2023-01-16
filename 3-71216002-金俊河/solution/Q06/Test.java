package lab03;

public class Test {
	public static void main(String[] args){
		IMessage music = new IMessage("music", "jazz");
		IMessage mobile = new IMessage("apple", "13 pro");
		music.print();
        mobile.print();
	}
		}
class IMessage{
	private String Name;
	private String Type;
	public IMessage(String Name, String Type)
	{
		super();
		this.Name = Name;
		this.Type = Type;
	}
	public void music(String Name , String Type)
	{
		this.Name=Name;
		this.Type=Type;
	}
	public void Type(String Name , String Type)
	{
		this.Name=Name;
		this.Type=Type;
	}
	public void print()
	{
	System.out.println(Name + ", " + Type);
	}
	}
