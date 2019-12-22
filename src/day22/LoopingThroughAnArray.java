package day22;

public class LoopingThroughAnArray {
    public static void main(String[] args) {

       int scores[]=new int[4];
        scores[0]=23;
        scores[1]=45;
        scores[2]=65;
        scores[3]=78;

        // how do we get the siize of any array object
        // array object has a property called length

        int itemCount = scores.length;
        System.out.println("itemCount = " + itemCount);
        int lastItemIndex =itemCount-1;

        for (int x = itemCount-1; x>=0 ; x--) {
            System.out.println(scores[x]);
        }





        // how do we get the char count of a String
//        String name = "Jon Snow";
//        int charCount = name.length();

    }
}
