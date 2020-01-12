package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LameDb {

    public static String lameDb(String db, String op,String id,String data){
    String result="";
        String [] dbArr=db.split("#");
        List<String> lstDbArr=new ArrayList<>(Arrays.asList(dbArr));

        switch (op){
        case "add":
            lstDbArr.add(id+data);
            break;
        case "edit":
            lstDbArr.set(Integer.parseInt(id)-1,id+data);
            break;
        case "delete":
            lstDbArr.remove(Integer.parseInt(id)-1);
            break;
        default:

    }
        for (int i = 0; i < lstDbArr.size(); i++) {
            if(lstDbArr.get(i).charAt(0)!='1'){
               result+="#";
            }
            result+=lstDbArr.get(i);
        }
        return result;
    }//end lameDb
    public static void main(String[] args) {


        System.out.print(
                lameDb("1etsy#2wooden#3spoon","add","4","aaa")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","edit","2","bbb")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","delete","1","")+"\n"
        );

        System.out.print(
                lameDb("1tst#2bla#3foo","none","1","")+"\n"
        );

    }
}
