// it acts as the centralized class that holds the object creation logic
//it creates objects without exposing the creation logic to the client (Main class).
//You ask for an object by passing an option, and the factory gives you the correct instance.
public class PaymentFactory {
public static PaymentMethod getPaymentMethod(int option) {
  //  PaymentMethod	Return type — returns an object of a class that implements PaymentMethod
    return switch (option) {
        case 1 -> new DebitCardPayment();
        case 2 -> new CreditCardPayment();
        case 3 -> new NetBanking();
        default -> null;
    };
    // switch (option) {
//        case 1 :
//            return new DebitCardPayment();
//        case 2 :
//             return new CreditCardPayment();
//        case 3:
//            return new NetBanking();
//        default :
//            return null;
//    }

}
}
