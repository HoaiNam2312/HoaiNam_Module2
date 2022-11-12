package bai_thi_2.controllers;

import bai_thi_2.services.DichVu;

import java.text.ParseException;
import java.util.Scanner;

public class Menu {
    private static Scanner sc = new Scanner(System.in);

    private static DichVu dichVu = new DichVu();

    public static void displayMainMenu() throws ParseException {
        boolean check = true;

        while (check) {
            System.out.println("------CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI------\n");

            System.out.println("1. Thêm mới ");
            System.out.println("2.  Xóa ");
            System.out.println("3. Xem danh sách điện thoại ");
            System.out.println("4. Tìm kiếm ");
            System.out.println("5. Thoát \n");
            System.out.println("   Chọn chức năng: ");

            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng!!!\nVui lòng chỉ nhập số từ 1 đến 4 :");
            }

            switch (choice) {
                case 1:
                    dangKyPhuongTien();
                    break;
                case 2:
                    xoa();
                    break;
                case 3:
                    dichVu.hienThiThongTin();
                    break;
                case 4:
                    tiemKiem();
                    break;

                case 5:
                    System.out.println("Cảm ơn bạn đã sử dụng hệ thống!");
                    check = false;
                    break;
            }
        }
    }

    public static void dangKyPhuongTien() throws ParseException {
        boolean check = true;
        while (check) {
            System.out.println("------Thêm mới------\n");
            System.out.println("1. Điện thoại chính hãng ");
            System.out.println("2. Điện thoại xách tay ");
            System.out.println("3. Quay lại Menu chính");
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng!!!\nVui lòng chỉ nhập số từ 1 đến 3:");
            }
            switch (choice) {
                case 1:
                    dichVu.themMoiDienThoai("Chính hãng");
                    break;
                case 2:
                    dichVu.themMoiDienThoai("Xách tay");
                    break;
                case 3:

                    check = false;
                    break;
            }
        }
    }

    public static void xoa() throws ParseException {
        boolean check = true;
        while (check) {
            System.out.println("------Xóa điện thoại------\n");
            System.out.println("1. Điện thoại chính hãng ");
            System.out.println("2. Điện thoại xách tay ");
            System.out.println("3. Quay lại Menu chính");
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng!!!\nVui lòng chỉ nhập số từ 1 đến 3:");
            }
            switch (choice) {
                case 1:
                    dichVu.xoaDienThoai("Chính hãng");
                    break;
                case 2:
                    dichVu.xoaDienThoai("Xách tay");
                    break;
                case 3:

                    check = false;
                    break;
            }
        }
    }

    public static void tiemKiem() throws ParseException {
        boolean check = true;
        while (check) {
            System.out.println("------Tìm kiếm điện thoại------\n");
            System.out.println("1. Tìm điện thoại chính hãng theo ID ");
            System.out.println("2. Tìm điện thoại xách tay theo ID ");
            System.out.println("3. Tìm điện thoại chính hãng theo tên ");
            System.out.println("4. Tìm điện thoại xách tay theo tên ");
            System.out.println("5. Quay lại Menu chính");
            int choice = 0;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dạng!!!\nVui lòng chỉ nhập số từ 1 đến 3:");
            }
            switch (choice) {
                case 1:
                    dichVu.tiemKiem("ID","Chính hãng");
                    break;
                case 2:
                    dichVu.tiemKiem("ID","Xách tay");
                    break;
                case 3:
                    dichVu.tiemKiem("Tên","Chính hãng");
                    break;
                case 4:
                    dichVu.tiemKiem("Tên","Xách tay");
                    break;
                case 5:
                    check = false;
                    break;
            }
        }
    }
}
