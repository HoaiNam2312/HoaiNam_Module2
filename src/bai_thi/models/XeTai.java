package bai_thi.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class XeTai extends PhuongTien {
    private int trongTai;

    public XeTai(String maPhuongTien, String tenPhuongTien, String hangSanXuat, Date namSanXuat, int congSuat, int dungTichXyLanh, int trongTai) {
        super(maPhuongTien, tenPhuongTien, hangSanXuat, namSanXuat, congSuat, dungTichXyLanh);
        this.trongTai = trongTai;
    }

    public XeTai() {
    }


    public int getTrongTai() {
        return trongTai;
    }


    public void setTrongTai(int trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String getInfo() {
        return getFile()+","+trongTai;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", trongTai=" + trongTai;
    }
}
