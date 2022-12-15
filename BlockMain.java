package functions;

public class BlockMain {
        static{
        	System.out.println("Static block will execute before the main ");
        }
        {
          	System.out.println("Annonymous block will execute before constructor call ");
        }
        BlockMain(){
          	System.out.println("constructor block will execute on object creation ");
        }
        void display() {
        	System.out.println("display method");
        }
	public static void main(String[] args) {
	  	System.out.println("main method ");
	    BlockMain ob=new BlockMain();
	    ob.display();
	}

}
