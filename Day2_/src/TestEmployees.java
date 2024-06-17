public class TestEmployees {
    public static void main(String[] args){
        Manager obj1 = new Manager("Name", "67001", 300000, "CEO");
        obj1.displayDetail();
        Employee obj2 = new Employee("Surachart", "670002", 40000);
        obj2.displayDetail();
        Engineer obj3 = new Engineer("WOww", "670003", 60000, "sleep");
        obj3.displayDetail();
        Salesperson obj4 = new Salesperson("title", "670004", 70000, 100000);
        obj4.displayDetail();
    }
}
