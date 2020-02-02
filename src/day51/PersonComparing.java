package day51;

public class PersonComparing {
    public static void main(String[] args) {
        Person p1 = new Person("Arafat", 34);
        Person p2 = new Person("Zhibekchach", 18);

        System.out.println(p1);
        System.out.println(p2);

//        if(p1.age>p2.age){
//            System.out.println(1);
//        }else if(p1.age<p2.age){
//            System.out.println(-1);
//        }else{
//            System.out.println(0);
//        }
        System.out.println(p1.compareTo(p2));
    }
}
