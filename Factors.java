package WhileAnddowhile;

import java.util.Scanner;

public class Factors {
public static void main(String[] args) {
	int num;
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter number");
	num=scanner.nextInt();
	for(int i=1;i<num;i++) {
		if(num%i==0) {
			System.out.println(i);
		}
	}
}
}
