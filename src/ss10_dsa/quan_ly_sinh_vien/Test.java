package ss10_dsa.quan_ly_sinh_vien;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;
        DanhSachSinhVien dssv = new DanhSachSinhVien();

        do {
            System.out.println("MENU ---------- ");
            System.out.println(
                    "1.	Thêm sinh viên vào danh sách.\n"
                            + "2.	In danh sách sinh viên ra màn hình.\n"
                            + "3.	Kiểm tra danh sách có rỗng hay không.\n"
                            + "4.	Lấy ra số lượng sinh viên trong danh sách.\n"
                            + "5.	Làm rỗng danh sách sinh viên.\n"
                            + "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
                            + "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
                            + "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
                            + "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n"
                            + "0.   Thoát khỏi chương trình");
            System.out.println("Vui lòng chọn chức năng: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                case 1:
                    System.out.println("Nhập mã sinh viên: ");
                    String msv = sc.nextLine();
                    System.out.println("Nhập họ và tên: ");
                    String hvt = sc.nextLine();
                    System.out.println("Nhập năm sinh: ");
                    int namSinh = sc.nextInt();
                    System.out.println("Nhập điểm trung bình: ");
                    float diemTrungBinh = sc.nextFloat();
                    SinhVien sinhVien = new SinhVien(msv, hvt, namSinh, diemTrungBinh);
                    dssv.themSinhVien(sinhVien);
                    System.out.println();
                    break;
                case 2:
                    dssv.inDanhSachSinhVien();
            }

        } while (luaChon != 0);
    }
}
