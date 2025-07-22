package day3;

import java.util.Arrays;
import java.util.List;

class Store
{
	private String productName;
	private double productPrice;
	private double quantity;
	public Store(String productName, double productPrice, double quantity) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.quantity = quantity;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Store [productName=" + productName + ", productPrice=" + productPrice + ", quantity=" + quantity + "]";
	}
	
	
	
}

public class StoreManagementSystem {

	public static void main(String[] args) 
	{
		Store s1=new Store("Mobile",24000.00 , 5);
		Store s2=new Store("Refrigrator",20000.00 , 4);
		Store s3=new Store("Television",17000.00 , 2);
		Store s4=new Store("AC",35000.00 , 4);
		
		List<Store> stores= Arrays.asList(s1,s2,s3,s4);
//		System.out.println(stores);
		int total=0;
		for(Store s : stores)
		{
			System.out.println(s);
			double add=s.getProductPrice() * s.getQuantity();
			total+=add;
		}
		System.out.println();
		System.out.print("Total Cost is : "+total);
				
	}

}




//Total cost per product
//
//Total bill amount
