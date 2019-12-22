package day03;

public class StringPractice {
    public static void main(String[] args) {
        String myValue = "This is a string";
        System.out.println(myValue);

        String name= "Abraham";
        String lastName=" Hope";
        String fullName= name+lastName;
        System.out.println(fullName);

        int age = 37;
        double height = 5.11;
        boolean isMarried = true;
        byte childrenCount = 2;
        String city="Saint Louis";

        System.out.println("I am "+ name+ lastName+ ". I live in "+
                city+ ". I am "+height +" tall"+ ". Am I married? "+
                isMarried+ ". I have "+ childrenCount+" children");
    }
}
