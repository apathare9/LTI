// program to get the character (Unicode code point) at the given index within the String

public class _03GetUnicodeCharacter {
    public static void main(String[] args){

        String str = "Tutor Joes";
		System.out.println("Given String : " + str);

        int s1 = str.codePointAt(0);
        int s2 = str.codePointAt(6);

        System.out.println("Character :"+str.charAt(0)+"\nUnicode Point : " + s1);
		System.out.println("Character :"+str.charAt(6)+"\nUnicode Point : " + s2);


    }
}