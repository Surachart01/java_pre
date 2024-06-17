public class BankAccount {
    private String id;
    private String name;
    private double balance;

    BankAccount(){
        this.id = "0001";
        this.name = "test";
        this.balance = 0.0;
    }
    BankAccount(String id, String name, double balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void deposit(double amount){
       this.balance +=amount;
    }

    public double checkBalance(){
        return this.balance;
    }

    public void withdraw(double amount){
        if(this.balance>=amount){
            this.balance = this.balance-amount;
        }else{
            System.out.println("ยอดเงินของคุณไม่เพียงพอ");
        }
        
    }
}
