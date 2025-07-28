package day7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionInFileHandlingWritefile {

	public static void main(String[] args) throws IOException
	{
		File file=new File("/Users/sureshpattanaik/Downloads/out.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter(file));
		bw.write("Suresh Pattanaik");
		bw.newLine();
		bw.write("Java Full Stack Developer");
		bw.close();
		//System.out.println("finally reached");
	}

}
