package LearningPlatform;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.login();
        s1.logout();
        Instructor i1 = new Instructor();
        i1.login();
        i1.logout();
    }
}
