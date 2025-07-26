package day5;


interface AB
{
	default void a()
	{
		System.out.println("Interface A");
	}
}
interface BA
{
	
	default void a()
	{
		System.out.println("Interface B");
	}
	
}

class Operation implements AB,BA
{

	@Override
	public void a() {
		AB.super.a();
		System.out.println("implementation of A");
	}

}

public class MultiInterfaceWithDefaultmethods {

	public static void main(String[] args) 
	{
		Operation op1= new Operation();
		
		op1.a();
	}

}
