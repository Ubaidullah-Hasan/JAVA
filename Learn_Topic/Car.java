public class Car {
    String name;
    String model;

    public Car(String name, String model){
        this.name = name;
        this.model = model;
    }

    public void displayInfo() {
        System.out.println("Car name: " + name);
        System.out.println("Car model:" + model);
    }
}