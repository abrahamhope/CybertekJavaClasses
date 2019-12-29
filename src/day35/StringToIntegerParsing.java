package day35;

public class StringToIntegerParsing {

    public static void main(String[] args) {


        String strnum= "100";

        int num=Integer.parseInt(strnum);
        System.out.println("num = " + num);

        String empID="FB-457";
       String [] empIDsplit=empID.split("-");
       String idStr=empIDsplit[1];
       int id=Integer.parseInt(idStr);
        System.out.println("empIDNum = " + id);


    }
}
