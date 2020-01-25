package day47;

public class GasCar extends Car {
private int gasLevel;

    @Override
    public void start() {
        System.out.println("This is how GasCar start");
    }

    @Override
    public void goForward() {
        System.out.println("This is how GasCar goForward");

    }

    @Override
    public void goBackward() {
        System.out.println("This is how GasCar goBackward");

    }

    @Override
    public void turn(String direction) {
        System.out.println("Turning "+direction);
    }


}
