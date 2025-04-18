abstract public class Animal {
    String kingdom;

    public Animal(String kingdomName) {
        this.kingdom = kingdomName;
    }

    public abstract void display();
}
