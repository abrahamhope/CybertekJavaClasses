package day19;

public class CharAndForLoop {
    public static void main(String[] args) {
        //each character has it's corresponding ascii value from the ascii table
        //

//        int x='A';
//        char myChar = 'A';

//        System.out.println(x);
//        System.out.println(myChar);
//        System.out.println(++myChar);
//        System.out.println(++myChar);
//        System.out.println(++myChar);
//        System.out.println(++myChar);

for (char iChar='A' ;  iChar<='Z'; iChar +=2){
    System.out.print(iChar+" ");
}

        System.out.println();

for(char kChar='Z'; kChar>='A'; kChar --){
    System.out.print(kChar+" ");
}


    }
}
