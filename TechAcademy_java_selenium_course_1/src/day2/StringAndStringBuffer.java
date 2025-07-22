package day2;

public class StringAndStringBuffer {

	public static void main(String[] args) 
	{
		String s="Suresh";
		System.out.println("Count Vowel :"+countVowel(s));
		System.out.println("Reverse String is :"+reverseString(s));
		System.out.println("is Palindrome or not "+checkPallindrome(s));
		String s1="Suresh Pattanaik";
		System.out.println("After Replacement :" +replaceSpace(s));
		System.out.println("Text to String : "+textToString(s));
		System.out.println("Long String : "+longString(s));
		checkMutabilityString("Suresh");

	}
	
	// 1. Count the Number of Vowels in a String (String)
	
	public static int countVowel(String s)
	{
		String vowel="aeiouAEIOU";
		
			int length=s.replaceAll(vowel,"").length();
			return s.length()-length;
			
	}
	// 2. Reverse a String using StringBuffer
	
	public static String reverseString(String s)
	{
		StringBuffer sb=new StringBuffer(s);
		sb.reverse();
		return sb.toString();
	}
	// 3. Check if a String is a Palindrome using StringBuilder
	
	public static boolean checkPallindrome(String s)
	{
		String reverseString=new StringBuilder(s).reverse().toString();
		return s.equals(reverseString);
	}
	// 4.Replace All Spaces with Hyphens using String
	
	public static String replaceSpace(String s)
	{
		return s.replaceAll(" ", "-");
	}
	// 5.Insert Text into a String using StringBuffer
	
	public static String textToString(String s)
	{
		return new StringBuilder(s).insert(s.length()+1, " Pattanaik").toString();
	}
	// 6. Efficiently Build a Long String using StringBuilder
	
	public static String longString(String s)
	{
		return new StringBuilder(s).append(" Pattanaik").toString();
	}
	// 7. Compare String, StringBuffer, and StringBuilder Mutability
	
		public static void checkMutabilityString(String s)
		{
			s.concat("Pattanaik");
			System.out.println(s);
			StringBuffer append1 = new StringBuffer(s).append(" Pattanaik");
			System.out.println(append1);
			StringBuilder append2 = new StringBuilder(s).append(" Pattanaik");
			System.out.println(append2);
			
			
		}

}
