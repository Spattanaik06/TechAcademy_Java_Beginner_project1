package day6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionInFilehandlingWriteCSV {

	public static void main(String[] args)  throws 	IOException
	{
		BufferedWriter bw=new BufferedWriter(new FileWriter(new File("/Users/sureshpattanaik/Downloads/csvFile.csv")));
		bw.write("Suresh");
		bw.newLine();
		bw.write("Pattanaik");
		
		bw.close();

	}

}
