package lap1;

public class HourlyEmployee extends Employee {
    private int hourly_rate ; 
    private int hourly_worked ;

    
    HourlyEmployee(){
        super.setName("User");
        super.setId_number(1000);
        this.hourly_rate = 100;
        this.hourly_worked = 1;
    }
    HourlyEmployee(String name , int id_number){
        super.setName(name);
        super.setId_number(id_number);
        this.hourly_rate = 1;
        this.hourly_worked = 1;
    }

    HourlyEmployee(String name , int id_number,int  hourly_rate, int hourly_worked){
        super.setName(name);
        super.setId_number(id_number);
        this.hourly_rate = hourly_rate;
        this.hourly_worked = hourly_worked;
    }

    public int getHourly_rate() {
        return hourly_rate;
    }


    public void setHourly_rate(int hourly_rate2) {
        this.hourly_rate = hourly_rate2;
    }


    public int getHourly_worked() {
        return hourly_worked;
    }


    public void setHourly_worked(int hourly_worked) {
        this.hourly_worked = hourly_worked;
    }


    public double calculatePay() {
        return this.hourly_rate*hourly_worked;
    }
}
