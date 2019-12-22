package day19;

public class SomeOfAllNumbersWithinTheRange {
    public static void main(String[] args) {
        // get the sum of the numbers from 1-10
        int count = 0;

        for (int i = 1; i <= 100; i++) {
            count += i;
        }
        System.out.println(count);

    }
}
