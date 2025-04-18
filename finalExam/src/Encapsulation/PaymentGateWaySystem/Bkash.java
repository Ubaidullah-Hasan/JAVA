package Encapsulation.PaymentGateWaySystem;

public class Bkash extends PaymentMethod {
    public Bkash(User user) {
        super(user);
    }

    public void pay() {
        System.out.println("Bkash pay the money.");
    };

}
