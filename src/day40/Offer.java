package day40;

public class Offer {
    String location;
    String company;
    long salary;
    boolean isFullTime;

    // this is a instance method to print all the information about offer object
    // inside instance method we can directlly access instance variable
    public void displayInformation(){
        System.out.println("Location = " + location + " | " +
                            "Company = " + company + " | " +
                             "Salary = " + salary + " | " +
                             "isFullTime = " + isFullTime);
    }

    // write a method called turnToFullTime
    public void turnToFullTime(){
            isFullTime=true;
    }

    // write a method to change the location of the Offer
    // to the location  user passed
    public void changeLocation(String newLocation){
        location=newLocation;
    }

    // write a method to accept 4 parameters to change ll info
    // about offers
    public void changeAllInfo(String newCompany, String newLocation, long newSalary, boolean newIsFulltime){
       location=newLocation;
       company=newCompany;
       salary=newSalary;
       isFullTime=newIsFulltime;
       // instance method can call another instance method
        // instance method can use any instance fields
        // since we already have the functionaity to display information
        // we called it here
       displayInformation();
    }

    // write a method to check the offer belong to 100K club

    /**
     * a method to check the offer belong to 100k club
     * @return true if salaryy is more than 100k, false if not
     */
    public boolean is100KOffer(){
       // salary >=100000 already generate a boolean result
        // so we can directly return that result.
        return salary>=100000;
    }

    public String toString(){
        String str=("Location = " + location + " | " +
                "Company = " + company + " | " +
                "Salary = " + salary + " | " +
                "isFullTime = " + isFullTime);
        return str;
    }

}
