package q4;

import java.util.LinkedList;

public class MyStack<T> {
    private LinkedList<T> values=new LinkedList<T>();
    public void push(T t){
    	values.addLast(t);
    }
    public T pull(){
    	T t = null; 	
    	if(values!=null && values.size()>0) {
	    	t=values.getLast();
	    	values.removeLast();
    	}
        return t;
    }
    public T peek(){
    	if(values!=null && values.size()>0) {
	    	return values.getLast();
    	}
		return null;
    }
    public static void main(String[] args){
    	MyStack<String> firststack=new MyStack<String>();
    	
    	firststack.push("one");
    	firststack.push("two");
    	firststack.push("three");
    	
    	System.out.println(firststack.peek());
    	firststack.pull();
    	System.out.println(firststack.peek());
    	firststack.pull();
    	System.out.println(firststack.peek());
    	firststack.pull();
    	System.out.println(firststack.peek());
    	
    	MyStack<Integer> secondstack=new MyStack<Integer>();
    	
    	secondstack.push(1);
    	secondstack.push(2);
    	secondstack.push(3);
    	
    	System.out.println(secondstack.peek());
    	secondstack.pull();
    	System.out.println(secondstack.peek());
    	secondstack.pull();
    	System.out.println(secondstack.peek());
    	secondstack.pull();
    	System.out.println(secondstack.peek());
    }
}