package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4 };
        for (int num : numbers) {
        System.out.println(num + "\n");
        }

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        System.out.println("Give the array size: ");
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        in.close();
    }
}
