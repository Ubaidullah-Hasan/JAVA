package Encapsulation.PaymentGateWaySystem;

abstract class PaymentMethod {
    protected User user;

    public PaymentMethod(User user) {
        this.user = user;
    }

    public abstract void pay();

    public User getUser() {
        return user;
    }

}
