package multithread;

import java.util.Scanner;

class OneThread extends Thread{
	public void run() {
		int r;
		System.out.println("Enter a number of rows");
		Scanner in=new Scanner(System.in);
		r=in.nextInt();
		for(int i=1;i<=r;i++) {
		System.out.println("In side run method"+Thread.currentThread());
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
public class TwoThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main Thread"+Thread.currentThread());
	    OneThread ob=new OneThread();
	    ob.setName("firstthread");
	    ob.start();
	    ob.join();
	    OneThread ob1=new OneThread();
	    ob1.setName("secondthread");
	    ob1.start();
	    ob1.join();


	}

}
