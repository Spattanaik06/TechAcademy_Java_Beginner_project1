package day7;

import java.util.Scanner;

public class ExceptionInFactorial {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		try(sc)
		{
			
			System.out.println("Enter the Number :");
			int a=sc.nextInt();
			int res=1;
			if(a<0)
			{
				throw new NegetiveNumberException("Number can't be negetive...");
			}
			else
			{
				while(a>0)
				{
					res =res * a;
					a--;
					
				}
				System.out.println("Factorial will be :" + res);
			}
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
		}

	}

}
