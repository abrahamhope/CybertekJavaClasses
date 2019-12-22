package day32;

public class WarmUpTask {
public static void reversePrintMyOwnName(){

    String myName="isaac";
    for (int i = myName.length()-1; i >=0 ; i--) {
        System.out.print(myName.charAt(i));
    }
    System.out.println();
    }

    public static void reversePrintAnyName(String name){
        for (int i = name.length()-1; i >=0 ; i--) {
            System.out.print(name.charAt(i));
        }
        System.out.println();
    }
    public static void printLastCharacterOfName(String name) {
        System.out.println(name.charAt(name.length()-1));
    }
    public static void printFullNameInformation(String firstname, String lastname) {
       int nameLength=firstname.length()+lastname.length();
        System.out.println("Your first name is "+firstname+", "+"Your last name is "+lastname+" your full name length is "+nameLength);
    }
    public static void main(String[] args) {
reversePrintMyOwnName();
reversePrintAnyName("cybertek");
printLastCharacterOfName("lastletter");
printFullNameInformation("isaac","hope");

}
}
