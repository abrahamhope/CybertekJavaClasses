package replit200;

public class Replit205AddElements {
    public static int[] addElements(int[] ints1, int[] ints2) {
        int [] sumArr= new int[5];
        for (int i = 0; i < 5; i++) {
            sumArr[i]=ints1[i]+ints2[i];
        }
        return sumArr;
    }
}
