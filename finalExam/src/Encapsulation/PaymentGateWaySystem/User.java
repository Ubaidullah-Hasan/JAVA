package Encapsulation.PaymentGateWaySystem;

public class User {
    private String name;
    private String email;
    private double amount;

    public User(String name, String email, double amount) {
        this.name = name;
        this.email = email;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

}
