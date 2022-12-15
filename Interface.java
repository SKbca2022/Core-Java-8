package levels;

//interface is blue print for class
interface MyIntFace1{
	int i=9; //public static final int i=9;
	void m1(); //public abstract void m1();
	void m2();//public abstract void m1();
}

class Product implements MyIntFace1{

	@Override
	public void m1() {
		System.out.println("m1()");
		
	}

	@Override
	public void m2() {
		System.out.println("m2()");
		
	}
	
}

public class Interface {

	public static void main(String[] args) {
		Product pob=new Product();
		pob.m1();
		pob.m2();

	}

}