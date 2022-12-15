package com.san;

import java.util.Iterator;
import java.util.LinkedList;

class Database{
	int eid;
	String ename;
	float esalary;
	public Database(int eid, String ename, float esalary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
	public String toString() {
		return "Database [eid=" + eid + ", ename=" + ename + ", esalary=" + esalary + "]";
	}
	
}


public class EmployeeData {

	public static void main(String[] args) {
	LinkedList<Database>elist=new LinkedList<Database>();
	Database e1=new Database(1,"santhosh",250000.0f);
	Database e2=new Database(2,"santhoshsk",250000.0f);
	Database e3=new Database(3,"sandiago",250000.0f);
	
	elist.add(e1);
	elist.add(e2);
	elist.add(e3);
	
	System.out.println(elist);
	System.out.println("**********************");
	
	Iterator<Database>it=elist.iterator();
	System.out.println("Eid\tEname\t\tEsalary");
	while(it.hasNext()) {
		Database eob=it.next();
		System.out.println(eob.eid+"\t"+eob.ename+"\t"+eob.esalary);
	}	

	}

}
