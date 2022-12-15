package com.san;

import java.util.Scanner;

class Calculator {
 float ans;
 void add(float n1,float n2) {
	 ans=n1+n2;
	   System.out.println("sum of "+n1+" and "+n2+" is "+ans);
 }
 void sub(float n1,float n2) {
	 ans=n1-n2;
      System.out.println("Difference of "+n1+" and "+n2+" is "+ans);
 }
 void mult(float n1,float n2) {
	 ans=n1*n2;
     System.out.println("Product of "+n1+" and "+n2+" is "+ans);
 }
 void div(float n1,float n2) {
        if(n2!=0) {
 	    ans=n1/n2;
     	   System.out.println("quotient of "+n1+" and "+n2+" is "+ans);
        }
        else {
     	   System.out.println("Divided by Zero error");
        }
 }
 
 
 public class calculator {
	 
	public static void main(String[] args) {
		System.out.println("************Main ***********");
		System.out.println("Addition");
		System.out.println("Subtraction");
		System.out.println("Multiplication");
		System.out.println("Division");
		int a;
		Calculator ob=new Calculator();
		float n1,n2,ans;
		Scanner scanner=new Scanner(System.in);
	    a=scanner.nextInt();
	    System.out.println("Enter 2 numbers");
	    n1=scanner.nextFloat();
	    n2=scanner.nextFloat();
	    switch(a) {
	    case 1:
	    	   ob.add(n1,n2);
	           break;
	    case 2:
	    	   ob.sub(n1,n2);
	           break;
	    case 3:
	    	   ob.mult(n1,n2);    	
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
}