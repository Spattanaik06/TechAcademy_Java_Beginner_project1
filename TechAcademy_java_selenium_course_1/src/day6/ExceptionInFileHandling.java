package day6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionInFileHandling {

	public static void main(String[] args) 
	{
		try {
			var obj=new FileInputStream("");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
