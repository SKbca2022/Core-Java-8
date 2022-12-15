package TernaryOperator;

import java.util.Scanner;

public class Triangle {
	public static void main(String[]args) {
		try (Scanner r = new Scanner(System.in)) {
			int height,breadth,area;
			 System.out.println("Enter the height value of the triangle: ");
		     height=r.nextInt();
		     System.out.println("Enter the breadth of the triangle: ");
		     breadth=r.nextInt();
		     area=(height*breadth)/2;
			System.out.println("The area of triangle value is "+area);
		}
	}

}
