package lap1;

import java.util.Scanner;

public class TestCalculator {

    public static void main(String[] args) {
        try {
            HourlyEmployee obj1;
            SalariedEmployee obj2;
            CommissionedEmployee obj3;
            Scanner sc = new Scanner(System.in);
            System.out.println("-----------------------");
            System.out.print("ชื่อ : ");
            String name = sc.nextLine();
            System.out.print("รหัสพนักงาน (integer) : ");
            int id_number = sc.nextInt();
            obj1 = new HourlyEmployee(name, id_number);
            System.out.println("-----------------------");
            System.out.print("จำนวนชั่วโมงที่ทำงาน (ต่อเดือน) : ");
            int hourly_worked = sc.nextInt();
            System.out.print("ราคาต่อชั่วโมง : ");
            int hourly_rate = sc.nextInt();
            System.out.print("ค่าคอมมิชชั่น (%) : ");
            double commitsion_rate = sc.nextDouble();
            System.out.print("ยอดขาย : ");
            double sales = sc.nextDouble();
            obj1.setHourly_rate(hourly_rate);
            obj1.setHourly_worked(hourly_worked);
            double salaryMonth = obj1.calculatePay();
            obj2 = new SalariedEmployee(salaryMonth);
            double salaryYear = obj2.calculatePay();
            System.out.println("เงินเดือน : " + salaryMonth);
            System.out.println("เงินรายปี : " + salaryYear);

            obj3 = new CommissionedEmployee(salaryYear, commitsion_rate, sales);
            double salaryTotal = obj3.calculatePay();
            System.out.println("========== สรุป =========");
            System.out.println("ชื่อ : " + obj1.getName());
            System.out.println("รหัสพนักงาน : " + obj1.getId_number());
            System.out.println("เงินรายเดือน : " + salaryMonth);
            System.out.println("เงินรายปี : " + salaryYear);
            System.out.println("ค่าคอมมิชชั่น : " + (salaryTotal - salaryYear));
            System.out.println("เงินรายปีสุทธิรวมค่าคอมมิชชั่น : " + salaryTotal);
            sc.close();
        } catch (Exception e) {
            System.out.println("เกิดข้อผิดพลาด : " + e);

        }

    }
}
