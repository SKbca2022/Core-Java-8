package Positiveornegative;

import java.util.Scanner;

class Largest {
		int a,b,c;
		void inputData() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 3 Numbers:");
		a=in.nextInt();
		b=in.nextInt();
		c=in.nextInt();
		}
		void performLargest()
		{
		if(a>b && a>c)
		{
			System.out.println("The Largest of "+a+","+b+" and "+c+" is "+a);
	  }
		else if(b>a && b>c)
		{
			System.out.println("The Largest of "+a+","+b+" and "+c+" is "+b);
	   }
		else
		 {
			System.out.println("The Largest of "+a+","+b+" and "+c+" is "+c);
	        	}
		}
}

 public class LargestOfthree {
	 public static void main(String[] args) {
             Largest lob=new Largest();
             lob.inputData();
             lob.performLargest();
             
}	
}

