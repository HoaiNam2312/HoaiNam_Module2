package ss17_binaryFile_serialization.thuc_hanh;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class DanhSachSinhVien {
    private ArrayList<SinhVien>  danhSach;

    public DanhSachSinhVien() {
        this.danhSach = new ArrayList<SinhVien>();
    }

    public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
        this.danhSach = danhSach;
    }

    public void themSinhVien(SinhVien sinhVien) {
        danhSach.add(sinhVien);
    }

    public void inDanhSachSinhVien() {
        for (int i = 0; i < danhSach.size(); i++) {
            System.out.println(danhSach.get(i));
        }
    }

    // Lưu ra file đối dnah sách sinh
   

}
