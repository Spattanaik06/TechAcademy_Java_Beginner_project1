package day5;

public interface Calculation 
{
	double operation(double a,double b);
	default void   mul() 
	{
		System.out.println("Multiplication started....");
	}
	static  void op()
	{
		System.out.println("Operation started");
		
	}
	
	void operate(int a,int b);
	
	void operation1(final int a);
}
