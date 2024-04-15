//Write a Java program how to Convert a ArrayList to HashSet

import java.util.ArrayList;
import java.util.HashSet;

public class _27ConvertArrayListToHashSet {
    public static void main(String[] args) {

    ArrayList arr = new ArrayList();
        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");

        System.out.println("Before Converstion of ArrayList...");
		System.out.println("Given Array List :"+ arr );
		System.out.println("Size of ArrayList : " + arr.size());

        //Convert ArrayList to HashSet
		HashSet hasharr = new HashSet(arr);
 
		System.out.println("\nAfter Converstion of HashSet...");
		System.out.println("Size of HashSet : " + hasharr.size());
		System.out.println("Given HashSet : "+ hasharr);




    }
}