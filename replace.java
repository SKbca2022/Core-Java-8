package com.edu;

public class replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
          String s="I love nivedha";
          String st="I love nivedha";
          System.out.println("hi nivedha="+s.contains(st));
          System.out.println("position of (left to right)="+s.indexOf('e'));
          System.out.println("lastposition of (right to left)="+s.lastIndexOf('e'));
          
          System.out.println("Replace e with a "+s.replace('e','a'));
          System.out.println("Replace love with like "+s.replace("love","like"));
          
          //reverse,append
          StringBuffer sb=new StringBuffer(s);
          System.out.println(sb.reverse());
          System.out.println(sb.append("Pappu"));
          StringBuilder sb1=new StringBuilder(s);
          System.out.println(sb1.reverse());
          System.out.println(sb1.append("Santhosh"));
          
	}

}
