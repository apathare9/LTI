// Write a Java program to sort a given array list

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class _04SortArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        List<String> arr = new ArrayList<>();

        // EDCBA
        sc.nextLine();
        for (int i=0; i<size; i++) {
            arr.add(sc.nextLine());
        }

        Collections.sort(arr);

        System.out.println(arr); // ABCDE

        
    }
}