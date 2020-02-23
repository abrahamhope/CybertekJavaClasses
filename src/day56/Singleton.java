package day56;

public class Singleton {

    private static Singleton instance;

    // this cannot be used in a static method
    public static Singleton getInstance(){
        if (instance==null){
            instance= new Singleton();
            return instance;
        }else{
            System.out.println("we already have this object");
        }return instance;
    }
    private Singleton(){
        System.out.println("no arg constructor being called");
    }
}
