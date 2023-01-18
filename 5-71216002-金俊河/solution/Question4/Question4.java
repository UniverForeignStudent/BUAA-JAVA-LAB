import java.util.ArrayList;
import java.util.List;

class Room{
	private int many;
	//many: 最大人数为5
	
	public void setter(int many) {
		this.many = many;
	}
	public int getter() {
		return many;
	}
}
class SpiralAbyss extends Room{
	Room rm = new Room();
	List<String> partner = new ArrayList<>();
	
	public void array(String n) {
		rm.setter(partner.size());
		if(rm.getter()>5-1) {
			System.out.println("失败");
		}else if(rm.getter()<=5-1) {
			partner.add(n);
			System.out.println(partner.toString());
		}
	}
}

class Person{
	private String name;
	SpiralAbyss s = new SpiralAbyss();
	
	public void person(String n){
		this.name = n;
		s.array(n);
	}
	
}

public class Question4 {
	public static void main(String args[]){
		Person a = new Person();
		
		System.out.println("最大组队人数为5");
		
		a.person("张三");
		a.person("李三");
		a.person("金三");
		a.person("朴三");
		a.person("金二");
		a.person("张二");
		a.person("张一");
	}
}
