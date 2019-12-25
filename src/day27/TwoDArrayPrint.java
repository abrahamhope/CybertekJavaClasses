package day27;

public class TwoDArrayPrint {
    public static void main(String[] args) {

        int []nums= {1,2,34,4};
        int [][] data = {{2,14,3}, {4,5}, {9,7}};

        for(int[] row  : data){
            for(int item:row){
                System.out.print("-"+item);
            }
            System.out.println();
        }

        for (int i = 0; i < data.length; i++) {
            System.out.print("Row number"+(i+1)+" : ");

            for (int j = 0; j < data[i].length; j++) {
                System.out.print(data[i][j]+" ");

            }
            System.out.println();
        }

        for (int i = 0; i < data.length; i++) {


            for (int j = 0; j < data[i].length; j++) {
                if(data[i][j]==4){
                    continue;
                }
                System.out.println("data["+i+"]["+j+"]= "+data[i][j]);

            }
            System.out.println();
        }

    }
}
