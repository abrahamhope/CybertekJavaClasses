package day45;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class Earth extends Planet {
int population;

    public Earth(int radius, boolean hasLife, double gravity, int population) {
        super(radius, hasLife, gravity);
        this.population = population;
    }

    public static void main(String[] args) {
        Earth e1 = new Earth(5000, true, 9.8, 100000);
        System.out.println("e1 = " + e1);
    }

    @Override
    public String toString() {
        return "Earth{" +
                "population=" + population +
                ", radius=" + radius +
                ", hasLife=" + hasLife +
                ", gravity=" + gravity +
                '}';
    }
}
