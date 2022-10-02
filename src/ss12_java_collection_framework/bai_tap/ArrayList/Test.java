package ss12_java_collection_framework.bai_tap.ArrayList;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProductManager quanLySanPham = new ProductManager();
        Scanner sc = new Scanner(System.in);
        int luaChon = 0;
        do {
            System.out.println();
            System.out.println("----MENU----");
            System.out.println();
            System.out.println("1.  Thêm sản phẩm\n" +
                    "2.  Sửa thông tin sản phẩm theo id\n" +
                    "3.  Xoá sản phẩm theo id\n" +
                    "4.  Hiển thị danh sách sản phẩm\n" +
                    "5.  Tìm kiếm sản phẩm theo tên\n" +
                    "6.  Sắp xếp sản phẩm giá tăng dần\n" +
                    "7.  Sắp xếp sản phẩm giá giảm dần theo giá\n" +
                    "0.  Thoát ra");
            System.out.print("Lựa chọn của bạn: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (luaChon) {
                case 1: // Thêm sản phẩm
                    System.out.println("Nhập ID của sản phẩm: ");
                    String id = sc.nextLine();
                    System.out.println("Nhập tên của sản phẩm: ");
                    String name = sc.nextLine();
                    System.out.println("Nhập giá của sản phẩm: ");
                    double price = sc.nextFloat();
                    Product sanPham = new Product(id, name, price);
                    quanLySanPham.themSanPham(sanPham);
                    break;
                case 2:
                    System.out.println("Vui lòng nhập ID sản phẩm bạn muốn sửa: ");
                    String idSuaDoi = sc.nextLine();
                    System.out.println("Nhập ID của sản phẩm: ");
                    String idNew = sc.nextLine();
                    System.out.println("Nhập tên của sản phẩm: ");
                    String nameNew = sc.nextLine();
                    System.out.println("Nhập giá của sản phẩm: ");
                    double priceNew = sc.nextInt();
                    Product sanPhamMoi = new Product(idNew, nameNew, priceNew);
                    quanLySanPham.suaThongTinSanPham(sanPhamMoi,idSuaDoi);
                    break;
                case 3:
                    System.out.println("Vui lòng nhập ID sản phẩm bạn muốn xóa: ");
                    String idXoa = sc.nextLine();
                    quanLySanPham.xoaSanPham(idXoa);
                    break;
                case 4:
                    quanLySanPham.hienThiDanhSach();
                    break;
                case 5:
                    System.out.println("Vui lòng nhập tên sản phẩm bạn muốn tìm kiếm: ");
                    String nameSearch = sc.nextLine();
                    quanLySanPham.timKiemSanPhamTheoTen(nameSearch);
                    break;
                case 6:
                    quanLySanPham.sapXepGiaTangDan();
                    break;
                case 7:
                    quanLySanPham.sapXepGiaGiamDan();
                    break;
            }
        } while (luaChon != 0);
        System.out.println("Để tiếp tục tìm kiếm vui lòng bấm F5");
    }
}
