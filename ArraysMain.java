package WhileAnddowhile;

 //Program to find sum and average of array elements

import java.util.Scanner;

public class ArraysMain {

	public static void main(String[] args) {
		int ar[]=new int[5]; //store 5 elements of type int
		//int i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter 5 array elements");
		//input
		System.out.println("Array size="+ar.length); //5
		for(int i=0;i<ar.length;i++) { //0 to 4 ,ar.length=5
			ar[i]=in.nextInt(); //ar[0]=9  ar[1]=8 ar[2]=4 ar[3]=1 ar[4]=9
			//i=sc.next();
		}
		
		//display or output
		System.out.println("Array Elements are");
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		
		//find sum of all array elements
		int s=0;
		for(int i=0;i<ar.length;i++) {
			s=s+ar[i];//4+5+9+7+8
			//…
//find maximum of all array elements
		
		//4 5 9 7 8
		int max=ar[0]; //max=4
		
		for(int i2=1;i<ar.length;i2++) {
			if(ar[i2]>max) {  //5>4   9>5  7>9  8>9
				max=ar[i2];  //max=5  max=9
			}
		}
		
		System.out.println("Largest of all array elements="+max);
		
	  //find minimum of all array elements
      int min=ar[0]; //max=4
		
		for(int i1=1;i1<ar.length;i1++) {
			if(ar[i1]<min) {  //5>4   9>5  7>9  8>9
				min=ar[i1];  //max=5  max=9
			}
		}
		
		System.out.println("minimum of all array elements="+min);
		
	}
	}
}