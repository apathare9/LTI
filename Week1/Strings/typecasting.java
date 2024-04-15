// byte -> short -> char -> int -> long -> float -> double

public class typecasting{

    public static void main(String[] args) {

    // int --> doubleNum 
    int num = 100;
    double doubleNum = num;
    System.out.println(doubleNum);

    // doubleNum --> int
    double doubleNumm = 99.78;
    int numm = (int) doubleNumm;
    System.out.println(numm);

    // Conversion from int to String
    int a = 6;
    String data = String.valueOf(a);
    System.out.println("The string value is: " + data);

    // Conversion from String to int
    String str = "69";
    int b = Integer.parseInt(str);
    System.out.println("The integer value is: " + b);

    }
}




