// Java program to Retrieve a portion of an ArrayList.

import java.util.ArrayList;
import java.util.List;

public class _37RetrievePortionOFArrayList {
    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("A");
		arr1.add("B");
		arr1.add("C");
		arr1.add("D");
		arr1.add("E");
		arr1.add("F");
		arr1.add("G");

		List<String> partition = new ArrayList<>(arr1.subList(1, 3));
        System.out.println(partition);



    }
}