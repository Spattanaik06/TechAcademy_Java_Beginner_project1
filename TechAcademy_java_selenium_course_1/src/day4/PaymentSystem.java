package day4;

abstract class PaymentSystems implements EcommercePayment
{
	double amount;

	public PaymentSystems(double amount) {
		super();
		this.amount = amount;
	}
	
	void showSuccessMessage()
	{
		System.out.println("Payment is Successfull and Amount is :"+amount);
	}
}

class CreditcardSystem extends PaymentSystems
{

	public CreditcardSystem(double amount) {
		super(amount);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makePayment() {
		
		System.out.println("Payment is done by credit card");
		
	}
	
}

class DebitcardSystem extends PaymentSystems
{

	public DebitcardSystem(double amount) {
		super(amount);
		
	}

	@Override
	public void makePayment() {
		System.out.println("Payment is done by debit card");
		
	}
	
}

public class PaymentSystem {

	public static void main(String[] args) {
		CreditcardSystem cp=new CreditcardSystem(7328);
		cp.makePayment();
		System.out.println();
		DebitcardSystem db=new DebitcardSystem(76543);
		db.makePayment();

	}

}
