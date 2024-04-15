public class RobotToOrigin {
    public static void main (String[] args) {

        String moves = "LL";

        char[] arr = moves.toCharArray();
        int U = 0;
        int D = 0;
        int L = 0;
        int R = 0;

        for (int i=0; i<arr.length; i++) {
            char ch = arr[i];
            if (ch == 'U') {
                U++;
            }
            else if (ch == 'D') {
                D++;
            }
            else if (ch == 'L') {
                L++;
            }
            else if (ch == 'R') {
                R++;
            }
        }

        if ((U - D) == 0 && (L - R) == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }


    }
}