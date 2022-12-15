package WhileAnddowhile;

import java.util.Scanner;

class Bank{
	float amount;
	Bank(){  //contrutor: it has same name as class no return type
		amount=1000;
		System.out.println("Constructor is called");
	}
	
	void deposit(float damount ) {
		amount=amount+damount;
		System.out.println("After Deposit Bank Balance="+amount);
	}
	
	void withdraw(float wamount) {
		if(wamount>amount) {
			
			System.out.println("Insufficient balance");
		}
		else {
			amount=amount-wamount;
			System.out.println("After withdraw Bank Balance="+amount);
		}
	}

	public void displayAmount() {
		System.out.println("Bank Balance="+amount);
		
	}
}
public class Banking {

	public static void main(String[] args) {
		Bank ob=new Bank(); //calls the constructor
		
		int choice;
		while(true) {
		Scanner sc=new Scanner(System.in);
		System.out.println("***MyBank ATM****");
		System.out.println("1.Deposit amount");
		System.out.println("2.Withdraw amount");
		System.out.println("3.Display");
		System.out.println("4.Exit");
		
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:System.out.println("Enter amount to deposit");
		        float damt=sc.nextFloat();
		        ob.deposit(damt);
		        break;
		case 2:System.out.println("Enter amount to withdarw");
               float wamt=sc.nextFloat();
               ob.withdraw(wamt);
               break;
		case 3:System.out.println("My bank Balance");
               ob.displayAmount();
               break;
        
		case 4:
			System.out.println("Thank for Banking");
			System.exit(0);;
		}
		
		}
		
		
	}

}