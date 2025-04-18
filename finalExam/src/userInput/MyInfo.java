package userInput;

import java.util.Scanner;

public class MyInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();

        System.out.println("What is your deperthment?");
        String deperthment = input.nextLine();

        System.out.println("What is your age?");
        int age = input.nextInt();


        System.out.println("What is your CGPA?");
        double cgpa = input.nextDouble();

        input.close();

        System.out.println(name);
        System.out.println(age);
        System.out.println(cgpa);
        System.out.println(deperthment);

    }
}
