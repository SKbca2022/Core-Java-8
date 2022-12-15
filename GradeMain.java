//Marks and grades
//using else if ladder
package Positiveornegative;

import java.util.Scanner;

class Grade{
	int Marks;
	void inputData() {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the Maks");
	Marks=in.nextInt();
	}
	void displayGrade() {
		if(Marks>=90 && Marks<=100) {
			System.out.println("Grade A");
		}
		else if(Marks>=70 && Marks<=89) {
				System.out.println("Grade B");
			}
		else if(Marks>=40 && Marks<=69) {
				System.out.println("Grade C");
				}
		else if(Marks>=0 && Marks<=39) {
					System.out.println("Grade D");
		}
	}
}
public class GradeMain {

	public static void main(String[] args) {
		Grade ob=new Grade();
		ob.inputData();
		ob.displayGrade();
		
	}

}
