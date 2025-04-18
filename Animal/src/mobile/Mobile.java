// package mobile;

import java.util.ArrayList;
import java.util.Scanner;

// Mobile class
class Mobile {
    private String model;
    private double price;

    // Constructor
    public Mobile(String model, double price) {
        this.model = model;
        this.price = price;
    }

    // Display Mobile List
    public static void display(ArrayList<Mobile> mobiles) {
        System.out.println("\nMobile List:");
        for (Mobile mobile : mobiles) {
            System.out.println("Model: " + mobile.model + ", Price: $" + mobile.price);
        }
    }

    // Search Mobile by Model Name
    public static void search(ArrayList<Mobile> mobiles, String modelName) {
        boolean found = false;
        for (Mobile mobile : mobiles) {
            if (mobile.model.equalsIgnoreCase(modelName)) {
                System.out.println("\nMobile Found: Model: " + mobile.model + ", Price: $" + mobile.price);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("\nMobile not found!");
        }
    }

    // Edit Mobile Price
    public static void edit(ArrayList<Mobile> mobiles, String modelName, double newPrice) {
        boolean updated = false;
        for (Mobile mobile : mobiles) {
            if (mobile.model.equalsIgnoreCase(modelName)) {
                mobile.price = newPrice;
                System.out.println("\nPrice updated successfully!");
                updated = true;
                break;
            }
        }
        if (!updated) {
            System.out.println("\nMobile not found for editing!");
        }
    }

    // Delete Mobile
    public static void delete(ArrayList<Mobile> mobiles, String modelName) {
        boolean removed = mobiles.removeIf(mobile -> mobile.model.equalsIgnoreCase(modelName));
        if (removed) {
            System.out.println("\nMobile deleted successfully!");
        } else {
            System.out.println("\nMobile not found for deletion!");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Mobile> mobiles = new ArrayList<>();

        // Adding Sample Mobiles
        mobiles.add(new Mobile("iPhone 15", 999.99));
        mobiles.add(new Mobile("Samsung S23", 849.50));
        mobiles.add(new Mobile("OnePlus 11", 699.99));

        while (true) {
            System.out.println("\n1. Display Mobiles");
            System.out.println("2. Add Mobile");
            System.out.println("3. Search Mobile");
            System.out.println("4. Edit Mobile Price");
            System.out.println("5. Delete Mobile");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    display(mobiles);
                    break;
                case 2:
                    System.out.print("\nEnter Model Name: ");
                    String model = scanner.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scanner.nextDouble();
                    mobiles.add(new Mobile(model, price));
                    System.out.println("\nMobile Added Successfully!");
                    break;
                case 3:
                    System.out.print("\nEnter Model to Search: ");
                    String searchModel = scanner.nextLine();
                    search(mobiles, searchModel);
                    break;
                case 4:
                    System.out.print("\nEnter Model to Edit Price: ");
                    String editModel = scanner.nextLine();
                    System.out.print("Enter New Price: ");
                    double newPrice = scanner.nextDouble();
                    edit(mobiles, editModel, newPrice);
                    break;
                case 5:
                    System.out.print("\nEnter Model to Delete: ");
                    String deleteModel = scanner.nextLine();
                    delete(mobiles, deleteModel);
                    break;
                case 6:
                    System.out.println("\nExiting Program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("\nInvalid Option! Try Again.");
            }
        }
    }
}
