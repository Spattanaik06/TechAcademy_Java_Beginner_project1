package day8;

class Multithread1 extends Thread
{

	@Override
	public void run() {
		
		super.run();
		
		String s1=Multithread1.currentThread().getName();
		
		for(int i=0;i<10;i++)
		{
			System.out.println(s1+" :" +i);
		}
	}
	
}

class Multithread2 implements Runnable
{

	@Override
	public void run() 
	{
		
		System.out.println("Implementing By Runnable...");
		
	}
	
}


public class MultithreadingDemo {

	public static void main(String[] args) 
	{
		
		Multithread1 t1=new Multithread1();
		t1.start();
		t1.setName("1st Thread");
		Multithread1 t2=new Multithread1();
		t2.start();
		t2.setName("2nd Thread");
		Thread t3=new Thread(new Multithread2());
		t3.start();
		

	}

}
