// program to count a number of Unicode code points in the specified text range of a String

public class _04CodePointCount {
    public static void main(String[] args) {

        String str = "Tutor Joes";
		System.out.println("Given String : " + str);
        int count = str.codePointCount(1, 10);

        System.out.println("Code Point Count : " + count);


    }
}