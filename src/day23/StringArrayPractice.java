package day23;

public class StringArrayPractice {
    public static void main(String[] args) {

        String[] show = {"Orville", "Gifted", "Flash", "Arrow", "Super Girl"};

        int showsCount= show.length;
        System.out.println("showsCount = " + showsCount);

        for (int i = 0; i <show.length; i++) {
            String currentShow = show[i];
            System.out.println(currentShow+ "Has character count "+ currentShow.length());

        }

    }
}
