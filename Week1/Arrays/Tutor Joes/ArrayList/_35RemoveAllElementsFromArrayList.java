// Write a Java program to Remove all elements of an ArrayList at a time

import java.util.ArrayList;

public class _35RemoveAllElementsFromArrayList {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        arr.add("A");
        arr.add("B");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("D");

		System.out.println("Before Removing all elements from ArrayList : " + arr);

        arr.clear();

		System.out.println("After Removing all elements from ArrayList : " + arr);



    }
}