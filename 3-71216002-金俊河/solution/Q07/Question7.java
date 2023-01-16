package lab03;

class Person{
	private int age;
	private String name;
	private String sex;
	public Person(){
		
	}
	public Person(String n,int a,String s){
		name = n;
		age = a;
		sex = s;
	}
	public void setAge(int a)
	{
		if(a < 0 || a > 130){
			System.out.println("仔细看范围");
			return;
			}age = a;
	}
	public int getAge(){
		return age;
	}
	public void showAge(){
		System.out.println(age);
	}
	public void setName(String n){
		name = n;
	}
	public String getName(){
		return name;
	}
	public void setsex(String s){
		sex = s;
	}
	public String getsex(){
		return sex;
	}
	
	public void work() {
		System.out.println("working");
	}
}


public class Question7 {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.setAge(21);
		p.getAge();
		p.showAge();
		p.work();
		
		Person p2 = new Person("Junha",21,"男");
		System.out.println("name = " + p2.getName() + ",age = " + p2.getAge() + ", sex ="+ p2.getsex());
		
		
	}
}
