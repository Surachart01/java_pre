package lap1;

public class SalariedEmployee extends Employee {
    private double annual_salary ; 

    
    SalariedEmployee(){
        this.annual_salary = 0;
    }

    SalariedEmployee(double annual_salary){
        this.annual_salary  = annual_salary;
    }

    public double calculatePay(){
        return annual_salary*12;
    }


    public double getAnnual_salary() {
        return annual_salary;
    }


    public void setAnnual_salary(double annual_salary) {
        this.annual_salary = annual_salary;
    }
}
