package day6;

import java.util.Scanner;

public class ExceptionInArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		try(sc)
		{
			System.out.println("Enter the size of Array :");
			int n=sc.nextInt();
			
			int [] a=new int[n];
			
			System.out.println("Enter the Element of Array :");
			
			for(int i=0;i<n;i++)
			{
				 a[i]=sc.nextInt();
			}
			System.out.println(a[n]);
		}
		catch(Exception e)
		{
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
		

	}

}
