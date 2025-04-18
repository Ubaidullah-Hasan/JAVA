package Encapsulation.PaymentGateWaySystem;

public class CreditCard extends PaymentMethod {
    public CreditCard(User user) {
        super(user);
    }

    public void pay() {
        System.out.println("\nCredit card pay " + user.getAmount() + " the money. \n");
    }

}
