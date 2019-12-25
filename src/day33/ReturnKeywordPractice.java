package day33;

public class ReturnKeywordPractice {
    public static int calculateAndReturnAge(int birthYear){
        int age;
        if(birthYear>1900&& birthYear<2020){
             age=2019-birthYear;
        }else{
            age=0;
        }
        return age;
    }

    public static void main(String[] args) {
        System.out.println(calculateAndReturnAge(1980));
        int[] testYears={1999,122,2019,1987,1978,1964,3999,2004};

        for (int i = 0; i < testYears.length; i++) {
            System.out.println("Age is= "+calculateAndReturnAge(testYears[i]));
        }

    }
}
