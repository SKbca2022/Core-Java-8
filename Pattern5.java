package com.san;

import java.util.Scanner;
public class Pattern5 {
	public static void main(String[] args) {
		int r,r1,r2;
	System.out.println("Enter number of rows");
	Scanner in=new Scanner(System.in);
	r=in.nextInt();
	r1=in.nextInt();
	r2=in.nextInt();
	System.out.println("****** The Patterns are *****");
	for(int i=1;i<=r;i++) {
		for(int b=1;b<=r-i;b++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
		System.out.print(i+" ");
		}
		System.out.println();
	    }
	for(int i=1;i<=r1;i++) {
		for(int b=1;b<=r1-i;b++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
		System.out.print(i+" ");
		}
		System.out.println();
	    }
	for(int i=1;i<=r2;i++) {
		for(int b=1;b<=r2-i;b++) {
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++) {
		System.out.print(i+" ");
		}
		System.out.println();
	    }
	}
}
