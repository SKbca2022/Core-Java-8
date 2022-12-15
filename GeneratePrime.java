package WhileAnddowhile;

import java.util.Scanner;

public class GeneratePrime {

	public static void main(String[] args) {
		int c=0,tr;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		tr=in.nextInt();
		for(int num=1;num<=tr;num++) {
			c=0;
			for(int j=1;j<=num;j++) {
			if(num%j==0) {
					c=c+1;
					}			
			}
			if(c==2) {
				System.out.println(num+" ");
		}
	}
	}
}