
// Write a Java program to Convert an ArrayList to Array

import java.util.ArrayList;
import java.util.Arrays;

public class _31ConvertArrayListToArray {
    public static void main (String[] args) {

        ArrayList arr = new ArrayList();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");

        System.out.println("Before Converstion of ArrayList...");
		System.out.println("Given Array List :"+ arr );
		System.out.println("Size of ArrayList : " + arr.size());
        
        System.out.println("\nConvert an ArrayList to Array ..");

        Object[] newarr = arr.toArray();
        System.out.println(Arrays.toString(newarr));


    }
}