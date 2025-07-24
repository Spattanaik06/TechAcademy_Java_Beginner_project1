package day5;

public class HouseHoldSystemDemo {

	public static void main(String[] args) 
	{
		HouseHoldSystem hs=new ElectricityBill(2347);
		hs.totalPayment();
		HouseHoldSystem gs=new GroceryItem(5638);
		gs.totalPayment();

	}

}
