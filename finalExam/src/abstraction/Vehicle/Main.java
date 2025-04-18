package abstraction.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle c = new Car();
        c.startEngine();
        Vehicle b = new Bike();
        b.startEngine();
    }
}
