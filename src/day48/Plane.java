package day48;

// we build relationship between class and interface
// using implements keyword

public class Plane implements Flyable {
String name;
int capacity;
int speed;

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
}
