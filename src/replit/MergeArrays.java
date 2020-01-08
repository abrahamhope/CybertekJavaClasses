package replit;

public class MergeArrays {
    public static int[] mergR(int[] a,int[] b) {

        int length=a.length+b.length;
        int[] mergedArr=new int[length];
        for (int i = 0; i < a.length; i++) {
            mergedArr[i]=a[i];
        }
        for (int j = 0; j < b.length; j++) {
            mergedArr[j+a.length]=b[j];
        }
        return mergedArr;


    }//end mergR

    public static void main(String[] args)
    {
    }
}
