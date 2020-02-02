package day49;

public class Icecream implements Edible{

    @Override
    public void eat() {
        System.out.println("eat with spoon!!");
    }

    @Override
    public void drink() {
        System.out.println("drink if it is melted");
    }
}
