package functions;

class Addition{
     void add(int i,int j) {
    	 int s;
    	 s=i+j;
    	 System.out.println("sum of 2 int values "+i+" and "+j+" is "+s);
     }
     void add(float i,float j) {
    	 float s;
    	 s=i+j;
    	 System.out.println("sum of 2 int values "+i+" and "+j+" is "+s);
     }
     void add(double i,double j) {
    	 double s;
    	 s=i+j;
    	 System.out.println("sum of 2 int values "+i+" and "+j+" is "+s);
     }
     void add(byte i,byte j) {
    	 int s=0;
    	 s=(byte)(i+j);
    	 System.out.println("sum of 2 int values "+i+" and "+j+" is "+s);
     }
     void add(long i,long j) {
    	 long s;
    	 s=i+j;
    	 System.out.println("sum of 2 int values "+i+" and "+j+" is "+s);
     }
     void add(short i,short j) {
    	 short s=0;
    	 s=(short)(i+j);
    	 System.out.println("sum of 2 int values "+i+" and "+j+" is "+s);
     }
}
public class AddMain {

	public static void main(String[] args) {
		
           Addition ob=new Addition();
           ob.add(4, 7);
           ob.add(76.4f,65.6f);
           ob.add(76.4,54.3);
           ob.add(3,2);
           ob.add(234555l,35687l);
           ob.add(56,65);
	}

}
