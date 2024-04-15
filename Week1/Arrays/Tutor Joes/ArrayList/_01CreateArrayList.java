// Write a Java program to create a new array list, add some elements and print out the collection
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _01CreateArrayList {
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



    }
}