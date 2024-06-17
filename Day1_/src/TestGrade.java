import java.util.*;;
public class TestGrade {
    public static void main(String[] args){
        try {
            String id = "";
            String name = "";
            int count = 0;
            Scanner input = new Scanner(System.in);
            Student obj1 = new Student();
            System.out.println("--------------------");
            System.out.print("รหัส : ");
            id = input.nextLine();
            System.out.print("Name : ");
            name = input.nextLine();
            obj1.setId(id);
            obj1.setName(name);
            System.out.print("จำนวนวิชาที่ต้องการคำนวน : ");
            count = input.nextInt();
            int[] data = new int[count];
            for (int i = 0 ; i < count ; i++){
                System.out.print("วิชาที่ ["+(i+1)+"] :");
                data[i] = input.nextInt();
            }
            obj1.setData(data);
            obj1.grade();
            obj1.displayDetail();
            input.close();
        } catch (Exception e) {
            System.err.println(e);
            System.out.println("เกิดข้อผิดพลาด");
        }
    }   
}