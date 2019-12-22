package day19;

public class FindingTheCountOfSomething {
    public static void main(String[] args) {
        // from 1-100 count how many numbers canbe divided by 15
        int counter=0;


for(int i=1 ; i<=100 ; i++){
    if(i%15==0){
 System.out.print(i+" ");
        ++counter;
    }
}
System.out.println("Count of numbers that can be divided by 15= "+counter);

// given a string with value find out how many a showed up in the string

String name= "Esra Fidan";
int countA=0;

for (int x = 0; x<name.length() ; x++){
    System.out.print( name.charAt(x) );
    System.out.println();
    if(name.charAt(x) == 'a'){
        ++countA;
    }
}
        System.out.println("The number of a character is: "+countA);

    }
}
