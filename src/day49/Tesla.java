package day49;

public class Tesla extends Vehicle implements Autonomous{

    int horsepower;
    String model;

    public Tesla(int year, int horsepower, String model) {
        super(year);
        this.horsepower = horsepower;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsepower=" + horsepower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

    @Override
    public void selfDrive() {

    }

    @Override
    public void start() {

    }
}
