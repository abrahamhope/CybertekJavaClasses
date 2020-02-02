package day48;

public class Kangaroo implements Bouncable {

    String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }

    public void eat(){
        System.out.println("Kangaroo with name "+name+" is eating.");
    }

    @Override
    public void bounce() {
        System.out.println("this "+name+ " can jump");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }
}
