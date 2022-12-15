package levels;

abstract class MainShape{
	abstract void area();
}

class Reactangle extends MainShape{

	@Override
	void area() {
		int l=9;
		int b=8;
		int a;
		a=l*b;
		System.out.println("Area of reactangle="+a);
		
	}
	 
}
class Square extends MainShape{

	@Override
	void area() {
		int l=9;
		
		int a;
		a=l*l;
		System.out.println("Area of square="+a);
		
	}
	 
}

public class Shape {

	public static void main(String[] args) {
		Reactangle rob=new Reactangle();
		Square sob=new Square();
		rob.area();
		sob.area();
		
	/*	MainShape obj;
		obj=new Reactangle();
		obj.area();//reactangle
		obj=new Square();
		obj.area();//square */ 
	}

}