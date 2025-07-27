package day6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionInFilehandlingReadCSV {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("/Users/sureshpattanaik/Downloads/csvFile.csv"));
		String line=br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}

	}

}
