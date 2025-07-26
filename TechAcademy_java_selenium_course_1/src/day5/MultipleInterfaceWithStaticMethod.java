package day5;
interface Group1
{
	static void staticMethod()
	{
		System.out.println("static method of Interface A");
	}
	default void defaultMethod()
	{
		System.out.println("Interface B");
	}
}
interface Group2
{
	static void staticMethod()
	{
		System.out.println("static method of Interface B");
	}
	
	default void defaultMethod()
	{
		System.out.println("Interface B");
	}
	
}

class ClassImpl implements Group1,Group2
{

	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		Group1.super.defaultMethod();
	}

}
public class MultipleInterfaceWithStaticMethod 
{

	public static void main(String[] args) 
	{
		ClassImpl impl=new ClassImpl();
		impl.defaultMethod();
		Group1.staticMethod();
		Group2.staticMethod();

	}

}
