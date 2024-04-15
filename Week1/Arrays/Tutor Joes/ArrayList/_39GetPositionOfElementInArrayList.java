// Write a Java program to get the position of a particular element in an ArrayList

import java.util.ArrayList;

public class _39GetPositionOfElementInArrayList {

    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("A");
		arr1.add("B");
		arr1.add("C");
		arr1.add("D");
		arr1.add("E");
		arr1.add("F");
		arr1.add("G");

        System.out.println(arr1);

        System.out.println("A Element Index of : "+arr1.indexOf("A")); 
		System.out.println("C Element Index of : "+arr1.lastIndexOf("C"));
		System.out.println("G Element Index of : "+arr1.lastIndexOf("G"));

    }

}