package multithread;
//one way of creating thread

class MyThread extends Thread{
	public void run() {
		System.out.println("In side run method"+Thread.currentThread());
	}
}
public class SThread {

	public static void main(String[] args) {
		
		 System.out.println("Main Thread"+Thread.currentThread());
	    MyThread ob=new MyThread();
	    ob.start();
	    MyThread ob1=new MyThread();
	    ob1.start();	    

	}

}
