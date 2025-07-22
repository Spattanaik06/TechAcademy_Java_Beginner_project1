package day2;

public class Control_Statement {

	public static void main(String[] args) 
	{
		System.out.println(" Largest Will be :"+largestBetweenThreeNumbers(43,35,46));
	}
//1. Check if a Number is Even or Odd (if-else)
		
		public static  void isEven(int n)
		{
			if(n%2==0)
			{
				System.out.println("Even");
			}
			else	
			{
				System.out.println("odd");
			}
		}
		
//2. Check Voting Eligibility using if-else
		
		public static boolean  isEligible(int age)
		{
			if(age<18)
			{
				return false;
			}
			else
			{
				return true;
			}
		}
//3. Find the Largest of Three Numbers (if-else-if)
		
		public static int largestBetweenThreeNumbers(int a,int b,int c)
		{
			if(a>b &&b>c) return a;
			else if(b>c) return b;
			else return c;	
		}
//4. Switch Case for Day Name
		public static String dayName(int n)
		{
			return null;
		}
		
//5. Print Numbers from 1 to 5 (for loop)
//6. Print Numbers from 1 to 5 (while loop)
//7. Print Numbers from 1 to 5 (do-while loop)
//8. Break Statement Example
//9. Continue Statement Example
//10. Check Prime Number using for loop and if

	

}
