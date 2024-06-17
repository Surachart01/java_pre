public class Engineer extends Employee {
    private String specialty;

    Engineer(){
        super();
        this.specialty = "";
        
    }

    Engineer(String name , String Id , double salary ,String specialty){
        super(name,Id,salary);
        this.specialty = specialty;
    }

    public void setSpecialty(String specialty){
        this.specialty = specialty;
    }

    public String getSpecialty(){
        return this.specialty;
    }

    public void displayDetail(){
        System.out.println("=========Engineer Detail=======");
        System.out.println("Name : "+super.getName());
        System.out.println("ID : "+super.getID());
        System.out.println("Specialty : "+this.specialty);
        System.out.println("Salary : "+super.getSalary());
    }
}
