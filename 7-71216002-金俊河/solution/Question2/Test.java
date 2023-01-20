interface Inter { 
	void show(); 
}

class Outer {
	public static Inter method(){
		Inter dulu1=dulu;
		return dulu1;
	}
	static Inter dulu=new Inter(){
		public void show() {
			System.out.println("DuluDulu");
		}
	};
}

public class Test {
	 public static void main(String[] args) {
	     Outer.method().show();
	 }
}