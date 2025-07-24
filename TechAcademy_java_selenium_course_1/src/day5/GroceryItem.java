package day5;

public class GroceryItem implements HouseHoldSystem
{
	double groceryBill;
	

	public GroceryItem(double groceryBill) {
		super();
		this.groceryBill = groceryBill;
	}


	@Override
	public void totalPayment() 
	{
		
		System.out.println("Grocery Item for HouseHold Items are :"+groceryBill);
	}

}
