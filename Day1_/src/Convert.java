//Surachart Limrattanaphun
//6702041510164
import java.util.*;
public class Convert {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("------แปลง ํc เป็น ํf------");
            System.out.print( " ํc : ");
            double c = sc.nextDouble();
            sc.close();
            double result = convertCF(c);
            System.out.println("------------------------");
            System.out.println(" ํc : "+ c + " to ํf : "+result);
            System.out.println("------------------------");
        } catch (Exception e) {
            System.err.println("เกิดข้อผิดพลาดโปรดลองใหม่อีกครั้ง");
        }
    }
    public static double convertCF(double c ){
        return (c*1.8)+32;
    }
}
