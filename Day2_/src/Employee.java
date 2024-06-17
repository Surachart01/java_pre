public class Employee {
    private String name;
    private String ID ; 
    private double salary;


    Employee(){
        this.name = "User";
        this.ID = "12345";
        this.salary = 10000;
    }

    Employee(String name, String Id, double salary){
        this.name = name;
        this.ID = Id;
        this.salary = salary;
        }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getID() {
        return this.ID;
    }
    public void setID(String iD) {
        this.ID = iD;
    }
    public double getSalary() {
        return this.salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void displayDetail(){
        System.out.println("=========Employee Detail=======");
        System.out.println("Name : "+this.name);
        System.out.println("ID : "+this.ID);
        System.out.println("Salary : "+this.salary);
    }

    
}
