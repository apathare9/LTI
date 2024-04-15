// Write a Java program to retrieve an element (at a specified index) from a given array list.

import java.util.ArrayList;

public class _12RetrieveElementFromArrayList {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();

        arr.add("A");
        arr.add("B");
        arr.add("C");

        String element = arr.get(0);
        System.out.println("First Element : " + element);

        element = arr.get(2);
        System.out.println("Third Clearing : " + element);


    }
}