package view;

import java.util.Scanner;

public class StudentManagement {
    public StudentManagement() {
        while (true) {
            UserManagement.menuStudent();
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Thêm sinh viên mới.");
                    break;
                case 2:
                    System.out.println("2. Hiển thị danh sách sinh viên.");
                    break;
                case 3:
                    System.out.println("3. Sửa sinh viên");
                    break;
                case 4:
                    System.out.println("4. Xóa sinh viên.");
                    break;
                case 5:
                    new AdminManegement();
                    break;
                default:
                    System.err.println("Nhập đúng lựa chọn.");
            }
        }
    }
}
