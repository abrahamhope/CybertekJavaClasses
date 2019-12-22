package day14;

public class PasswordValidator {
    public static void main(String[] args) {
        /*
        minimum 8 char max 16 char
        it must contatin _ or $
        it must not contain space
        it must start with Ab
        if any of the above condition does not match
        say Invalid Password
         */

        String password = "Abh_1654g";

        boolean min8max16= password.length()>=8 && password.length()<=16;
        boolean mustContain= password.contains("_") || password.contains("$");
        boolean mustNotContainSpace= ! password.contains(" ");
        boolean mustStartWithAb= password.startsWith("Ab");

        if(min8max16 && mustContain && mustNotContainSpace && mustStartWithAb){
            System.out.println("Valid Password");

        }else{
            System.out.println("Invalid Password");
        }


    }
}
