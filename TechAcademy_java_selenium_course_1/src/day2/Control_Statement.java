package day2;

public class Control_Statement {

	public static void main(String[] args) 
	{
		System.out.println("Largest Will be :"+largestBetweenThreeNumbers(43,35,46));
		//dayName(2);
		System.out.println("Your Day : "+dayName(3));
		printNumbers();
		printNumberInWhileLoop();
		printNumInDoWhile();
		breakExample(3,5);
		System.out.println("Number is Prime or Not :"+isPrime(7));
		
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
			return c;	
		}
//4. Switch Case for Day Name
		public static String dayName(int n)
		{
//			switch(n)
//			{
//			case 1:
//				System.out.println("Sunday");
//				break;
//			case 2 :
//				System.out.println("Monday");
//				break;
//			case 3:
//				System.out.println("Tuesday");
//				break;
//			case 4 :
//				System.out.println("Wednesday");
//				break;
//			case 5 :
//				System.out.println("Thursday");
//				break;
//			case 6 :
//				System.out.println("Friday");
//				break;
//			case 7:
//				System.out.println("Saturday");
//				break;
//			default :
//				System.out.println("Invalid Number");
//			}
			
			
			switch(n)
			{
			case 1 : return "Sunday";
			case 2 : return "Monday";
			case 3 : return "Tuesday";
			case 4 : return "Wednesday";
			case 5 : return "Thursday";
			case 6 : return "Friday";
			case 7 : return "Saturday";
			default : return "invalid Day";
			
			}
		}
		
//5. Print Numbers from 1 to 5 (for loop)
		
		public static void printNumbers()
		{
			for(int i=1;i<=5;i++)
			{
				System.out.print(i+" ");
			}
			System.out.println("");
		}
		
//6. Print Numbers from 1 to 5 (while loop)
		public static void printNumberInWhileLoop()
		{
			int n=1;
			while(n<=5)
			{
				System.out.print(n+ " ");
				n++;
			}
			System.out.println("");
		}
//7. Print Numbers from 1 to 5 (do-while loop)
		
		public static void printNumInDoWhile()
		{
			int i=1;
			do
			{
				System.out.print(i+" ");
				i++;
			}
			while(i<=5);
			System.out.println(" ");
		}
		
//8. Break Statement Example
		public static void breakExample(int m,int n)
		{
			for(int i=0;i<n;i++)
			{
				System.out.print(i+" ");
				if(i==m)
				{
					System.out.println("Reached The Point");
					break;
				}
			}
		}
//9. Continue Statement Example
		
		
//10. Check Prime Number using for loop and if
		
		public static boolean isPrime(int n)
		{
			if(n<=1) return false;
			
			for(int i=2;i<n/2;i++)
			{
				if(n%i==0) return false;
			}
			return true;
		}
		

}
