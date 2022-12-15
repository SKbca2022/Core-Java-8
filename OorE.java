package Positiveornegative;

import java.util.Scanner;

public class OorE {

	public static void main(String[] args) {
		System.out.println("Enter the values");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		if(num==0) {
			System.out.println(num+"is zero");
		}
		else if(num%2==0) {
			System.out.println(num+"it is even number");
		}
		else {
			System.out.println(num+"it is odd number");
		}
	}

}
