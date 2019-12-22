package day24;

public class ForEachLoopWarmUp {
    public static void main(String[] args) {
        String[] groceryItems = {"apple", "banana","grape", "strawberry", "blueberry", "kiwi"};
        float[] prices={1.99f, 0.99f, 4.65f, 3.89f, 2.88f};
        int itemCount = groceryItems.length;
        int lastItemIndex= itemCount-1;

        String lastFruit= groceryItems[lastItemIndex];

        for ( String   eachItem : groceryItems) {
            System.out.print(eachItem);
            if(!eachItem.equals(lastFruit)){
               System.out.print("-->");
           }


        }




    }
}
