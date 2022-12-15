package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypeOfSets {

	public static void main(String[] args) {
	System.out.println("Hashset");
	HashSet<Integer> hob= new HashSet<Integer>();
	hob.add(null);//no duplicate values taken
	hob.add(45);//insertion order is not maintained
	hob.add(55);//adds null value
	hob.add(55);
	hob.add(75);
	System.out.println(hob+"\n");
	
	System.out.println("In HashSet After using Iterator");
	
	Iterator<Integer>it=hob.iterator();
	while(it.hasNext()) {
		System.out.println(it.next()+"\n");
	}
	
	
	System.out.println("LinkedHashset");
	LinkedHashSet<Integer> lob=new LinkedHashSet<Integer>();
	lob.add(null);//no duplicate values taken
	lob.add(45);//insertion order is maintained
	lob.add(55);//adds null value
	lob.add(55);
	lob.add(75);
	System.out.println(lob+"\n");
	
	System.out.println("In LinkedHashSet After using Iterator");
	
	Iterator<Integer>te=lob.iterator();
	while(te.hasNext()) {
		System.out.println(te.next()+"\n");
	}

	System.out.println("Treeset");
    TreeSet<Integer> tob=new TreeSet<Integer>();
	tob.add(85);//no duplicate values taken
	tob.add(45);//insertion order is maintained
	tob.add(55);//didn't take null value
	tob.add(55);
	tob.add(75);
	System.out.println(tob+"\n");

	System.out.println("In TreeSet After using Iterator");
	
	Iterator<Integer>tr=tob.iterator();
	while(tr.hasNext()) {
		System.out.println(tr.next()+"\n");
	}
	}

}
