package day29;

import java.util.Arrays;

public class FillingUpArrayValiue {
    public static void main(String[] args) {

        String [] java = new String[300];

        for (int i = 0; i < 300; i++) {
            java[i]="I love Java";
        }
        System.out.println(Arrays.toString(java));

    }
}
