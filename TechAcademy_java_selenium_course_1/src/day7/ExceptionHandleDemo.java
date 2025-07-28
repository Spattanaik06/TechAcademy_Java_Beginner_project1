package day7;

import java.util.Scanner;

public class ExceptionHandleDemo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st Integer");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd Integer");
		int b=sc.nextInt();
		try
		{
			int c=a/b;
			System.out.println("Result will be : "+c);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			sc.close();
			System.out.println("Now we are reached the finally block");
		}
		
		

	}

}
