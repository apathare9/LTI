// Write a program to get the contents of a given string as a byte array.

public class _13StringToByteArray {
    public static void main(String[] args) {

        String str1 = "This is a sample string...";
        byte[] bytearr = str1.getBytes();
        String str2 = new String(bytearr);

        System.out.println("Byte Array : " + bytearr);
        System.out.println("String : " + str2);




    }
}