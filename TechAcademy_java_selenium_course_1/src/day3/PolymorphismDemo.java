package day3;
class Shape
{
	void draw()
	{
		System.out.println("Shape drawing...");
	}
}
class Circle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Circle drawing started...");
	}
}
class Rectangle extends Shape
{
	@Override
	void draw()
	{
		System.out.println("Rectangle drawing started...");
	}
}
public class PolymorphismDemo {

	public static void main(String[] args) {
		Shape s1=new Circle();
		Shape s2=new Rectangle();
		s1.draw();
		s2.draw();
		

	}

}
