import java.util.Arrays;
import java.util.Scanner;

public class _04RichestCustomerWealth {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] mainarr = new int[row][col]; 
        
        for(int r=0; r<mainarr.length; r++){
            for(int c=0; c<mainarr[r].length; c++){
                mainarr[r][c] = sc.nextInt();
            }
        }

        for(int i=0; i<mainarr.length; i++) {
            System.out.println(Arrays.toString(mainarr[i]));
        }

        int tempp = 0;
        for(int r=0; r<mainarr.length; r++){

            int sum = 0;

            for(int c=0; c<mainarr[r].length; c++) {
                sum = sum + mainarr[r][c]; 
            }

            if (sum > tempp) {
                tempp = sum;
            }
        }

        System.out.println("Max Wealth : " + tempp);



        


    }
}