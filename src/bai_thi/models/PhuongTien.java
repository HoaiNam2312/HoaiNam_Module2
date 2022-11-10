package bai_thi.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class PhuongTien {
    private String maPhuongTien;
    private String tenPhuongTien;
    private String hangSanXuat;
    private Date namSanXuat;
    private int congSuat;
    private int dungTichXyLanh;

    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    public PhuongTien(String maPhuongTien, String tenPhuongTien, String hangSanXuat, Date namSanXuat, int congSuat, int dungTichXyLanh) {
        this.maPhuongTien = maPhuongTien;
        this.tenPhuongTien = tenPhuongTien;
        this.hangSanXuat = hangSanXuat;
        this.namSanXuat = namSanXuat;
        this.congSuat = congSuat;
        this.dungTichXyLanh = dungTichXyLanh;
    }

    public PhuongTien() {
    }



    public String getMaPhuongTien() {
        return maPhuongTien;
    }

    public void setMaPhuongTien(String maPhuongTien) {
        this.maPhuongTien = maPhuongTien;
    }

    public String getTenPhuongTien() {
        return tenPhuongTien;
    }

    public void setTenPhuongTien(String tenPhuongTien) {
        this.tenPhuongTien = tenPhuongTien;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public Date getNamSanXuat() {
        return namSanXuat;
    }

    public void setNamSanXuat(Date namSanXuat) {
        this.namSanXuat = namSanXuat;
    }

    public int getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(int congSuat) {
        this.congSuat = congSuat;
    }

    public int getDungTichXyLanh() {
        return dungTichXyLanh;
    }

    public void setDungTichXyLanh(int dungTichXyLanh) {
        this.dungTichXyLanh = dungTichXyLanh;
    }

    public abstract String getInfo();

    public String getFile() {
        return tenPhuongTien + "," + hangSanXuat + "," + df.format(namSanXuat)+","+congSuat+","+dungTichXyLanh;
    }

    @Override
    public String toString() {
        return
                ", maPhuongTien='" + maPhuongTien + '\'' +
                ", tenPhuongTien='" + tenPhuongTien + '\'' +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", namSanXuat=" + df.format(namSanXuat) +
                ", congSuat=" + congSuat +
                ", dungTichXyLanh=" + dungTichXyLanh;
    }
}
