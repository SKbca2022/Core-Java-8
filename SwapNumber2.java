/* program to swap two numbers without using temp variable */
package  HelloWorld;

public class SwapNumber2 {
	public static void main(String[]args) { //main  is the string point of the program 
		int a,b;//declaration
		a=20;//assigning value
		b=40;//assigning value
		System.out.println("before interchanging a="+a+" and b="+b);//display
		a=a+b;//a=20+40=60
		b=a-b;//b=60-40=20
		a=a-b;//a=60-20=40
		System.out.println("after interchanging a="+a+" and b="+b);//display
		
	}
}
