package bai_thi.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NguoiDangKy {
    private String soDangKy;
    private String tenChuPhuongTien;
    private Date ngayDangKy;
    private String maPhuongTien;

    private XeTai xeTai;
    private OTO oto;

    private SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

    public NguoiDangKy() {
    }

    public NguoiDangKy(String soDangKy, String tenChuPhuongTien, Date ngayDangKy, String maPhuongTien, XeTai xeTai) {
        this.soDangKy = soDangKy;
        this.tenChuPhuongTien = tenChuPhuongTien;
        this.ngayDangKy = ngayDangKy;
        this.maPhuongTien = maPhuongTien;
        this.xeTai = xeTai;
    }

    public NguoiDangKy(String soDangKy, String tenChuPhuongTien, Date ngayDangKy, String maPhuongTien, OTO oto) {
        this.soDangKy = soDangKy;
        this.tenChuPhuongTien = tenChuPhuongTien;
        this.ngayDangKy = ngayDangKy;
        this.maPhuongTien = maPhuongTien;
        this.oto = oto;
        this.df = df;
    }

    public String getSoDangKy() {
        return soDangKy;
    }

    public void setSoDangKy(String soDangKy) {
        this.soDangKy = soDangKy;
    }

    public String getTenChuPhuongTien() {
        return tenChuPhuongTien;
    }

    public void setTenChuPhuongTien(String tenChuPhuongTien) {
        this.tenChuPhuongTien = tenChuPhuongTien;
    }

    public Date getNgayDangKy() {
        return ngayDangKy;
    }

    public void setNgayDangKy(Date ngayDangKy) {
        this.ngayDangKy = ngayDangKy;
    }

    public String getMaPhuongTien() {
        return maPhuongTien;
    }

    public void setMaPhuongTien(String maPhuongTien) {
        this.maPhuongTien = maPhuongTien;
    }

    public XeTai getXeTai() {
        return xeTai;
    }

    public void setXeTai(XeTai xeTai) {
        this.xeTai = xeTai;
    }

    public OTO getOto() {
        return oto;
    }

    public void setOto(OTO oto) {
        this.oto = oto;
    }

    public String getInfoOto() {
        return soDangKy + "," + tenChuPhuongTien + "," + df.format(ngayDangKy) + "," +maPhuongTien+","+ oto.getInfo();
    }
    public String getInfoXeTai() {
        return soDangKy + "," + tenChuPhuongTien + "," + df.format(ngayDangKy) + "," +maPhuongTien+","+ xeTai.getInfo();
    }


    public String toStringOto() {
        return "NguoiDangKy{" +
                "soDangKy='" + soDangKy + '\'' +
                ", tenChuPhuongTien='" + tenChuPhuongTien + '\'' +
                ", ngayDangKy=" + df.format(ngayDangKy) +
                 oto +
                '}';
    }
    public String toStringXeTai() {
        return "NguoiDangKy{" +
                "soDangKy='" + soDangKy + '\'' +
                ", tenChuPhuongTien='" + tenChuPhuongTien + '\'' +
                ", ngayDangKy=" + df.format(ngayDangKy) +
                xeTai +
                '}';
    }

}
