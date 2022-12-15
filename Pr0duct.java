package functions;
class Product{
	//variables are called fields or instances variables
	int pid;
	String pname;
	float pprice;
	Product(){
		pid=8;
		pname="Television";
		pprice=2000.4f;
	}
		Product(int i,String s,float p){
			pid=i;
			pname =s;
			pprice=p;
		}
	
		 void display() {
		   System.out.println("product id="+pid);
	        System.out.println("product name="+pname);
	        System.out.println("product price="+pprice);
	     
	}
}

public class Pr0duct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Product ob=new Product();
        System.out.println("product id="+ob.pid);
        System.out.println("product name="+ob.pname);
        System.out.println("product price="+ob.pprice);
        Product ob1=new Product(10,"Laptop",5400.5f);
        ob1.display();
     
	}

}
