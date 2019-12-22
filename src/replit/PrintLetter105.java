package replit;

public class PrintLetter105 {
    public static void main(String[] args) {
/*
zz
zy
zx
zw
zv
yz
....
vv
 */

        for (char i = 'z'; i >='v' ; i--) {
            for (char x ='z'; x>='v' ; x--) {
                System.out.println(""+i+x);
            }

        }

    }
}
