package WhileAnddowhile;
import java.util.Scanner;

class Reverse{
	int num,rev,t;
	void inputNum() {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number");
		num=in.nextInt();
		t=num;
	}
    void reverseNumber() {
	int d;
    rev=0;
	while(num>0) {
		d=num%10;
		rev=rev*10+d;
		num=num/10;
	}
	System.out.println("Reversed num is="+rev);
}
    void checkPallandrome(){
    	if(t==rev) {
    		System.out.println(t+"is palladrome");
    	}
    	else {
    		System.out.println(t+"is not pallandrome");
    	}
    }
public class reverse {

	public static void main(String[] args) {
		Reverse ob=new Reverse();
		ob.inputNum();
		ob.reverseNumber();
		ob.checkPallandrome();
	}
	}	
}


