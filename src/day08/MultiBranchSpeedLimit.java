package day08;

public class MultiBranchSpeedLimit {
    public static void main(String[] args) {
        int currentSpeed=59;

        if (currentSpeed>90){
            System.out.println("Jail");
        }else if(currentSpeed>80){
            System.out.println("reckless driving");
        }else if(currentSpeed>70){
            System.out.println("point taken");
        }else if(currentSpeed>60){
            System.out.println("warning");
        }else{
            System.out.println("Keep driving");
        }
    }
}
