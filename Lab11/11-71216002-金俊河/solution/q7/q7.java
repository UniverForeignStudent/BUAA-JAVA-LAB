public class q7{
 
	public static void main(String[] args) {
		Object obj = new Object();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
 
		t1.start();
		t2.start();
	}
}
 
class Thread1 extends Thread {
	private Object obj;
 
	public Thread1(Object obj) {
		this.obj = obj;
	}
 
	public void run() {
		synchronized (obj) {
			for (int i = 1; i < 53; i++) {
				System.out.print(i);
				if (i % 2 == 0) {
					obj.notifyAll();
					try {
						obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
 
		}
	}
}
 
class Thread2 extends Thread {
	private Object obj;
 
	public Thread2(Object obj) {
		this.obj = obj;
	}
 
	public void run() {
		synchronized (obj) {
			for (int i = 0; i < 26; i++) {
				System.out.print((char) (i+ 'A'));
				System.out.print(" ");
				obj.notifyAll();
				try {
					obj.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}