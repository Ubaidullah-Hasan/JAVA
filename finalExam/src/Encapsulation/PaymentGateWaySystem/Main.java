package Encapsulation.PaymentGateWaySystem;

public class Main {
    public static void main(String[] args) {
        User hasan = new User("Hasan", "hasan@gmail.com", 90.32);

        PaymentMethod paypal = new Paypal(hasan);
        PaymentMethod card = new CreditCard(hasan);
        PaymentMethod bkash = new Bkash(hasan);

        card.pay();

    }
}
