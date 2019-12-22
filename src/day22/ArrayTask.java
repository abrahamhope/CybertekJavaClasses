package day22;

public class ArrayTask {
    public static void main(String[] args) {
        byte [] data = new byte[4];

        data[0] = 4;
        data[1] = 5;
        data[2] = 12;
        data[3] = 43;

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);
        System.out.println(data[3]);

        data[3] = 20;
        System.out.println(data[3]);
    }
}
