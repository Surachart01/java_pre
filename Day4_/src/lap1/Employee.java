package lap1;

public abstract class Employee {
    private String name ; 
    private int id_number;

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId_number() {
        return this.id_number;
    }
    public void setId_number(int id_number) {
        this.id_number = id_number;
    }

    public abstract double calculatePay();

    
}
