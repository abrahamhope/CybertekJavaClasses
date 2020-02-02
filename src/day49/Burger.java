package day49;
// you are building super-sub relationship, IS-A relationship
public class Burger implements Edible {

    @Override
    public void eat() {
        System.out.println("Eating burger with big bite");
    }

    @Override
    public void drink() {
        System.out.println("Eat burger and drink soda");
    }
}
