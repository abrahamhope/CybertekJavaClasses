package day47;

public class Garage {
    public static void main(String[] args) {

        GasCar c1= new GasCar();
        c1.start();
        c1.goBackward();
        c1.goForward();
        c1.turn("right");
    }
}
