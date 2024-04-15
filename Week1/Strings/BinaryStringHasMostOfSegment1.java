public class BinaryStringHasMostOfSegment1 {
    public static void main(String[] args) {
        String s = "1001";

        Boolean fin = true;
 
        char[] ch = s.toCharArray();
        for(int i=0; i<s.length() - 1; i++) {
            if (ch[i+1] == '1' && ch[i] == '0'){
                fin = false;
                break;
            }
        }

        if(fin == true) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
        

    }
}