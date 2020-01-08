package replit;

import java.util.Scanner;

public class DiagonalDifference172 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}
        };
        int result = 0;
//        for(int i=0, k=matrix.length-1; i<matrix.length; i++, k--) {
//   result += matrix[i][i] - matrix[i][k];
//}
        int lToR = matrix[0][0] + matrix[2][2];
        int rToL = matrix[0][2] + matrix[2][0];

            result=lToR-rToL;



        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}
