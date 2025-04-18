public class TestClass {
    public static void main(String[] args) {
        // Creating Objects
        Dinosaur dino = new Dinosaur( 65, "Large");
        Home home = new Home("Jurassic Park");
        Habit habit = new Habit();

        // Displaying Details
        dino.display();
        home.display();

        // Calling habit methods
        habit.running();
        habit.eating();
    }
}
