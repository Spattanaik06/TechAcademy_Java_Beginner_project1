package day9;

public class WrapperDemo {

	public static void main(String[] args) 
	{
		int a=12;
		Integer valueOf = Integer.valueOf(a);
		System.out.println(valueOf);
		String s="55";
		Integer valueOf2 = Integer.valueOf(s);
		System.out.println(valueOf2);
		int int1 = Integer.parseInt(s);
		System.out.println(int1);
		
		double double1 = Double.parseDouble(s);
		System.out.println(double1);
		
		
		

	}

}
