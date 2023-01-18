class folder extends Question6{
	public void test(){
	 System.out.println("文件夹：");
	 System.out.println("文件名： "+this.name +";创建时间： "+this.time+";大小： "+this.big+";内容： "+this.content+";位置"+this.where);
	}
}
class direct extends Question6{
	public void test(){
		 System.out.println("快捷方式：");
		 System.out.println("文件名： "+this.name +";创建时间： "+this.time+";大小： "+this.big+";内容： "+this.content+";位置"+this.where);
		}
}
class able extends Question6{
	public void test(){
		 System.out.println("可执行文件：");
		 System.out.println("文件名： "+this.name +";创建时间： "+this.time+";大小： "+this.big+";内容： "+this.content+";位置"+this.where);
		}
}
class disable extends Question6{
	public void test(){
		 System.out.println("不可执行文件：");
		 System.out.println("文件名： "+this.name +";创建时间： "+this.time+";大小： "+this.big+";内容： "+this.content+";位置"+this.where);
		}
}

public abstract class Question6 {
	protected String name;
	protected String time;
	protected int big;
	protected String content;
	protected String where;
	
	public void wenjian(String name, String time,int big,String content,String where) {
        this.name = name;
        this.time = time;
        this.big = big;
        this.content = content;
        this.where = where;
    }
	public static void main(String args[]){
		folder fd = new folder();
		direct dr = new direct();
		able ab = new able();
		disable db = new disable();
		
		fd.wenjian("MANGO", "10:00", 16, "FRUIT", "C");
		dr.wenjian("FORK", "10:20", 16, "FOOD", "lnk");
		ab.wenjian("START", "10:50", 16, "PLAY", "open");
		db.wenjian("LOL", "11:00", 16, "GAME", "function");
		
		fd.test();
		dr.test();
		ab.test();
		db.test();
	}
	
}
