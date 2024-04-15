// Write a Java program to swap two elements in an array list

import java.util.ArrayList;
import java.util.Collections;

public class _09SwapElementsinAnArrayList {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        // A E C D B
        arr.add("A");
        arr.add("E");
        arr.add("C");
        arr.add("D");
        arr.add("B");

        System.out.println("Before Swapping :" + arr);

        Collections.swap(arr,1,4);

        System.out.println("After Swapping :" + arr);



    }
}