// Write a Java program to increase the size of an array list

import java.util.ArrayList;
import java.util.Scanner;

public class _06IncreaseSizeOfArrayList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of your array: ");
        int size = sc.nextInt();

        ArrayList<String> arr = new ArrayList<>(size);

        // Consume the newline character left in the input buffer
        sc.nextLine();

        for(int i = 0; i < size; i++) {
            arr.add(sc.nextLine());
        }

        System.out.println("Initial ArrayList: " + arr);

        // Increase the capacity of the ArrayList
        arr.ensureCapacity(size + 2);

        // Add two more elements to the ArrayList
        for (int i = 0; i < 2; i++) {
            arr.add(sc.nextLine());
        }

        System.out.println("ArrayList after adding two more elements: " + arr);
    }
}
