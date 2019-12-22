package day06;

public class CompoundOperator {
    public static void main(String[] args) {

        int studentOnline= 263;

//        studentOnline=studentOnline+5;
//        System.out.println("5 students joined the class "+studentOnline);
//
//        studentOnline= studentOnline-3;
//        System.out.println("3 students left"+studentOnline);
//
//        studentOnline= studentOnline*2;
//        System.out.println("student numbers doubled"+studentOnline);
//
//        studentOnline= studentOnline/3;
//        System.out.println("student number dropped to 1/3rd"+studentOnline);

        // +=. -=.  *=, /=, %= shorthand operator, compound operators. Simplifies the operators.

        studentOnline +=5;
        System.out.println("5 students joined the class "+studentOnline);

        studentOnline-=3;
        System.out.println("3 students left "+studentOnline);

        studentOnline *=2;
        System.out.println("student numbers doubled "+studentOnline);

        studentOnline /=3;
        System.out.println("student number dropped to 1/3rd "+studentOnline);





    }
}
