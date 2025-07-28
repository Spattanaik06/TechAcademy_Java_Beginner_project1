package day6;

interface A
{
	void a();
}
interface B
{
	
	void a();
	
}

class Op implements A,B
{

	@Override
	public void a() {
		
		System.out.println(" It is op class..");
	}

}


public class MultiInterfaceWithAbstractMethods {

	public static void main(String[] args) {
		
		Op op=new Op();
		op.a();
	}

}
