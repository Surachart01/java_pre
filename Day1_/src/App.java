public class App {
    public static void main(String[] args) throws Exception {
        hello();
        ages(20);
        String Hi = Hi();
        System.out.println(Hi);
        System.out.println(Sum(5, 4));

    }
    public static void hello(){
        System.out.println("TCT34");
    }

    public static void ages(int  age){
        System.out.println("I'm "+ age);
    }

    public static String Hi(){
        return "HI";
    }

    public static int Sum(int num1 , int num2){
       return num1+num2;
    
    }

}
