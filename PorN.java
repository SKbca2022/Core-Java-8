package Positiveornegative;

import java.util.Scanner;

public class PorN {

	public static void main(String[] args) {
		System.out.println("Enter the values");
		 Scanner sc=new Scanner(System.in);{
			int num=sc.nextInt();
			
			if(num>0) {
				System.out.println(num+" is positive");
			}
			else {
				System.out.println(num+" is negative");
	}
		 }

}
}