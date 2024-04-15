// program to test if a given string contains the specified sequence of char values.

public class _08StringContains {
    public static void main(String[] args) {

        String str1 = "Tutor Joe's Computer Educations";
		String str2 = "Computer";
		String str3 = "Computers";

        System.out.println("Given String : " + str1);

        System.out.print("String Contains Value : " + str2 );
        System.out.println(" == " + str1.contains(str2));
        

        System.out.print("String Contains Value : " + str3 );
        System.out.println(" == " + str1.contains(str3));
    }
}