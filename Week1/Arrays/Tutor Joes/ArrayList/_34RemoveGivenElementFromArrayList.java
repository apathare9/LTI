// Write a Java program to Remove the given element from an ArrayList
import java.util.ArrayList;

public class _34RemoveGivenElementFromArrayList {
    public static void main(String[] args) {

        ArrayList arr = new ArrayList();
        arr.add("A");
        arr.add("B");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("D");

		System.out.println("Before Remove ArrayList : " + arr);

        arr.remove("B");
        arr.remove("D");


		System.out.println("After Remove ArrayList : " + arr);
        

    }
}