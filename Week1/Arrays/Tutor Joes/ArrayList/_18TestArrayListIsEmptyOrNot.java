// Write a Java program to test an array list is empty or not

import java.util.ArrayList;
import java.util.Collections;

public class _18TestArrayListIsEmptyOrNot {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        System.out.println("Given Array List : " + arr);
        System.out.println("Checking the above Array List is Empty or Not : "+ arr.isEmpty());
        arr.removeAll(arr);
        System.out.println("Checking the above Array List is Empty or Not : "+ arr.isEmpty());




    }
}