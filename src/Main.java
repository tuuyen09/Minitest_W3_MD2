import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        EmployeeManager e = new EmployeeManager();
        int choice = -1;
        e.add(new FulltimeEmployee(100, 20, 1000));
        e.add(new FulltimeEmployee(100, 50, 1000));
        e.add(new FulltimeEmployee(200, 100, 1000));
        e.add(new ParttimeEmployee(3));
        e.add(new ParttimeEmployee(4));
        e.add(new ParttimeEmployee(6));
        while (choice != -0){
            System.out.println("1. Trung bình lương nhân viên cả công ty.");
            System.out.println("2. Nhân viên toàn thời gian có mức lương thấp hơn trung bình.");
            System.out.println("3. Tổng lương phải trả cho nhân viên bán thời gian.");
            System.out.println("4. Sắp xếp nhân viên toàn thời gian theo số lương tăng dần.");
            System.out.println("Nhập lựa chọn của bạn:");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println(e.average());
                case 2:
                    System.out.println(e.list());
                case 3:
                    System.out.println(e.totalPartime());
                case 4:
                    System.out.println(e.sortFulltime());
            }
        }

    }
}
