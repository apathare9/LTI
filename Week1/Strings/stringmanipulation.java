import java.util.Arrays;

public class stringmanipulation {
    public static void main(String[] args) {

        // equals()
        String a = "Jinks";
        String b = "Jinks";

        System.out.println(a.equals(b));

        // charAt()
        System.out.println(a.charAt(0)); // J

        // toString()
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        //toCharArray()
        String name = "Jinks";
        System.out.println(Arrays.toString(name.toCharArray()));

        //toLowerCase()
        System.out.println(name.toLowerCase());

        //toUpperCase()
        System.out.println(name.toUpperCase());

        //concat()
        String name1 = "Ajinkya";
        String name2 = "Pathare";
        String together = name1.concat(name2);
        System.out.println(together);

        //length()
        String letter = "abcd";
        System.out.println(letter.length());

        //split()
        String splitt = "Ajinkya Vikas Pathare";
        String[] arrOfSplit = splitt.split(" ");
        System.out.println(Arrays.toString(arrOfSplit));

        //replace()
        String address = "1.1.1.1";
        String newChanges = address.replace(".", "[.]");
        System.out.println(newChanges);

        //String.join()
        String[] arrr = {"ab", "c"};
        String result = String.join("", arrr);
        System.out.println(result); // Output: abc

        //indexOf()
        //Search a string for the first occurrence of "planet":

        String myStr = "Hello planet earth, you are a great planet.";
        System.out.println(myStr.indexOf("planet")); // 6



        


       


    }
}