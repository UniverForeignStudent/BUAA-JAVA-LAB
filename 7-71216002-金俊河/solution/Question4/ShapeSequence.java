
public class ShapeSequence {
	//具有属性 `private Shape[] shapes`
	private Shape[] shapes;
	
	// 构造方法 `ShapeSequence(int size)`
	//size 用于指定 shapes 的最大长度，如果 size 是负数，那么按照 0 来处理。
	//构造方法中应当对 shapes 进行初始化赋值，在其他过程中 shapes 的大小不应该被改变
	ShapeSequence(int size){
		if(size>0) {
			shapes=new Shape[size];
		}else{
			shapes=new Shape[0];
		}
	}
	
	 //方法 `public void add(Shape shape)`
	 //向 shapes 中添加一个新的元素,当shapes被填满时，什么都不做
	public void add(Shape sh) {
		int length=shapes.length;
		int i=0;
		
		for(i=0;i<length;i++) {
			if(i<=length-1) {
				shapes[i]=sh;
			}
			else if(shapes[i]==null) {break;}
		}
	}

	//方法 `public String toString()`
	//返回这个容器的字符串表达，格式为 `[Type, Type,...]`
	//格式中的 Type 是形状类型的全小写英文单词，比如 `rectangle、ellipse`
	
	public static String Type(Object object){
		if(object instanceof Rectangle)
			return "rectangle";
		if(object instanceof Rhombus)
			return "rhombus";
		if(object instanceof Ellipse)
			return "ellipse";
		else{return null;}
	}
	
	public String toString() {
		String s="[";
		int length=shapes.length;
		int i=0;
		
		for(i=0;i<length;i++) {
			if(i<length-1 && shapes[i+1]==null) {
				s=s+Type(shapes[i])+"]";
			}
			else if(shapes[i]==null) {
				break;
			}
			else if(i==length-1) {
				break;
			}
			else {
				s=s+Type(shapes[i])+",";
			}
		}
		if(i==length-1) {
			s=s+Type(shapes[i])+"]";
		}
		if(length==0) {
			s+="]";
		}
		return s;
	}
	
	
	public IIterator iterator() {
		return new SequenceIterator();
	}
	
	private class SequenceIterator implements IIterator{

		public int iter;
		
		SequenceIterator(){
			iter=0;
		}
		
		//方法 `public boolean isEnd()`，迭代器完成遍历时，返回 true
	    //完成遍历不代表迭代器指向了最后一个元素，而是指向了最后一个元素的下一个位置
		public boolean isEnd() {
			int length=shapes.length;
			int i=0;
			for(i=0;i<length;i++) {
				if(shapes[i]==null)
					break;
			}
			int min=i<length?i:length;
			if(iter==min)
				return true;
			return false;
		}

		//方法 `public Shape current()`，返回当前迭代器指向位置的 Shape 对象
	    //isEnd()是 true 时，访问 current 是非法操作
		public Shape current() {
			if(isEnd()) {return null;}
			return shapes[iter];
		}

		//方法 `public void moveNext()`，使迭代器移动到下一个元素的位置
	    //isEnd()是 true 时，什么都不做
		public void moveNext() {
			if(!isEnd()) {iter++;}
		}
		
		//方法 `public boolean equals(Object o)`，当 o 是 `SequenceItetator` 类型的、且
	    //o 和 this 的外部类对象相同、且 o 和 this 的位置相同时，返回 true
		public boolean equals(Object o) {
			if(o instanceof SequenceIterator) {
				if(((SequenceIterator) o).zhe()==this.zhe()&&((SequenceIterator) o).iter==this.iter)
					return true;
			}
			return false;
		}
		
		public ShapeSequence zhe(){
			return ShapeSequence.this;
		}
	}
	
}
