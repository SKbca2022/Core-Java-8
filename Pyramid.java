package TernaryOperator;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
       int r;
       System.out.println("Enter the number");
       Scanner in=new Scanner(System.in);
       r=in.nextInt();
       for(int i=1;i<=r;i++) {
    	   for(int b=1;b<=r-i;b++) {
    		   System.out.print(" ");
    	   }
    	   for(int j=1;j<=i;j++) {
    		   System.out.print("*");
    	   }
    	  System.out.println();
       }
	}
}
