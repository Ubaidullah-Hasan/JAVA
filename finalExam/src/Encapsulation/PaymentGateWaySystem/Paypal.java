package Encapsulation.PaymentGateWaySystem;

public class Paypal extends PaymentMethod {
    public Paypal(User user) {
        super(user);
    }

    public void pay(){
        System.out.println("Paypal pay the money.");
    }
    
}
