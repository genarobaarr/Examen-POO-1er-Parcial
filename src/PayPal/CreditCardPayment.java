package PayPal;

public class CreditCardPayment extends OnlinePayment{

    private String cardNumber;

    public CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println("Procesando pago con tarjeta de crédito...");
        System.out.println("Número de tarjeta: " + cardNumber);
        System.out.println("Monto cargado: " + amount + " pesos");
    }

}
