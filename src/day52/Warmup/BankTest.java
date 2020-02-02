package day52.Warmup;

public class BankTest {
    public static void main(String[] args) {
Account a1 =new Account("John Snow", 10000);
Account a2= new Account("Hannah", 7000);

        System.out.println("a2 before= "+ a2);
        System.out.println("a1 before= "+ a1);

        a1.transferAll(a2);
        System.out.println("a2 after = " + a2);
        System.out.println("a1 after = " + a1);

        a2.transferAll(a1);
        System.out.println("a1 after = " + a1);
        System.out.println("a2 after = " + a2);

        System.out.println(a1.isNamePalindrome());
        System.out.println(a2.isNamePalindrome());


    }
}
