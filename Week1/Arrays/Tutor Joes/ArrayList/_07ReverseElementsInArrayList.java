// Write a Java program to reverse elements in a array list

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class _07ReverseElementsInArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> arr = new ArrayList<>();

        System.out.print("Enter the number of element: ");
        int size = sc.nextInt();

        sc.nextLine();

        for (int i=0; i<size; i++) {
            arr.add(sc.nextLine());
        }

        System.out.println(arr);

        Collections.reverse(arr);
        
        System.out.println(arr);

    }
}