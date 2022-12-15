package WhileAnddowhile;

import java.util.Scanner;

public class Pateerns {
	public static void main(String[] args) {
		int r,r1,r2;
		System.out.println("Enter number of rows");
		Scanner in=new Scanner(System.in);
        r=in.nextInt();
        r1=in.nextInt();
        r2=in.nextInt();
		for(int i=1;i<=r;i++) 
		{
			for(int j=1;j<=i;j++) {
			System.out.print(i+" ");
			}
            System.out.println();
		}
	    for(int i=1;i<=r1;i++) 
		{
			for(int j=1;j<=i;j++) {
			System.out.print(i+" ");
			}
            System.out.println();
		}
	    for(int i=1;i<=r2 ;i++) 
		{
			for(int j=1;j<=i;j++) {
			System.out.print(i+" ");
			}
            System.out.println();
		}
}
}
