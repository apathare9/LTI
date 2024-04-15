import java.util.ArrayList;
import java.util.Collections;

public class _11EmptyArrayList {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();

        arr.add ("A");
        arr.add ("B");
        arr.add ("C");

        System.out.println("Before Clearing : " + arr);

        arr.removeAll(arr);

        System.out.println("After Clearing : " + arr);

    }
}