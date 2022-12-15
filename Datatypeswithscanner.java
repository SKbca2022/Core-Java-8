package TernaryOperator;
import java.util.Scanner;
public class Datatypeswithscanner {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try (Scanner san=new Scanner(System.in)){
        int intval;
  		short sval;
  		char cval;
  		double dval;                           // declare datatypes
  		long lval;
  		float fval;
  		byte bval;
  		boolean boolval;
  		System.out.println("Enter the Integer value");
  		intval=san.nextInt();
  		System.out.println("Enter the short value");
  		sval=san.nextShort();
  		System.out.println("Enter the character value");
  		cval=san.next().charAt(0);
  		System.out.println("Enter the Double value");
  		dval=san.nextDouble();
  		System.out.println("Enter the Long value");
  		lval=san.nextLong();
  		System.out.println("Enter the Float value");
  		fval=san.nextFloat();
  		System.out.println("Enter the Byte value");
  		bval=san.nextByte();
  		System.out.println("Enter the Boolean value(true/false)");
  		boolval=san.nextBoolean();
  		//display
  		System.out.println("Integer value="+intval);
  		System.out.println("Short value="+sval);
  		System.out.println("character value="+cval);
  		System.out.println("Double value="+dval);
  		System.out.println("Long value="+lval);
  		System.out.println("Float value="+fval);
  		System.out.println("Byte value="+bval);
  		System.out.println("Boolean value="+boolval);
      
      }
	}
}
