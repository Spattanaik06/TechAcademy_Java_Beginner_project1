package day5;

public class MainDemo {

	public static void main(String[] args) 
	{
		Calculation cl= new CalcImpl();
		//cl.mul();
		//System.out.println("Calculation 1 :"+cl.operation(12, 13));
		
		//cl.operation1(28);
		Calculation cl1=new CalculationImpl();
		
		//cl1.operate(23, 24);
		
		cl1.operation1(24);
		cl1.operation1(29);
		//System.out.println("Calculation 2"+cl1.operation(14,15));
		//cl1.mul();
		//System.out.println();
		//Calculation.op();
		
		
	}

}
