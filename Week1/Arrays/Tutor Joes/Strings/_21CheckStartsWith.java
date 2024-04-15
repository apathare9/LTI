// Write a Java program to check whether a given string starts with the contents of another string.

public class _21CheckStartsWith {
    public static void main(String[] args){

        String str1 = "Orange is Favorite Fruits";
		String str2 = "Grapes is also my favorite Fruits";

        String start = "Grapes";

        Boolean s1 = str1.startsWith(start);
        Boolean s2 = str2.startsWith(start);

        System.out.println(str1 + " Starts With " + start + " : " + s1);
        System.out.println(str2 + " Starts With " + start + " : " + s2);

    }
} 