public class Manager extends Employee {
    private String department;

    Manager(){
        super();
        this.department = "00";
    }

    Manager(String name , String Id , double salary , String department){
        super(name,Id,salary);
        this.department = department;
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public String getDepartment(){
        return this.department;
    }

    public void displayDetail(){
        System.out.println("=========Manager Detail=========");
        System.out.println("Name : "+super.getName());
        System.out.println("ID : "+super.getID());
        System.out.println("Department : "+this.department);
        System.out.println("Salary : "+super.getSalary());
    }
}
