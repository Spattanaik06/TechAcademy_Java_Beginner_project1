package day1;

import java.util.Scanner;

public class Bank_Minor_Project {
		
		private  int  balance=1000;
		

		public static void main(String[] args) 
		{
			
			Bank_Minor_Project bank=new Bank_Minor_Project();
			Scanner sc=new Scanner(System.in);
			while(true)
			{
				bank.displayMenu();
				System.out.println("Enter your choice");
				int i=sc.nextInt();
				
				switch(i)
				{
				case 1 :
				{
					bank.getBalance();
					break;
				}
				case 2 :
				{
					System.out.println("Enter the Amount you want to Deposit");
					int amount=sc.nextInt();
					bank.getDeposit(amount);
					break;
				}
				case 3 :
				{
					System.out.println("Enter the Amount you want to Withdraw");
					int amount=sc.nextInt();
					bank.getWithdraw(amount);
					break;
				}
				case 4 :
				{
					System.out.println("I hope You Enjoy Our Banking Server");
					System.exit(0);
				}
				}
			}
			
			

		}
		
		public void getBalance()
		{
			 System.out.println("Your Account Balance is :"+balance);
			
		}
		public void getDeposit(int amount)
		{
			if(amount<0)
			{
				System.out.println("Invalid Amount ! Amount should be in positive");
			}
			else
			{
				balance+=amount;
				System.out.println("Deposit Succesfull !!! Your total Balance  is :"+balance);	
			}
			
		}
		
		public void getWithdraw(int amount)
		{
			if(amount<0)
			{
				System.out.println("Invalid Amount ! Amount should be in positive");
			}
			else if(amount> balance)
			{
				System.out.println("Invalid Amount");
			}
			else
			{
				balance-=amount;
				System.out.println("Withdraw Succesfull !!! Your total Balance  is :"+balance);	
			}
		}
		
		
		public  void displayMenu()
		{
			System.out.println("\n------ATM Menu------");
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit Money");
			System.out.println("3.Withdraw Money");
			System.out.println("4.Exit");
		}

	}


