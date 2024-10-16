package PayPal;

public abstract class OnlinePayment implements Payment{

    protected double amount;

    public OnlinePayment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

}
