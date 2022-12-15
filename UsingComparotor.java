package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Employee{
	int eid;
	String ename;
	int eage;
	public Employee(int eid, String ename, int eage) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eage = eage;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", eage=" + eage + "]";
	}
	
	
}
//sorting user defined datatype
class SortAge implements Comparator<Employee>{

	@Override
	public int compare(Employee eob1, Employee eob2) {
		if (eob1.eage<eob2.eage)
			return -1;
		else if (eob1.eage>eob2.eage)
				return 1;
		else
			return 0;
		
	}
	
}
public class UsingComparotor {

	public static void main(String[] args) {
ArrayList<Employee>elst=new ArrayList<Employee>();
		
		Employee e1=new Employee(1, "Zeeba", 22);
		Employee e2=new Employee(2, "Poovi", 25);
		Employee e3=new Employee(6, "kiran", 21);
		Employee e4=new Employee(5, "harin",20);
		
		elst.add(e1);
		elst.add(e2);
		elst.add(e3);
		elst.add(e4);
		
		System.out.println(elst);
		
		SortAge eage=new SortAge();
		Collections.sort(elst,eage);
		
		System.out.println("After sort");
		
		System.out.println(elst);
		
		//name sorting
		class SortName implements Comparator<Employee>{

			@Override
			public int compare(Employee eob1, Employee eob2) {
				return eob1.ename.compareTo(eob2.ename);
				
			}
			
		}
		
		//Based on name sorting
				SortName nsort=new SortName();
				Collections.sort(elst,nsort);
				
				System.out.println("Sorting based on name");
				

				Iterator<Employee> it1=elst.iterator();
				
				while(it1.hasNext()) {
					Employee eobj=it1.next();
					
					System.out.println(eobj.eid+"\t"+eobj.ename+"\t"+eobj.eage);
				}
	}

}
     

	