package day39;

public class StudentCreation {
    public static void main(String[] args) {
        //how do we create and object out of a template

        Student s1 = new Student();
        s1.name="Karima";
        s1.age=18;
        s1.gender='F';
        // get the values for s1 object attributes
        System.out.println("s1.name = " + s1.name);


        Student s2 = new Student();
        s2.name="Juma";
        s2.age=31;
        s2.gender='M';
        System.out.println("s2.age = " + s2.age);

        s2.age=28;

        System.out.println(s2);


    }
}
