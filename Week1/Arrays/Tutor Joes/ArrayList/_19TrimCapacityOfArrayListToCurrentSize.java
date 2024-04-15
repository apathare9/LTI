// Write a Java program to trim the capacity of an array list the current list size.

import java.util.ArrayList;
import java.util.Collections;

public class _19TrimCapacityOfArrayListToCurrentSize{
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        System.out.println("Given Array List : " + arr);
        System.out.println("Let trim to size the above array.. ");
        arr.trimToSize();
        System.out.println(arr);


    }
}