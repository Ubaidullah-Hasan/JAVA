class Dinosaur extends Animal {
    int age;
    String size;

    public Dinosaur(int age, String size) {
        super("Reptilia");
        this.age = age;
        this.size = size;
    }

    public void display(){
        System.out.println("Dinosaur age and size are: " + age + size);
    }
}