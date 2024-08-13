public class CreditCardPayment implements PaymentMethod 
{
    public void Pay(double amount) 
    {
        System.out.println("Paid $" + amount + " using a credit card..!");
    }
}
