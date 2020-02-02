package day48;

public class Ball implements Bouncable{
    String shape;
    String color;

    @Override
    public void bounce() {
    }

    @Override
    public String toString() {
        return "Ball{" +
                "shape='" + shape + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
