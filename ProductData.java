package com.san;

import java.util.ArrayList;
import java.util.Iterator;

class Stocks{
	String pname;
	int pprice;
	float pquantity;
	public Stocks(String pname, int pprice, float pquantity) {
		super();
		this.pname = pname;
		this.pprice = pprice;
		this.pquantity = pquantity;
	}
	@Override
	public String toString() {
		return "Stocks [pname=" + pname + ", pprice=" + pprice + ", pquantity=" + pquantity + "]";
	}
}
public class ProductData {

	public static void main(String[] args) {
		ArrayList<Stocks>plist=new ArrayList<Stocks>();
		Stocks e1=new Stocks("biscuits  ",20,100.0f);
		Stocks e2=new Stocks("Chocolates",50,50.0f);
		Stocks e3=new Stocks("nuts      ",200,150.0f);
		
		plist.add(e1);
		plist.add(e2);
	    plist.add(e3);
	    
	    System.out.println(plist);
	    System.out.println("**************************");
	    
	    Iterator<Stocks>it=plist.iterator();
	    System.out.println("PrName\t\tPPrice\tPWeight");
		while(it.hasNext()) {
			Stocks pob=it.next();
			System.out.println(pob.pname+"\t"+pob.pprice+"\t"+pob.pquantity);
	    
	}
	}
}
