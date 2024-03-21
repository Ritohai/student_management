package view;

import config.InputMethod;

import java.util.Scanner;

public class MenuLoginRegister {
    public static void menuLoginRegister() {
        System.out.println("Đăng kí/ Đăng nhập: " + '\n' +
                "1. Đăng kí." + '\n' +
                "2. Đăng nhâp. " + '\n' +
                "0. Thoát.");
        System.out.println("Nhập lựa chọn của bạn: ");
        int choice = new Scanner(System.in).nextInt();
        switch (choice) {
            case 1:
                System.out.println("Đăng kí.");
                break;
            case 2:
                login();
                break;
            case 0:
                System.out.println("Thoát.");
                System.exit(0);
            default:
                System.out.println("Yêu cầu lựa chọn đúng.");
        }
    }

    public static void login() {
//        System.out.println("Đăng nhập.");
//        System.out.println("Nhập tài khoản: ");
//        String userName = InputMethod.getString();
//        System.out.println("Nhập mật khẩu: ");
//        String passWord = InputMethod.getString();
        new AdminManegement();

    }

    public static void register() {
    }
}