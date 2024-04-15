// Write a Java program to Insert more than one element at a particular position of an ArrayList.

import java.util.ArrayList;

public class _36InsertElementsAtParticularPortionOfArrayList {
    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("A");
		arr1.add("B");
		arr1.add("F");
		arr1.add("G");
		System.out.println("ArrayList 1 : "+ arr1);

        ArrayList<String> arr2 = new ArrayList<String>();
		arr2.add("C");
		arr2.add("D");
		arr2.add("E");
		System.out.println("ArrayList 2 : "+ arr2);

        // Inserting all elements of b2_list at index 2 of b1_list   
        arr1.addAll(2, arr2);

		System.out.println("Insert more than one element at a particular position of an ArrayList..");
		System.out.println(arr1);




    }
}