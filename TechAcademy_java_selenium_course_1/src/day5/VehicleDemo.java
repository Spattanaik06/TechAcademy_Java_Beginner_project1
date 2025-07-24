package day5;

abstract class Vehicle
{
	abstract void brand();
	abstract void speed();
}
class Car extends Vehicle
{

	@Override
	void brand() {
		System.out.println("Car is from KIA");
		
	}

	@Override
	void speed() {
		System.out.println("Speed of this car is 100 km/hr");
		
	}
	
}
class Bike extends Vehicle
{

	@Override
	void brand() {
		System.out.println("This Bike is from Yamaha");
		
	}

	@Override
	void speed() {
		System.out.println("Speed of this bike is 140 km/hr");
		
	}
	
}

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle car=new Car();
		car.brand();
		car.speed();
		
		System.out.println();
		
		Vehicle bike=new Bike();
		bike.brand();
		bike.speed();

	}

}
