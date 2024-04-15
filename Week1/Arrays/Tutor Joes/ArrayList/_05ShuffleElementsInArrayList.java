// Write a Java program to shuffle elements in a array list

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class _05ShuffleElementsInArrayList {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        List<String> arr = new ArrayList<>();

        // ABCDE
        sc.nextLine();
        for (int i=0; i<size; i++) {
            arr.add(sc.nextLine());
        }

        Collections.shuffle(arr);

        System.out.println(arr);

        

        
    }
}