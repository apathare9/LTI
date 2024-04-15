// Write a Java program to search an element in a array list

import java.util.ArrayList;

public class _14SearchElementInArrayList {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        arr.add("A");
        arr.add("B");
        arr.add("C");

        if (arr.contains("A")) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }




    }
}