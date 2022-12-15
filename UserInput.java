package TernaryOperator;

import java.util.Scanner;

public class UserInput {
	public static void main(String[]args) {
		try (Scanner in = new Scanner(System.in)) {
			String name;
			int age;
			float fees;
			char gender;
			
System.out.println("Enter the name");
name=in.nextLine();
System.out.println("Enter the age");
age=in.nextInt();
System.out.println("Enter the fees");
fees=in.nextFloat();
System.out.println("Enter the genter (M/F)");
gender=in.next().charAt(0);

//display
System.out.println("Name="+name);
System.out.println("Age="+age);
System.out.println("fees="+fees);
System.out.println("gender="+gender);
		}
		
		
		
	}
}
