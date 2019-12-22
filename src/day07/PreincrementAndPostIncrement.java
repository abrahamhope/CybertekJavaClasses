package day07;

public class PreincrementAndPostIncrement {
    public static void main(String[] args) {
//Increment and decrement operator ++  --  has two version
//Pre-increment   ++score
//Post increment  score++
//
//Pre- decrement   --score
//Post decrement  score--
        int apple=8;
        ++apple;
        System.out.println(apple);

        System.out.println(apple++);
        System.out.println(apple);
        System.out.println("\n");

        int score =50;
        System.out.println(++score); //51
        System.out.println(score++); // stays 51 and ready to be 52 next time shows up
        System.out.println(score); //52
        System.out.println(--score);//51
    }
}
