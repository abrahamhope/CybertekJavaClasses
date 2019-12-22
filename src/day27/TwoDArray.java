package day27;

public class TwoDArray {
    public static void main(String[] args) {
        int [][] data= new int[4][2];
        data[0][0]= 12;
        data [0][1]=17;
        data[1][0]= 3;
        data [1][1]=40;
        data[2][0]= 44;
        data [2][1]=27;
        data[3][0]= 23;
        data [3][1]=12;

        for (int[] eachRow  : data ){
            for (int eachCell: eachRow){
                System.out.print(eachCell+" ");
            }
            System.out.println();

        }

    }
}
