public class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("Payment is done via Credit Card ✅");
    }
}
