package abstraction.Payment;

public class PayPal extends Payment {
    String email;

    public PayPal(String email, double amount) {
        super(amount);
        this.email = email;
    }

    public void makePayment(){
        System.out.println("Payment " + amount + " successfull by paypal.\n");
    }
}
