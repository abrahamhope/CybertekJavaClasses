package day12;

public class WakeUp_CodeWeather {
    public static void main(String[] args) {
        String weather = "";

        System.out.println("enter the weather status in your state");
        weather = "Rainy";

        //when the else statement is not used, program
        // `keeps running even after finding the right String


        if (weather.equals("Sunny")) {
            System.out.println("Code in Sunny Weather");
        } else if (weather.equals("Rainy")) {
            System.out.println("Code in Rainy Weather");
        } else if (weather.equals("Cloudy")) {
            System.out.println("Cloudy Weather");
        }else if (weather.equals("Snowy")) {
            System.out.println("Snowy Weather");
        } else {
            System.out.println("Rain or shine just keep coding anyway!!");
        }

    }
}
