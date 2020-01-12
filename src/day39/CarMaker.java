package day39;

public class CarMaker {
    public static void main(String[] args) {
        Car c1=new Car();
        c1.model="corolla";
        c1.year=2018;
        c1.make="toyota";
        c1.color="green";
        System.out.println(c1.year+" "+c1.color+" "+c1.make+" "+c1.model+" ");

        Car c2=new Car();
        c2.model="avalon";
        c2.year=2018;
        c2.make="toyota";
        c2.color="black";
        System.out.println(c2.year+" "+c2.color+" "+c2.make+" "+c2.model+" ");

    }

}
