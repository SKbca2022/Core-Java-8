package com.san;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		System.out.println("************Main ***********");
		System.out.println("Addition");
		System.out.println("Subtraction");
		System.out.println("Multiplication");
		System.out.println("Division");
		int a;
		float n1,n2,ans;
		Scanner in=new Scanner(System.in);
	    a=in.nextInt();
	    System.out.println("Enter 2 numbers");
	    n1=in.nextFloat();
	    n2=in.nextFloat();
	    switch(a) {
	    case 1:ans=n1+n2;
	    	   System.out.println("sum of "+n1+" and "+n2+" is "+ans);
	           break;
	    case 2:ans=n1-n2;
 	           System.out.println("Difference of "+n1+" and "+n2+" is "+ans);
	           break;
	    case 3:ans=n1*n2;
               System.out.println("Product of "+n1+" and "+n2+" is "+ans);
               break;
	    case 4:if(n2!=0) {
	    	    ans=n1/n2;
	        	   System.out.println("quotient of "+n1+" and "+n2+" is "+ans);
	           }
	           else {
	        	   System.out.println("Divided by Zero error");
	           }
	          break;
	          default:System.out.println("invalid input");
	    }
	  }
	}
