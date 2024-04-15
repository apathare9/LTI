// Write a Java program to print all the elements of a Array List using the position of the elements

import java.util.ArrayList;
import java.util.Collections;

public class _20PrintAllElementsusingPositionMethod {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        System.out.println("Given Array List : " + arr);

        System.out.println("\n Printing using index of element : ");

        for(int i=0; i<arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}