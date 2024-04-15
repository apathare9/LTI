import java.util.ArrayList;

public class _13UpdateSpecificArrayElement {
    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>();

        arr.add("A");
        arr.add("D");
        arr.add("C");

        System.out.println("Before Updating" + arr);

        arr.set(1, "B");

        System.out.println("After Updating" + arr);




    }
}