import java.util.Scanner;

public class TestBank {
    public static void main(String[] args){
        int op ;
        double Deposit;
        double Withdraw;
        try {
            Scanner sc = new Scanner(System.in);
        BankAccount bank2 = new BankAccount("0553603668","Surachart Limrattanaphun",900);
        System.out.println("=============== Bank Account ===============");
        System.out.println("ID Account  :   "+bank2.getId());
        System.out.println("Name        :   "+bank2.getName());
        System.out.println("=================== Menu ===================");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.Check Balance");
        System.out.print("Please select your choice [ 1 - 3 ] : ");
        op = sc.nextInt();
        if (op == 1) {
            System.out.print(">> [Deposit] Please enter amount : ");
            Deposit = sc.nextInt();
            System.out.println("-----------------------------------------");
            System.out.println("====== >> Successfully executed << ======");
            System.out.println("-----------------------------------------");
            bank2.deposit(Deposit);
            System.out.println("Balance         :  "+bank2.checkBalance()+"Bath");
            System.out.println("========= >>>> Thank you <<<< =========");
        }else if(op == 2){
            System.out.print(">> [Withdraw] Please enter amount : ");
            Withdraw = sc.nextInt();
             System.out.println("-----------------------------------------");
            System.out.println("====== >> Successfully executed << ======");
            System.out.println("-----------------------------------------");
            bank2.withdraw(Withdraw);
            System.out.println("Balance         :  "+bank2.checkBalance()+"Bath");
            System.out.println("========= >>>> Thank you <<<< =========");
        }else{
            System.out.println("========== >>>> Check Balance <<<< ==========");
            System.out.println("Balance         :  "+bank2.checkBalance()+"Bath");
            
        }
        sc.close();
        } catch (Exception e) {
            System.out.println("เกิดข้อผิดพลาด");
        }
        

        
    }
}
