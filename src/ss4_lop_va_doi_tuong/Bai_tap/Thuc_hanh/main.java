package ss4_lop_va_doi_tuong.Bai_tap.Thuc_hanh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        double dai = sc.nextDouble();
        System.out.print("\nNhập chiều rộng của hình chữ nhật: ");
        double rong = sc.nextDouble();
        Rectangle hinhChuNhat = new Rectangle(rong,dai);
        System.out.print("\nHình chữ nhật có: "+hinhChuNhat.display());
        System.out.print("\nDiện tích của hình chữ nhật = "+hinhChuNhat.getArea());
        System.out.print("\nChu vi của hình chữ nhật = "+hinhChuNhat.getPerimeter());
    }
}
