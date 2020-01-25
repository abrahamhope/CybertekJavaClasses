package replit200;


public class Replit224PersonI {
    private String firstName;
    private String lastName;
    private int age;


    public Replit224PersonI(){
       firstName ="undefined";
       lastName="undefined";
       age=-1;
    }
    public Replit224PersonI(String firstname, String lastName, int age){
        this.firstName =firstname;
        this.lastName=lastName;
        this.age=age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return firstName + " | " +
                 lastName + " | " +
                 age ;
    }
}
