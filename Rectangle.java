package TernaryOperator;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[]args) {
		try (Scanner r = new Scanner(System.in)) {
			int length,breadth,area;
			 System.out.println("Enter the length of the Rectangle: ");
		     length=r.nextInt();
		     System.out.println("Enter the breadth of the Rectangle: ");
		     breadth=r.nextInt();
		     area=length*breadth;
			System.out.println("The area of rectangle value is "+area);
		}
	}
}
