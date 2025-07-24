package day4;
abstract class Payment
{
	double amount;
	Payment(double amount)
	{
		this.amount=amount;
	}
	
	abstract void makePayment();
	void paymentDetails()
	{
		System.out.println("Payment Successfull.....");
	}
}

class UpiPayment extends Payment
{

	UpiPayment(double amount) {
		super(amount);
	}

	@Override
	void makePayment() {
		System.out.println("Paid by Upi payment ");
		
	}
	
}

class CreditCardPayment extends Payment
{

	CreditCardPayment(double amount) {
		super(amount);
	}

	@Override
	void makePayment() {
		System.out.println("Paid by credit Card");
		
	}
	
}
public class Payments {

	public static void main(String[] args) 
	{
		UpiPayment up=new UpiPayment(1234);
		up.makePayment();
		up.paymentDetails();
		System.out.println();
		CreditCardPayment ccp=new CreditCardPayment(435);
		ccp.makePayment();
		ccp.paymentDetails();

	}

}
