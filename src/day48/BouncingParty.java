package day48;

public class BouncingParty {
    public static void main(String[] args) {

        Kangaroo b1= new Kangaroo("coco", 10);
        System.out.println("b1 = " + b1);
        b1.bounce();
        b1.eat();
    }
}
