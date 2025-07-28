package day7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionInFileHandlingReadFile {

	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new FileReader("/Users/sureshpattanaik/Downloads/out.txt"));
		String line = br.readLine();
		
		while(line !=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		br.close();

	}

}
