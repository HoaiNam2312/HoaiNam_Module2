package bai_thi.models;

import java.util.Date;

public class OTO extends PhuongTien {
    private int soChoNgoi;
    private String loaiDongCo;

    public OTO(String maPhuongTien, String tenPhuongTien, String hangSanXuat, Date namSanXuat, int congSuat, int dungTichXyLanh, int soChoNgoi, String loaiDongCo) {
        super(maPhuongTien, tenPhuongTien, hangSanXuat, namSanXuat, congSuat, dungTichXyLanh);
        this.soChoNgoi = soChoNgoi;
        this.loaiDongCo = loaiDongCo;
    }

    public OTO() {
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }


    public String getLoaiDongCo() {
        return loaiDongCo;
    }

    public void setLoaiDongCo(String loaiDongCo) {
        this.loaiDongCo = loaiDongCo;
    }

    @Override
    public String getInfo() {
        return getFile()+","+soChoNgoi+","+loaiDongCo;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", soChoNgoi=" + soChoNgoi +
                ", loaiDongCo='" + loaiDongCo + '\'';
    }
}
