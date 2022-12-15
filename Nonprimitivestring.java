package com.edu;

public class Nonprimitivestring {

	public static void main(String[] args) {
		String name1="Santhosh";
		String name2="Kumar";
		//No of characters
		int l=name1.length();
		System.out.println("No of characters="+l);

		System.out.println("2nd characters="+name1.charAt(1));
		System.out.println("last characters="+name1.charAt(7));
		String fname=name1+" "+name2;
		System.out.println("full name="+fname);
		String fn=name1.concat(name2);
		System.out.println("full name using concat function="+fn);
		
		System.out.println("Iowercase="+name1+" "+name2.toLowerCase());
		System.out.println("Uppercase="+name1+" "+name2.toUpperCase());
		
		//substring
		//name=Santhosh
		//     01234567
		System.out.println("substring(2,6)"+name1.substring(2,6));
		System.out.println("substring(0,8)"+name1.substring(0,8));
	}

}
