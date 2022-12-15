package collections;

import java.io.FileInputStream;

public class FileReading {

	public static void main(String[] args) {
	try {
		FileInputStream fin=new FileInputStream("sandy.txt");
		int i=0;
		while((i=fin.read())!=-1){
		System.out.println((char)i);
		}
		fin.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}

}
