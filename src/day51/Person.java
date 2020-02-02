package day51;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person otherPerson){
//if(this.age> otherPerson.age){
//    return 1;
//}else if(this.age<otherPerson.age){
//    return -1;
//}else{
//    return 0;
//}

    if(this.name.charAt(0)>otherPerson.name.charAt(0)){
        return 1;
    }else if(this.name.charAt(0)<otherPerson.name.charAt(0)){
        return -1;
    }else{
        return 0;
    }

    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
