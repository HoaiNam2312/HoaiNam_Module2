package bai_thi.services;

import bai_thi.models.NguoiDangKy;
import bai_thi.models.OTO;
import bai_thi.models.XeTai;
import bai_thi.utils.ReadAndWrite;
import bai_thi.utils.RegexData;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Service {

    //Tạo list lưu dữ liệu
    ArrayList<NguoiDangKy> danhSachDangKy = new ArrayList<>();
    ArrayList<XeTai> xeTaiList = new ArrayList<>();
    ArrayList<OTO> otoList = new ArrayList<>();


    private Scanner sc = new Scanner(System.in);
    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private final String REXGEX_SODANGKY = "^[A-Z]\\d-\\d{4}$";
//    private final String REXGEX_TEN = "^[[A-Z]\\w+\\s[A-Z]\\w+\\s[A-Z]\\w*]+$";
    private final String REXGEX_TEN = "^[[A-Z]\\w+\\s]+$";

    public void dangKyPhuongTien(String loaiXe) throws ParseException {
        danhSachDangKy = ReadAndWrite.readFileNguoiDangKy("E:\\CODEGYM\\Module 2\\src\\bai_thi\\data\\nguoiDangKy.csv");

        if (loaiXe.equals("Tải")) {
            xeTaiList = ReadAndWrite.readFileXeTai("E:\\CODEGYM\\Module 2\\src\\bai_thi\\data\\xeTai.csv");
            System.out.println("Nhập số đăng ký:");
            String soDangKy = bai_thi.utils.RegexData.regexStr(sc.nextLine(), REXGEX_SODANGKY, "Bạn đã nhập sai định dạng!!!\nVui lòng nhập lại:");
            System.out.println("Nhập tên chủ phương tiện:");
            String tenChuPhuongTien = bai_thi.utils.RegexData.regexStr(sc.nextLine(), REXGEX_TEN, "Bạn đã nhập sai định dạng!!!\nVui lòng nhập lại:");
            System.out.println("Nhập ngày đăng ký:");
            Date ngayDangKy = df.parse(RegexData.regexAge(sc.nextLine()));
            System.out.println("Nhập mã phương tiện:");
            String maPhuongTien = sc.nextLine();
            boolean check = true;
            for (XeTai xeTai : xeTaiList) {
                if (xeTai.getMaPhuongTien().equals(maPhuongTien)) {
                    danhSachDangKy.add(new NguoiDangKy(soDangKy,tenChuPhuongTien,ngayDangKy,maPhuongTien,xeTai));
                    check = false;
                    break;
                }
            }
            while (check) {
                System.out.println("Mã phương tiện không tồn tại trong danh sách!!!\nVui lòng nhập lại mã phương tiện:");
                maPhuongTien = sc.nextLine();
                for (XeTai xeTai : xeTaiList) {
                    if (xeTai.getMaPhuongTien().equals(maPhuongTien)) {
                        danhSachDangKy.add(new NguoiDangKy(soDangKy,tenChuPhuongTien,ngayDangKy,maPhuongTien,xeTai));
                        check = false;
                        break;
                    }
                }
            }
            ReadAndWrite.writeFileNguoiDangKy(danhSachDangKy, "E:\\CODEGYM\\Module 2\\src\\bai_thi\\data\\nguoiDangKy.csv");
        }else {
            otoList = ReadAndWrite.readFileOto("E:\\CODEGYM\\Module 2\\src\\bai_thi\\data\\xeOTO.csv");
            System.out.println("Nhập số đăng ký:");
            String soDangKy = bai_thi.utils.RegexData.regexStr(sc.nextLine(), REXGEX_SODANGKY, "Bạn đã nhập sai định dạng!!!\nVui lòng nhập lại:");
            System.out.println("Nhập tên chủ phương tiện:");
            String tenChuPhuongTien = bai_thi.utils.RegexData.regexStr(sc.nextLine(), REXGEX_TEN, "Bạn đã nhập sai định dạng!!!\nVui lòng nhập lại:");
            System.out.println("Nhập ngày đăng ký:");
            Date ngayDangKy = df.parse(RegexData.regexAge(sc.nextLine()));
            System.out.println("Nhập mã phương tiện:");
            String maPhuongTien = sc.nextLine();
            boolean check = true;
            for (OTO oto : otoList) {
                if (oto.getMaPhuongTien().equals(maPhuongTien)) {
                    danhSachDangKy.add(new NguoiDangKy(soDangKy,tenChuPhuongTien,ngayDangKy,maPhuongTien,oto));
                    check = false;
                    break;
                }
            }
            while (check) {
                System.out.println("Mã phương tiện không tồn tại trong danh sách!!!\nVui lòng nhập lại mã phương tiện:");
                maPhuongTien = sc.nextLine();
                for (OTO oto : otoList) {
                    if (oto.getMaPhuongTien().equals(maPhuongTien)) {
                        danhSachDangKy.add(new NguoiDangKy(soDangKy,tenChuPhuongTien,ngayDangKy,maPhuongTien,oto));
                        check = false;
                        break;
                    }
                }
            }
            ReadAndWrite.writeFileNguoiDangKy(danhSachDangKy, "E:\\CODEGYM\\Module 2\\src\\bai_thi\\data\\nguoiDangKy.csv");
        }

    }

    public void hienThiThongTin() {
        danhSachDangKy = ReadAndWrite.readFileNguoiDangKy("E:\\CODEGYM\\Module 2\\src\\bai_thi\\data\\nguoiDangKy.csv");
        for (NguoiDangKy nguoiDangKy : danhSachDangKy) {
            if (nguoiDangKy.getXeTai() != null) {
                System.out.println(nguoiDangKy.toStringXeTai());
            } else {
                System.out.println(nguoiDangKy.toStringOto());
            }
        }
    }

    public void huyDangKy() {
        danhSachDangKy = ReadAndWrite.readFileNguoiDangKy("E:\\CODEGYM\\Module 2\\src\\bai_thi\\data\\nguoiDangKy.csv");
        System.out.println("Nhập số đăng ký bạn muốn xóa: ");
        String soDangKy = bai_thi.utils.RegexData.regexStr(sc.nextLine(), REXGEX_SODANGKY, "Bạn đã nhập sai định dạng!!!\nVui lòng nhập lại:");
        boolean flag = false;
        for (NguoiDangKy nguoiDangKy : danhSachDangKy) {
            if (soDangKy.equals(nguoiDangKy.getSoDangKy())) {
                System.out.println("Bạn có muốn xóa giấy đăng ký có số đăng ký là " + soDangKy + " không?");
                System.out.println("1: YES.");
                System.out.println("2: NO.");
                int checkDel = Integer.parseInt(sc.nextLine());
                switch (checkDel) {
                    case 1:
                        danhSachDangKy.remove(nguoiDangKy);
                        ReadAndWrite.writeFileNguoiDangKy(danhSachDangKy, "E:\\CODEGYM\\Module 2\\src\\bai_thi\\data\\nguoiDangKy.csv");
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
            System.out.println("Không tồn tại số đăng ký "+ soDangKy+ " này trong danh sách!!!" );
        }
        hienThiThongTin();
    }
}
