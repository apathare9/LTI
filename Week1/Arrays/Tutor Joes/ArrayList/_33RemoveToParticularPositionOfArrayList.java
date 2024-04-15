// Write a Java program to insert an element at a particular position of an ArrayList.

import java.util.ArrayList;

public class _33RemoveToParticularPositionOfArrayList {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        arr.add("A");
        arr.add("B");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("D");


		System.out.println("Before Remove ArrayList : " + arr);

        arr.remove(1);
        arr.remove(4);

        System.out.println("After Removing Elements : " + arr);





    }
}