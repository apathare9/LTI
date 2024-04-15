// Write a Java program to insert an element at a particular position of an ArrayList.

import java.util.ArrayList;

public class _32InsertToParticularPositionOfArrayList {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        arr.add("A");
        arr.add("C");
        arr.add("D");


		System.out.println("Before Remove ArrayList : " + arr);

        arr.add(1, "B");
        arr.add(4, "E");

        System.out.println("After Removing Elements : " + arr);





    }
}