package day09;

import java.util.Scanner;

public class AndroidChallange {
    public static void main(String[] args) {
    //WRITE YOUR CODE HERE
    Scanner scan=new Scanner(System.in);

    double version=scan.nextDouble();

    if(version==1.5d){
      System.out.println("Cupcake");
    }else if(version==1.6d){
      System.out.println("Donut");
    }else if(version==2.1d){
      System.out.println("Eclair");
    }else if(version==2.2d){
      System.out.println("Froyo");
    }else if(version==2.3d){
      System.out.println("Gingerbread");
    }else if(version==3.1d){
      System.out.println("Honeycomb");
    }else if(version==4.0d){
      System.out.println("Ice Cream Sandwich");
    }else if(version>=4.1d && version<=4.31d){
      System.out.println("Jelly Bean");
    }else if(version>=4.4d && version<=4.44d){
      System.out.println("KitKat");
    }else if(version>=5.0d && version<=5.11d){
      System.out.println("Lollipop");
    }else if(version>=8.0d && version<=8.1d){
      System.out.println("Oreo");
    }else if(version==9.0d){
      System.out.println("Pie");
    }else{
      System.out.println("Sorry, I don't know this version!");
    }
    //Step 1. Create object of Scanner class

    //Step 2. Create and intitialize in variable version. Use scanner.nextDouble() to intitialize.

    //Step 3. Write an if statement

  }
}

