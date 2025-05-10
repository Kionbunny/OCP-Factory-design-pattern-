import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
       Scanner sc = new Scanner(System.in);//Initializes the Scanner to read user input from the console.
      //  Displays the available payment options to the user.
        System.out.println("Pay the medical bill ");
        System.out.println("Choose the options from the below listed methods ");
        System.out.println("1) Pay using Debit Card");
        System.out.println("2) Pay using Credit Card");
        System.out.println("3) Pay using NetBanking");
      int option = sc.nextInt();// take the input from the console as integer
        PaymentMethod method = PaymentFactory.getPaymentMethod(option);
        if(method != null ) {
            method.pay();
            // Polymorphism: Correct method will be called
            // method is a reference of type PaymentMethod (Interface) ,
            // but the actual object it (method)  refers to is one of the child classes like:
           // 1) NetBankingPayment  2) DebitCardPayment  3) UPIPayment
            //When .pay() is called, the JVM dynamically dispatches to the correct overridden method based on the actual object (e.g., NetBankingPayment.pay()).
        }else{
            System.out.println("Invalid choice ");
        }
    }
}