package replit200;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Replit216BlogPost {
    public String blogDb(ArrayList<String[]> r, String id)  {
        int idNum=Integer.parseInt(id);
       return r.get(idNum-1)[1]+"\n"+r.get(idNum-1)[2];
    }

    public static void main(String[] args) {
        Replit216BlogPost m = new Replit216BlogPost();
        ArrayList<String[]>  arr = new ArrayList<String[]>();
        arr.add(new String[]{"1","title 1","content"});
        arr.add(new String[]{"2","title 2","content"});
        arr.add(new String[]{"3","title 3","content3"});

        String post = m.blogDb(arr,"3");
        System.out.print(post);
        //should output:
        //title 3
        //content3


    }//end main
}
