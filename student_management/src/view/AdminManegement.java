package view;

import java.util.Scanner;

public class AdminManegement {
    public AdminManegement() {
        while (true) {
            UserManagement.menuAdmin();
            int choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 1:
                    new StudentManagement();
                    break;
                case 2:
                    MenuLoginRegister.register();
                    break;
                case 3:
                    System.out.println("3. Danh sách môn học.");
                    break;
                case 4:
                    System.out.println("4. Danh sách điểm môn học.");
                    break;
                case 5:
                    new ClassesManagement();
                    break;
                case 6:
                   MenuLoginRegister.menuLoginRegister();
                    break;
                default:
                    System.err.println("Nhập đúng lựa chọn.");
            }

        }
    }
}
