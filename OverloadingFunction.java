package functions;

class Overloadfunction{
	void display() {
		System.out.println("No Argument Function");
	}
	void display(int i) {
		System.out.println("one Argument Function of type int");
	}
	void display(float i) {
		System.out.println("one Argument Function of type float");
	}
	void display(double i) {
		System.out.println("one Argument Function of type double");
	}
	void display(int i,int j) {
		System.out.println("Two Argument Function of type int");
	}
	void display(float i,float j) {
		System.out.println("Two Argument Function of type float");
	}
	void display(double i,double j) {
		System.out.println("Two Argument Function of type double");
	}
	void display(int i,float j) {
		System.out.println("Two Argument Function of type int,float");
	}
	void display(float i,int j) {
		System.out.println("Two Argument Function of type float,int");
	}
	void display(double i,float j) {
		System.out.println("Two Argument Function of type double,float");
	}
}
public class OverloadingFunction {

	public static void main(String[] args) {
		Overloadfunction ob=new Overloadfunction();
		ob.display();
		ob.display(45);
		ob.display(69.6f);
		ob.display(534.4);
		ob.display(45,56);
		ob.display(789.4f,345.6f);
		ob.display(567.45,345.87);
		ob.display(34,567.6f);
		ob.display(233.4f,67);
		ob.display(4567.0,7678.7f);

	}

}
