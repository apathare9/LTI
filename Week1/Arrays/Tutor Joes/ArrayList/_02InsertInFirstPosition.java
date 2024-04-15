// Write a Java program to insert an element into the array list at the first position
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _02InsertInFirstPosition {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        List<String> arr = new ArrayList<String>();

        System.out.print("Enter number of elements you want to enter : ");
        int size = sc.nextInt();

        sc.nextLine();

        for(int i=0; i<size; i++) {
            arr.add(sc.nextLine());
        }

        System.out.println(arr);

        arr.add(0, "A");
        arr.add(5, "F");

        System.out.println(arr);


        



    }
}