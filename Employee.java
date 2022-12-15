package TernaryOperator;

import java.util.Scanner;

public class Employee {
	public static void main(String[]args) {
		try (Scanner in=new Scanner(System.in)){
			String ename;
			int eage;
			float esalary;
			String edept;
			double eyearsalary;
			
			System.out.println("Enter the Employee Name");
			ename=in.nextLine();
			System.out.println("Enter the Employee Age");
			eage=in.nextInt();
			System.out.println("Enter the Employee Salary");
			esalary=in.nextFloat();
			eyearsalary=esalary*12;
			edept=in.nextLine();
			System.out.println("Annual salary is "+eyearsalary);
			System.out.println("Enter the Employee department");
			edept=in.nextLine();
			
			
			System.out.println("Name="+ename);
			System.out.println("Age="+eage);
			System.out.println("Salary="+esalary);
			System.out.println("Department="+edept);
			System.out.println("year salary="+eyearsalary);
		}
	}

}
