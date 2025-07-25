package day5;

public class CalculationImpl  implements Calculation{



	@Override
	public void mul() {
		Calculation.super.mul();
	}

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
	public void operation1(int a) {
		
		System.out.println(a);
		
	}

	
	
	

}
