package day5;

public class CalcImpl implements Calculation
{

	@Override
	public double operation(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public void operate(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void operation1(int b) 
	{
		System.out.println(b);
		
	}

}

class Calculation1 implements Calculation
{
	@Override
	public void operation1(int b)
	{
		
	}

	@Override
	public double operation(double a, double b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void operate(int a, int b) {
		// TODO Auto-generated method stub
		
	}
}
