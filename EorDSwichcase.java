package com.san;

import java.util.Scanner;

public class EorDSwichcase {

	public static void main(String[] args) {
		int num;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number");
	    num=in.nextInt();
	    int s=num%2;
	    switch(s) {
	    case 0:System.out.println(num+"is a even number");
	           break;
	    case 1:System.out.println(num+"is a odd number");
	           break;

	}
	}
}
