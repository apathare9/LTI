// Write a program to check whether two String objects contain the same data

public class _12CheckSameData {
    public static void main(String[] args) {

        String str1 = "Courses";
        String str2 = "Course";

        String e = "Course";

        Boolean s1 = str1.equals(e);
        Boolean s2 = str2.equals(e);


        System.out.println(str1 + " Equals : " + s1);
        System.out.println(str2 + " Equals : " + s2); 

    }
}