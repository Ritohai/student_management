package view;

import java.util.Scanner;

public class ClassesManagement {
    public ClassesManagement() {
        while (true) {
            UserManagement.menuClasses();
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    System.out.println("1. Thêm lớp học mới.");
                    break;
                case 2:
                    System.out.println("2. Danh sách lớp học.");
                    break;
                case 3:
                    System.out.println("3. Sửa lớp học.");
                    break;
                case 4:
                    System.out.println("4. Xóa lớp học.");
                    break;
                case 5:
                    new AdminManegement();
                    break;
                default:
                    System.out.println("Nhập đúng lựa chọn.");
            }
        }

    }

}
