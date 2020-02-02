package day48;

public class FulltimeEmployee extends Employee{
    private int monthlySalary;
    public FulltimeEmployee(int monthlySalary){
        this.monthlySalary=monthlySalary;
    }

    public void calculateAnnualSalary(int hourlyWage, int numsOfHours){
        int AnnualSalary= monthlySalary*12;
    }


    @Override
    public void calculateAnnualSalary() {

    }

    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                '}';
    }
}
