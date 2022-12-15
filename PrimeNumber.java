package WhileAnddowhile;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int num=6;
		int c=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number");
		num=scanner.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				System.out.println(i);
				c=c+1;
			}
		}	
		if(c==2) {
			System.out.println(num+"is a prime number");
		}
		else
			System.out.println(num+"is not a prime number");
		
	}

}
