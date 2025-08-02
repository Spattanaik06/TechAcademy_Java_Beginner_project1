package day12;

import java.util.Scanner;


public class UserAuthenticationDemo {

	public static void main(String[] args) 
	{
		boolean flag=false;
		while(!flag)
		{
			System.out.println("");
			System.out.println("1.User Registration");
			System.out.println("2.User Login");
			System.out.println("3.Exit");
			
			Scanner sc=new Scanner(System.in);
			UserRegistration userReg=new UserRegistration();
			int i=sc.nextInt();
			switch(i)
			{
				case 1 ->
				{
					System.out.println("Enter the  UserName");
					String userName=sc.next();
					System.out.println("Enter the Password you want");
					String pwd=sc.next();
					userReg.userReg(userName, pwd);
					
				}
				case 2 ->
				{
					System.out.println("Enter the  UserName");
					String userName=sc.next();
					System.out.println("Enter the Password you want");
					String pwd=sc.next();
					UserLogin userLog=new UserLogin(userReg.getuser());
					userLog.loginUser(userName, pwd);
				}
				case 3 ->
				{
					System.exit(0);
				}
				default -> 
				{
					System.out.println("Invalid Input");
				}
			
			}
		}
			
			

	}

}
