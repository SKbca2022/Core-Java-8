package mainfile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

class Student{
	int rollno;
	String name;
	String dept;
}
public class Serialization {

	public static void main(String[] args) throws IOException {
	FileOutputStream fo=new FileOutputStream("st.txt");
	PrintStream ps=new PrintStream(fo);
	Student sob=new Student();
	sob.rollno=111;
	sob.name="Kavi";
	sob.dept="Bca";
	ps.print(sob.rollno);
	ps.print(sob.name);
	ps.print(sob.dept);
	fo.close();
	ps.close();
	System.out.println("Student object is writen to the file");
	}

}
