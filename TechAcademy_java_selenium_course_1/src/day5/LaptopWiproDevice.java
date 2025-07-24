package day5;

 class LaptopWiproDevice implements  WiproDeviceInterface
 {

	@Override
	public void device() {
		System.out.println("This Device is a Laptop device from Wipro");
		
	}

	@Override
	public void speed() {
		System.out.println("The Speed of the this device is slower than desktop");
		
	}

}
