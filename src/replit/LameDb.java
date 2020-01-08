package replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LameDb {

    public static String lameDb(String db, String op,String id,String data){
   String result="";
        List<String> lstDbArr=new ArrayList<>(Arrays.asList(db.split("#")));

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
            if(lstDbArr.get(i).charAt(0)!=1){
               result+="#";
            }
            result+=lstDbArr.get(i);
        }
        return result;
    }//end lameDb
}
