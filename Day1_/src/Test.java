import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        String name = "", id = "";
        int THAI = 0, ENG = 0, OOP = 0, MATH = 0, SCI = 0;

        Scanner input = new Scanner(System.in);
        Studentt obj = new Studentt();
        System.out.println("===============");
        System.out.print("Name : ");
        name = input.nextLine();
        System.out.print("ID : ");
        id = input.nextLine();
        System.out.print("THAI : ");
        THAI = input.nextInt();
        System.out.print("ENG : ");
        ENG = input.nextInt();
        System.out.print("OOP : ");
        OOP = input.nextInt();
        System.out.print("MATH : ");
        MATH = input.nextInt();
        System.out.print("SCI : ");
        SCI = input.nextInt();
        obj.setENG(ENG);
        obj.setMATH(MATH);
        obj.setOOP(OOP);
        obj.setSCI(SCI);
        obj.setTHAI(THAI);
        obj.Avg();
        obj.Display();

    }
}
