package day14;

public class LastIndexOf {
    public static void main(String[] args) {
        String name= "Game of Java";

        System.out.println(" find out the last location  the letter a show up");
        System.out.println(name.lastIndexOf("a"));


        System.out.println("find out last location the character space shows up");
        System.out.println(name.lastIndexOf(" "));

        System.out.println("find out last location the letter Ga shows up");
        System.out.println(name.lastIndexOf("Ga"));

        System.out.println("find out last locaiton the letter Kawa shows up");
        System.out.println(name.lastIndexOf("Kawa"));

        if (name.indexOf("Kawa")> -1){
            System.out.println("Kawa found!!!");
        }else{
            System.out.println("Kawa");
        }



    }

}
