import java.util.ArrayList;

public class _10JoinTwoArrayList {
    public static void main(String[] args) {

        ArrayList<String> arr1 = new ArrayList<String>();
        arr1.add("A");
        arr1.add("B");
        arr1.add("C");
        arr1.add("D");
        System.out.println("First Array list : " + arr1);

        ArrayList<String> arr2 = new ArrayList<String>();
        arr2.add("E");
        arr2.add("F");
        arr2.add("G");
        System.out.println("Second Array list : " + arr2);

        ArrayList<String> a = new ArrayList<String>();
        a.addAll(arr1);
        a.addAll(arr2);
        System.out.println("After Merging : " + a);
    }
}
