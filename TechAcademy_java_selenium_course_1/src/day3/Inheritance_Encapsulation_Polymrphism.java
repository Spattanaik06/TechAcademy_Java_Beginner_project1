package day3;

class Vehicle
{
	private String vehicleName;
	private String vehicleNumber;
	public Vehicle(String vehicleName, String vehicleNumber) {
		super();
		this.vehicleName = vehicleName;
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	
	@Override
	public String toString() {
		return "Vehicle [vehicleName=" + vehicleName + ", vehicleNumber=" + vehicleNumber + "]";
	}
	public void VehicleDetails()
	{
		System.out.println("Vehicle Name :"+vehicleName);
		System.out.println("vehicle Number :"+vehicleNumber);
	}
	public void start()
	{
		System.out.println("Now vehicle is on running Mode");
	}
}
class Car extends Vehicle
{
	private String carName;

	public Car(String vehicleName, String vehicleNumber, String carName) {
		super(vehicleName, vehicleNumber);
		this.carName = carName;
	}
	

	public String getCarName() {
		return carName;
	}


	public void setCarName(String carName) {
		this.carName = carName;
	}


	@Override
	public String toString() {
		return super.toString()+"Car [carName=" + carName + "]";
	}

	@Override
	public void start() 
	{
		System.out.println("Car is on running Mode");
	}
	
	
	
}
public class Inheritance_Encapsulation_Polymrphism {

	public static void main(String[] args) 
	{
		Car car=new Car("Car","KA081234" , "Kia");
		car.start();
		car.VehicleDetails();
		
		car.setCarName("Altos");
		car.setVehicleName("four wheeler");
		
		System.out.println(car);
		
		
		
		Vehicle v=new Car("Car","KA085674" , "Mercedez");
		v.start();
		v.VehicleDetails();
		
		System.out.println(v);

	}

}
