package day52.Warmup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountListSorting {
    public static void main(String[] args) {
        List<Account> accountList=new ArrayList<>();
        accountList.add(new Account("John Snow", 10000));
        accountList.add(new Account("Vald", 11000));
        accountList.add(new Account("Svetlana", 13000));
        accountList.add(new Account("Muhammed", 8000));
        accountList.add(new Account("Emme", 17000));
        accountList.add(new Account("Ata", 15000));

        System.out.println("accountList before= " + accountList);
        Collections.sort(accountList);
        System.out.println("accountList after = " + accountList);


        // create another account with your name
        // transfer everyone's money to your account

        Account myAccount= new Account("Abraham",5000);
        for (Account each: accountList){
            each.transferAll(myAccount);
        }
        System.out.println(myAccount.getBalance());
        System.out.println(accountList);

        /*
        What can be the data type of a1
        Account a1;
        Comparable a1;
        Transferable a1;
        Object a1;

        An object can be referred by
                it's own type
                it's own super class type
                interface tyype that it implements

         */

        Account a1 = new Account("Polymorhism", 10000);
        Transferabla t1=new Account("Polymorhism", 10000);
        Object o1= new Account("Polymorhism", 10000);
        Comparable c1 = new Account("Polymorhism", 10000);

    }
}
