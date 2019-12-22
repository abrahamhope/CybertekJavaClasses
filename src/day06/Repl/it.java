package day06.Repl;

import java.util.Scanner;

public class it {

  public static void main(String[] args) {
    //Enter your code here
    Scanner scan=new Scanner(System.in);

    System.out.println("Welcome to the patient portal!");

    System.out.println("Enter your first name");
    String firstName=scan.next();

    System.out.println("Enter your last name");
    String lastName=scan.next();

    System.out.println("Enter your email");
    String email=scan.next();

    System.out.println("Enter your street");
    String street=scan.next();

    System.out.println("Enter your city");
    String city=scan.next();

    System.out.println("Enter your state");
    String state=scan.next();

    System.out.println("Enter your zipcode");
    int zipCode=scan.nextInt();
    scan.nextLine();


    System.out.println("Enter your work phone number");
    long workPhone=scan.nextLong();
    scan.nextLine();


    System.out.println("Enter your personal phone number");
    long personalPhoneNumber=scan.nextLong();
    scan.nextLine();


    System.out.println("Enter your age");
    int age=scan.nextInt();
    scan.nextLine();

    System.out.println("Enter your height");
    double height=scan.nextDouble();
    scan.nextLine();


    System.out.println("Enter your weight");
    double weight=scan.nextDouble();
    scan.nextLine();


    System.out.println("Are you married");
    boolean isMarried=scan.nextBoolean();

    String fullName="Full Name: "+lastName+", "+firstName;
    String address= "Address: "+street+", "+city+", "+state+" "+zipCode;
    String contact="Contacts; work phone number - "+workPhone + ", "+ " personal phone number - "+personalPhoneNumber;

    System.out.println("Patient Personal Information");
    System.out.println(fullName);
    System.out.println(address);
    System.out.println(email);
    System.out.println(age);
    System.out.println(height);
    System.out.println(weight);
    System.out.println(isMarried);
  }
}
