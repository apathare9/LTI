// Write a Java program decrease the current capacity of an ArrayList to the current size

import java.util.ArrayList;
import java.util.Collections;

public class _26DecreaseCurrentCapacityOfArrayListToCurrentSize {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();
        arr.ensureCapacity(20);
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");

        // System.out.println("Curent Size of ArrayList : " + arr.size());

        arr.trimToSize();
        // System.out.println("Reducing the current capacity to current size");

        System.out.println("After Reducing the size : " + arr.size());



    }
}