package abstraction.Payment;

public class Main {
    public static void main(String[] args) {
        Payment card = new CraditCard("123321", 500.65);
        Payment paypal = new PayPal("hm2@gmail.com", 500.65);

        card.amount = 12;
        card.makePayment();
        paypal.makePayment();
    }
}
