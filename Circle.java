package TernaryOperator;

import java.util.Scanner;

public class Circle {
	public static void main(String[]args) {
		try (Scanner in = new Scanner(System.in)) {
		//Area of circle;
			float o,radius,area;
			 System.out.println("Enter the pi value of the circle: ");
		     o=in.nextFloat();
		     System.out.println("Enter the radius value of the circle: ");
		     radius=in.nextFloat();
		     area=o*radius*radius;
			System.out.println("The area of circle value is "+area);
		}	
	}

}
