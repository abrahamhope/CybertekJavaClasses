package replit;

import java.util.Arrays;

public class ChessBoardArrays {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE
        String letters="abcdefgh";
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                chessBoard[i][j]=(i+1)+""+letters.charAt(j) ;
            }
        }
        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
}
