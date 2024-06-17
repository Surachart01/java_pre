package lap1;

public class CommissionedEmployee extends Employee {
    private double base_salary ; 
    private double commitsion_rate;
    private double sales ;


    CommissionedEmployee(){
        this.base_salary = 1.0;
        this.commitsion_rate = 1.0;
        this.sales = 1.0;
    }

    public CommissionedEmployee(double base_salary, double commitsion_rate, double sales) {
        this.base_salary = base_salary;
        this.commitsion_rate = commitsion_rate;
        this.sales = sales;
    }


    public double calculatePay(){
        this.commitsion_rate = commitsion_rate/100;
        return this.base_salary+(this.sales*this.commitsion_rate);
    }
}
