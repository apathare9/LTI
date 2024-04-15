// Write a program to check whether a given string ends with the contents of another string.

public class _11ChechEndsWith {
    public static void main(String[] args) {

        String str1 = "Courses";
        String str2 = "Course";

        String e = "es";

        System.out.println(str1 + " : " + str1.endsWith(e));
        System.out.println(str2 + " : " + str2.endsWith(e)); 


    }
}