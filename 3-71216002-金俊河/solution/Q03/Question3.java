package lab03;

class Dog{
	 private String name;
	 private int age;
	 
	 public Dog(int age,String name) {  
		 this.name = name;
		 this.age = age;
    }
	 public void bark(int i){
			System.out.println(age+"岁的"+name+" barking");
		}
		
		public void bark(String name){
			System.out.println(age+"岁的"+name+" howing");
		}
}
public class Question3 {
	
	public static void main(String args[]) {
		Dog dog= new Dog(5,"Rich");
		dog.bark(5);
		
	}
		}