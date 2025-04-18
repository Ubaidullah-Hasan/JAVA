package abstraction.Payment;

public class CraditCard extends Payment {
    public String cardNumber;

    public CraditCard(String cardNum, double amount) {
        super(amount);
        this.cardNumber = cardNum;
    }

    @Override
    public void makePayment() {
        System.out.println("\nPayment " + amount + " successfull by cradit card.");
    }
}
