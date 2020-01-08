package day37;

public class Overloading188 {
    public int findMax(int[] arr){
        int maxInt=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxInt<arr[i]){
                maxInt=arr[i];
            }
        }
        return maxInt;
    }

    public double findMax(double[] arr){
        double maxDouble=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxDouble<arr[i]){
                maxDouble=arr[i];
            }
        }
        return maxDouble;
    }
}
