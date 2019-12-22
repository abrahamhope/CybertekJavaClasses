package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {
        //             0123456789

        // get the second Java in this sentence
        //assume you already know there is 4 Java in this sentence
        //second java means -->> the Java showed up after first Java

        //first find out the location of the first Java
        // in order to find the second one,
        //instead of searching from the beginning,
        // search from right after the location you found first Java
        // then it will give you the index of second Java

        //But how do I start from different location when using indexof?
        //because index of always start from the beginning

        // indexOf method has 2 versions: 1 external data, another expect 2 external data.
        // yourString.indexOf()
        String name = "I love Java Java Java Java Java";
        System.out.println(name.indexOf("Java"));
        System.out.println(name.indexOf("Java", 8));
        System.out.println(name.indexOf("Java", 13));
        System.out.println(name.indexOf("Java", 18));
        System.out.println(name.indexOf("Java", 23));

        System.out.println("\"yusuf sule isik\" = " + "yusuf sule isik");
        
        
    }
}
