package bai_thi_2.services;

import bai_thi.utils.ReadAndWrite;
import bai_thi_2.models.ChinhHang;
import bai_thi_2.models.XachTay;
import bai_thi_2.utils.ReadAndWrite2;
import bai_thi_2.utils.RegexData2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class DichVu {
    //Gán địa chỉ file csv
    private String URL = "";
    private String URL2 = "";

    //Khai báo danh sách
    private ArrayList<ChinhHang> chinhHangList = new ArrayList<>();
    private ArrayList<XachTay> xachTayList = new ArrayList<>();


    //Hỗ trợ
    private Scanner sc = new Scanner(System.in);
    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");


    //Validate cho thông tin
    private final String REXGEX_GIABAN = "^\\d+$";
    private final String REXGEX_SOLUONG = "^\\d+$";
    private final String REXGEX_THOIGIANBAOHANH = "^([7]([1,2][0-9]|[3][0]))|([0-6]\\d{2})";
    private final String REXGEX_PHAMVI = "^([T][o][a][n]\\s[Q][u][o][c])|([Q][u][o][c]\\s[T][e])$";
    private final String REXGEX_QUOCGIA = "^([V][i][e][t]\\s[N][a][m])";
    private final String REXGEX_TRANGTHAI = "^([D][a]\\s[s][u][a]\\s[c][h][u][a])|([C][h][u][a]\\s[s][u][a]\\s[c][h][u][a]])";


    //Dịch vụ 1
    public void themMoiDienThoai(String loaiHang) throws ParseException {
        if (loaiHang.equals("Chính hãng")) {
            chinhHangList = ReadAndWrite2.readFileChinhHang("E:\\CODEGYM\\Module 2\\src\\bai_thi_2\\data\\chinhHang.csv");
            int id = chinhHangList.size() + 1;
            System.out.println("Nhập tên điện thoại:");
            String tenDienThoai = sc.nextLine();
            System.out.println("Nhập giá bán:");
            int giaBan = Integer.parseInt(RegexData2.regexStr2(sc.nextLine(), REXGEX_GIABAN, "Chỉ nhập số dương!!!\nVui lòng nhập lại:"));
            System.out.println("Nhập số lượng:");
            int soLuong = Integer.parseInt(RegexData2.regexStr2(sc.nextLine(), REXGEX_SOLUONG, "Chỉ nhập số dương!!!\nVui lòng nhập lại:"));
            System.out.println("Nhập nhà sản xuất:");
            String nhaSanXuat = sc.nextLine();
            System.out.println("Nhập thời gian bảo hành:");
            int thoiGianBaoHanh = Integer.parseInt(RegexData2.regexStr2(sc.nextLine(), REXGEX_THOIGIANBAOHANH, "Thời gian bảo hành tối đa 2 năm (730 ngày)!!!\nVui lòng nhập lại:"));
            System.out.println("Nhập phạm vi bảo hành:");
            String phamViBaoHanh = RegexData2.regexStr2(sc.nextLine(), REXGEX_PHAMVI, "Phạm vi bảo hành chỉ có quốc tế và toàn quốc!!!\nVui lòng nhập lại:");
            chinhHangList.add(new ChinhHang(id, tenDienThoai, giaBan, soLuong, nhaSanXuat, thoiGianBaoHanh, phamViBaoHanh));
            ReadAndWrite.writeFileChinhHang(chinhHangList, "E:\\CODEGYM\\Module 2\\src\\bai_thi_2\\data\\chinhHang.csv");

        } else {
            xachTayList = ReadAndWrite2.readFileXachTay("E:\\CODEGYM\\Module 2\\src\\bai_thi_2\\data\\xachTay.csv");
            int id = xachTayList.size() + 1;
            System.out.println("Nhập tên điện thoại:");
            String tenDienThoai = sc.nextLine();
            System.out.println("Nhập giá bán:");
            int giaBan = Integer.parseInt(RegexData2.regexStr2(sc.nextLine(), REXGEX_GIABAN, "Chỉ nhập số dương!!!\nVui lòng nhập lại:"));
            System.out.println("Nhập số lượng:");
            int soLuong = Integer.parseInt(RegexData2.regexStr2(sc.nextLine(), REXGEX_SOLUONG, "Chỉ nhập số dương!!!\nVui lòng nhập lại:"));
            System.out.println("Nhập nhà sản xuất:");
            String nhaSanXuat = sc.nextLine();
            System.out.println("Nhập quốc gia xách tay:");
            String quocGiaXachTay = RegexData2.regexQuocGia(sc.nextLine(), REXGEX_QUOCGIA, "Quốc gia xách tay không phải Việt Nam!!!\nVui lòng nhập lại:");
            System.out.println("Nhập trạng thái hàng:");
            String trangThai = RegexData2.regexStr2(sc.nextLine(), REXGEX_TRANGTHAI, "Trạng thái phải Đã sữa chữa hoặc Chưa sữa chữa!!!\nVui lòng nhập lại:");
            xachTayList.add(new XachTay(id, tenDienThoai, giaBan, soLuong, nhaSanXuat, quocGiaXachTay, trangThai));
            ReadAndWrite.writeFileXachTay(xachTayList, "E:\\CODEGYM\\Module 2\\src\\bai_thi_2\\data\\xachTay.csv");
        }

    }

    public void hienThiThongTin() {
        chinhHangList = ReadAndWrite2.readFileChinhHang("E:\\CODEGYM\\Module 2\\src\\bai_thi_2\\data\\chinhHang.csv");

        xachTayList = ReadAndWrite2.readFileXachTay("E:\\CODEGYM\\Module 2\\src\\bai_thi_2\\data\\xachTay.csv");

        System.out.println("Máy chính hãng: \n");
        for (ChinhHang chinhHang : chinhHangList) {
            System.out.println(chinhHang.toString());
        }
        System.out.println("\n\nMáy xách tay: \n");
        for (XachTay xachTay : xachTayList) {
            System.out.println(xachTay.toString());
        }
        System.out.println("\n\n");
    }

    public void xoaDienThoai(String loaiHang) {
        if (loaiHang.equals("Chính hãng")) {
            System.out.println("Nhập ID điện thoại mà bạn muốn xóa: ");
            int id = Integer.parseInt(sc.nextLine());
            boolean flag = false;
            chinhHangList = ReadAndWrite2.readFileChinhHang("E:\\CODEGYM\\Module 2\\src\\bai_thi_2\\data\\chinhHang.csv");
            for (ChinhHang chinhHang : chinhHangList) {
                if (id == chinhHang.getId()) {
                    System.out.println("Bạn có muốn xóa điện thoại có ID là: " + id + " không?");
                    System.out.println("1: YES.");
                    System.out.println("2: NO.");
                    int checkDel = Integer.parseInt(sc.nextLine());
                    switch (checkDel) {
                        case 1:
                            chinhHangList.remove(chinhHang);
                            ReadAndWrite.writeFileChinhHang(chinhHangList, "E:\\CODEGYM\\Module 2\\src\\bai_thi_2\\data\\chinhHang.csv");
                            System.out.println("Đã xóa thành công");
                            break;
                        case 2:
                            System.out.println("Bạn đã không xóa");
                            break;
                    }
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Không tồn tại số ID: " + id + " này trong danh sách máy chính hãng!!!");
            } else {
                hienThiThongTin();
            }
        } else {
            System.out.println("Nhập số ID điện thoại bạn muốn xóa: ");
            int id = Integer.parseInt(sc.nextLine());
            boolean flag = false;
            xachTayList = ReadAndWrite2.readFileXachTay("E:\\CODEGYM\\Module 2\\src\\bai_thi_2\\data\\xachTay.csv");
            for (XachTay xachTay : xachTayList) {
                if (id == xachTay.getId()) {
                    System.out.println("Bạn có muốn xóa điện thoại có ID là: " + id + " không?");
                    System.out.println("1: YES.");
                    System.out.println("2: NO.");
                    int checkDel = Integer.parseInt(sc.nextLine());
                    switch (checkDel) {
                        case 1:
                            xachTayList.remove(xachTay);
                            ReadAndWrite.writeFileXachTay(xachTayList, "E:\\CODEGYM\\Module 2\\src\\bai_thi_2\\data\\xachTay.csv");
                            System.out.println("Đã xóa thành công");
                            break;
                        case 2:
                            System.out.println("Bạn đã không xóa");
                            break;
                    }
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                System.out.println("Không tồn tại số ID: " + id + " này trong danh sách máy xách tay!!!");
            } else {
                hienThiThongTin();
            }
        }
    }

    public void tiemKiem(String loai, String loaiHang) {
        if (loai.equals("ID")) {
            if (loaiHang.equals("Chính hãng")) {
                System.out.println("Nhập ID điện thoại mà bạn muốn tìm kiếm: ");
                int id = Integer.parseInt(sc.nextLine());
                boolean flag = false;
                chinhHangList = ReadAndWrite2.readFileChinhHang("E:\\CODEGYM\\Module 2\\src\\bai_thi_2\\data\\chinhHang.csv");
                for (ChinhHang chinhHang : chinhHangList) {
                    if (id == chinhHang.getId()) {
                        System.out.println(chinhHang.toString());
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("Không tồn tại số ID: " + id + " này trong danh sách máy chính hãng!!!");
                }
            } else {
                System.out.println("Nhập số ID điện thoại bạn muốn xóa: ");
                int id = Integer.parseInt(sc.nextLine());
                boolean flag = false;
                xachTayList = ReadAndWrite2.readFileXachTay("E:\\CODEGYM\\Module 2\\src\\bai_thi_2\\data\\xachTay.csv");
                for (XachTay xachTay : xachTayList) {
                    if (id == xachTay.getId()) {
                        System.out.println(xachTay.toString());
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("Không tồn tại số ID: " + id + " này trong danh sách máy xách tay!!!");
                }
            }
        }else {
            if (loaiHang.equals("Chính hãng")) {
                System.out.println("Nhập tên điện thoại mà bạn muốn tìm kiếm: ");
                String ten = sc.nextLine();
                boolean flag = false;
                chinhHangList = ReadAndWrite2.readFileChinhHang("E:\\CODEGYM\\Module 2\\src\\bai_thi_2\\data\\chinhHang.csv");
                for (ChinhHang chinhHang : chinhHangList) {
                    if (ten.equals(chinhHang.getTenDienThoai())) {
                        System.out.println(chinhHang.toString());
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("Không tồn tại tên: " + ten + " này trong danh sách máy chính hãng!!!");
                }
            } else {
                System.out.println("Nhập tên điện thoại bạn muốn xóa: ");
                String ten = sc.nextLine();
                boolean flag = false;
                xachTayList = ReadAndWrite2.readFileXachTay("E:\\CODEGYM\\Module 2\\src\\bai_thi_2\\data\\xachTay.csv");
                for (XachTay xachTay : xachTayList) {
                    if (ten.equals(xachTay.getTenDienThoai())) {
                        System.out.println(xachTay.toString());
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    System.out.println("Không tồn tại tên :  " + ten + " này trong danh sách máy xách tay!!!");
                }
            }
        }
    }
}
