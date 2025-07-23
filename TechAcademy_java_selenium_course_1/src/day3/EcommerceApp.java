package day3;

interface PaymentMode {
    void pay(double amount);
}

class UpiPayment implements PaymentMode {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " via UPI.");
    }
}

class CreditCardPayment implements PaymentMode {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Credit Card.");
    }
}

class CashOnDelivery implements PaymentMode {
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " will be collected after delivery.");
    }
}

public class EcommerceApp {
    public static void main(String[] args) {
        PaymentMode payment;

        payment = new UpiPayment();
        payment.pay(2000.00);

        payment = new CreditCardPayment();
        payment.pay(2400.00);

        payment = new CashOnDelivery();
        payment.pay(1500.00);
    }
}
