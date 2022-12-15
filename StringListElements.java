package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class StringListElements {

	public static void main(String[] args) {
		ArrayList<String> lst=new ArrayList<String>();
		lst.add("Kiran");
		lst.add("Ravi");
		lst.add("Manoj");
		lst.add("Swetha");
		
		System.out.println(lst);
		//using for loop
		for(String n:lst) {
			System.out.println(n);
		}
		
		Collections.sort(lst);
		//try with iterator
		Iterator<String>it=lst.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Collections.swap(lst, 1, 3);
		System.out.println(lst);
		
		Collections.shuffle(lst);
		System.out.println("First shuffle");
		System.out.println(lst);
		
		Collections.shuffle(lst);
		System.out.println("second shuffle");
		System.out.println(lst);
	}

}
