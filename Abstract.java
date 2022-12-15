package levels;
abstract class Bank{
	   abstract void rateOfInterest();
	   void display(){
	        System.out.println("Non abstract method");
	   }
	}

	class SBIBank extends Bank{ //rate interest 8%
	
		void rateOfInterest(){
	           System.out.println("SBI rate of interest 8%");
	     }
	}
	
	class IDBC extends Bank//rateof interest 9
	{
	     void rateOfInterest(){
	           System.out.println("IDBC rate of interest 9%");
	     }
	}

public class Abstract {

	public static void main(String[] args) {
		SBIBank ob=new SBIBank();
		ob.display();
		ob.rateOfInterest();
		IDBC ob1=new IDBC();
		ob1.display();
		ob1.rateOfInterest();
		
		//for abstract OBJECT CREATION NOT POSSIBLE
		//Bank bob=new Bank();//Error ,Cannot instantiate the type Bank

	}

}