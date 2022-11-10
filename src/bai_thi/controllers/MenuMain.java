package bai_thi.controllers;

import bai_thi.services.Service;

import java.text.ParseException;
import java.util.Scanner;

public class MenuMain {
    private static Scanner sc = new Scanner(System.in);

    // Thêm đối tượng quản lý vào
    private static Service service = new Service();

    public static void displayMainMenu() throws ParseException {
        boolean check = true;

        while (check) {
            System.out.println("------MENU------\n");

            System.out.println("1. Đăng ký phương tiện ");
            System.out.println("2. Xem danh sách đăng ký phương tiện");
            System.out.println("3. Hủy đăng ký phương tiện ");
            System.out.println("4. Thoát ");

            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng!!!\nVui lòng chỉ nhập số từ 1 đến 7 :");
            }

            switch (choice) {
                case 1:
                    dangKyPhuongTien();
                    break;
                case 2:
                        service.hienThiThongTin();
                    break;
                case 3:
                        service.huyDangKy();
                    break;
                case 4:
                    System.out.println("Cảm ơn bạn đã sử dụng hệ thống!");
                    check = false;
                    break;
            }
        }
    }

    public static void dangKyPhuongTien() throws ParseException {
        boolean check = true;
        while (check) {
            System.out.println("------Đăng ký phương tiện------\n");
            System.out.println("1. Xe tải ");
            System.out.println("2. Xe ô tô ");
            System.out.println("3. Quay lại Menu chính");
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng!!!\nVui lòng chỉ nhập số từ 1 đến 3:");
            }
            switch (choice) {
                case 1:
                    service.dangKyPhuongTien("Tải");
                    break;
                case 2:
                    service.dangKyPhuongTien("Ô Tô");
                    break;
                case 3:
                    check = false;
                    break;
            }
        }
    }
}
