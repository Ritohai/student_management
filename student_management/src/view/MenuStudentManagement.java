package view;

import java.util.Scanner;

public class MenuStudentManagement {
    public MenuStudentManagement() {
        while (true) {
            UserManagement.menuUser();
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Hồ sơ sinh viên.");
                    break;
                case 2:
                    System.out.println("Đăng kí môn học.");
                    break;
                case 3:
                    System.out.println("Điểm môn học.");
                    break;
                case 4:
                    System.out.println("Điểm trung bình.");
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Nhập đúng lựa chọn.");

            }

        }
    }
}
