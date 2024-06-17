public class Salesperson extends Employee {

    private double bonus;
    Salesperson(){
        super();
        this.bonus = 0;
    }

    Salesperson(String name , String Id , double salary , double bonus){
        super(name,Id,salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public void displayDetail(){
        System.out.println("=========Sale Detail=======");
        System.out.println("Name : "+super.getName());
        System.out.println("ID : "+super.getID());
        System.out.println("Bonus : "+this.bonus);
        System.out.println("Salary : "+super.getSalary());
    }
    
}