package com.san;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		System.out.println("Enter the numbers");
	int i=1,j=1,n;
	Scanner in=new Scanner(System.in);
	n=in.nextInt();
	System.out.println("****** The Patterns are *****");
	while(i<=n) {
		while(j<=i) {
			System.out.print(j+" ");
			j++;
		}
		System.out.println();
		i++;
		j=1;
	    }
	}

}
