package collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Merging {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Creating a file");
		File myfile=new File("santhosh.txt");
		
		if(myfile.createNewFile()) {
			System.out.println("File is created");
		}
		else {
			System.out.println("File already exists");
		}
		
		try {
			FileInputStream fin=new FileInputStream("santhosh.txt");
			int i=0;
			while((i=fin.read())!=-1){
			System.out.println((char)i);
			}
			fin.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		FileOutputStream fos=null;
		try {
			fos=new FileOutputStream("santhosh.txt");
			fos.write(83);
			fos.write(65);
			fos.write(78);
			fos.write(68);
			fos.write(89);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		fos.close();

	}

}
