public class DebitCardPayment implements PaymentMethod{

    @Override
    public void pay() {
      System.out.println("Payment is done via Debit Card ✅");
    }
}
// when method.pay is called the child class that implements the PaymentMethod interface
// will Override the method pay() that is declared in the interface