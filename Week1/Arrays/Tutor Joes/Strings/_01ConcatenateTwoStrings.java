// Java program to concatenate Two strings.



public class _01ConcatenateTwoStrings {

    public static String conCat(String s1, String s2) {

        if (s1.length() != 0 && s2.length() !=0 && s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            return s1 + s2.substring(1); // you effectively remove the "K" from s2 before concatenating.
        } else {
            return "";
        }
        
    }


    public static void main(String[] args) {



        String str1 = "Mark";
        String str2 = "Kate";
        String s1 = str1.toLowerCase();
        String s2 = str2.toLowerCase();
        System.out.println("String : " + s1 + "&" + s2);
        System.out.println("String After Concatenation : " + conCat(s1, s2));






    }

}