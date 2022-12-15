package levels;

class ParentClass{
	  int i, j;
	   ParentClass(int i, int j){
		   System.out.println("Parent class constructor");
	     this.i=i;//this referes to present object
	     this.j=j;
	   }
	}

	class ChildClass extends ParentClass{ //Single inheritance
	     int s;
	     ChildClass(int i, int j){
	    	 super(i, j);
	    	 System.out.println("child constructor");
	    	
	     }
	     void add(){
	    	
	        s=i+j;
	         System.out.println("sum="+s);
	      }
	}

	public class MainClass2{
	     public static void main(String args[]){
	      ChildClass  ob=new ChildClass(8,9);
	      ob.add();
	     }
	}