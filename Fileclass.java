package collections;

import java.io.File;
import java.io.IOException;

public class Fileclass {

	public static void main(String[] args) throws IOException{
	System.out.println("Creating a file");
	File myfile=new File("sandy.txt");
	
	if(myfile.createNewFile()) {
		System.out.println("File is created");
	}
	else {
		System.out.println("File already exists");
	}
	

	}

}
