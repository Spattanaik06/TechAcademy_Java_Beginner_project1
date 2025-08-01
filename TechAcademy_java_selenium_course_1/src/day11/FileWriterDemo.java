package day11;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("/Users/sureshpattanaik/Downloads/outputFile.txt");
		FileWriter file=new FileWriter(f);
		file.write("Suresh Pattanaik");
		System.out.println("Done");
		file.close();

	}

}
