package Positiveornegative;

import java.util.Scanner;

public class LargestOfTwo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter the first number");
		n1=sc.nextInt();
		System.out.println("Enter the Second number");
		n2=sc.nextInt();
		if(n1==n2) {
			System.out.println("Both numbers are equal");
		}
		else if(n1>n2) {
			System.out.println(n1+" is larger than "+n2);
		}
		else {
			System.out.println(n2+" is larger than "+n1);
		}
	}
}
