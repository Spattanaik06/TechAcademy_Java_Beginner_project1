package day5;

public class ElectricityBill implements HouseHoldSystem
{
	double electricityBill;
	

	public ElectricityBill(double electricityBill) {
		super();
		this.electricityBill = electricityBill;
	}


	@Override
	public void totalPayment() 
	{
		System.out.println("Electricity Bill for HouseHold Items are :"+electricityBill);
		
	}

}
