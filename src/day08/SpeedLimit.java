package day08;

public class SpeedLimit {
    public static void main(String[] args) {
        int currentSpeed= 65;

        if(currentSpeed>70){
            System.out.println("you speed is more than 70");
            // asking whether it's less than or equal to 70 and more than 60
        }else if(currentSpeed>60) {
            System.out.println("your speed is more than 60 and less than 70");
        }else{
            System.out.println("KEEP DRIVING. YOU ARE GOOD!!!");
        }
    }
}
