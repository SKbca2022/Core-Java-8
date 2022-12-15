package com.san;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class FloatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<Float>lst=new ArrayList<Float>();
         float val;
         Scanner in=new Scanner(System.in);
         System.out.println("Enter the number of Elements");
         int n=in.nextInt();
         for(int i=0;i<n;i++) {
        	 System.out.println("Enter the float value");
        	 val=in.nextFloat();
        	 lst.add(val);
         }
         System.out.println(lst);
         
         //try with iteration
         /*Iterator<Float>it=lst.iterator();
         while(it.hasNext()) {
         System.out.println(it.next());*/
          
         
	}
	}
//}
