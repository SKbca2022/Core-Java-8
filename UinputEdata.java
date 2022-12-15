package com.san;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Data{
	int eid;
	String ename;
	float esalary;
void inputData(){
	System.out.println("enter employee id");
	Scanner in=new Scanner(System.in);
	eid=in.nextInt();
	System.out.println("enter employee name");
	ename=in.next();
	System.out.println("enter employee salary");
    esalary=in.nextFloat();
    
}
@Override
public String toString() {
	return "Data [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
}
}
public class UinputEdata {

	public static void main(String[] args) {
	LinkedList<Data>elist=new LinkedList<Data>();
	Data e1=new Data();
	Data e2=new Data();
	Data e3=new Data();
	e1.inputData();
	e2.inputData();
	e3.inputData();
	
	elist.add(e1);
	elist.add(e2);
	elist.add(e3);
	
	System.out.println(elist);
	//System.out.println("**********************");
	
	Iterator<Data>it=elist.iterator();
	System.out.println("Eid\tEname\t\tEsalary");
	while(it.hasNext()) {
		Data eob=it.next();
		System.out.println(eob.eid+"\t"+eob.ename+"\t"+eob.esalary);
	}	
	}
	}

//}
