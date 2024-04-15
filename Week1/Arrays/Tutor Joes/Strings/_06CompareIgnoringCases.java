// Write a Java program to compare two strings lexicographically Two strings are lexicographically equal if they are the same length and contain the same characters in the same positions

public class _06CompareIgnoringCases{
    public static void main(String[] args) {

        String str1 = "Java Exercise";
		String str2 = "Java Exercise";        
		System.out.println("String 1 : " + str1);
		System.out.println("String 2 : " + str2); 

        int result = str1.compareToIgnoreCase(str2);

        if(result < 0) {
            System.out.println("String 1 is less than String 2");
        }
        else if (result == 0) {
            System.out.println("String 1 is equal to String 2");
        } 
        else {
            System.out.println("String 1 is greater than String 2");
        }


    }
}