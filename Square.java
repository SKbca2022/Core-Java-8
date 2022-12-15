package TernaryOperator;
import java.util.Scanner;

public class Square {
	public static void main(String[]args) {
		try (Scanner r = new Scanner(System.in)) {
			int a,area;
			 System.out.println("Enter the size value of the Square: ");
		     a=r.nextInt();
		     area=a*a;
			System.out.println("The area of square value is "+area);
		}
	}
}
