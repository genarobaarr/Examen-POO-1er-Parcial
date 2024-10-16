package PayPal;

public class Main {

    public static void main(String[] args) {
        System.out.println("");

        Payment creditCardPayment = new CreditCardPayment(150.00, "1234-5678-9123-4567");
        creditCardPayment.processPayment();

        System.out.println("");

        Payment payPalPayment = new PayPalPayment(85.75, "genarobaarr@example.com");
        payPalPayment.processPayment();
    }

}
