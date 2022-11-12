package bai_thi_2.models;

public class XachTay extends DienThoaiDiDong {

    private String quocGiaXachTay;
    private String trangThai;

    public XachTay(int id, String tenDienThoai, int giaBan, int soLuong, String nhaSanXuat, String quocGiaXachTay, String trangThai) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.quocGiaXachTay = quocGiaXachTay;
        this.trangThai = trangThai;
    }

    public XachTay() {
    }

    public String getQuocGiaXachTay() {
        return quocGiaXachTay;
    }

    public void setQuocGiaXachTay(String quocGiaXachTay) {
        this.quocGiaXachTay = quocGiaXachTay;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String getInfo() {
        return getFile()+","+quocGiaXachTay+","+trangThai;
    }

    @Override
    public String toString() {
        return "XachTay{" +super.toString()+
                ", quocGiaXachTay='" + quocGiaXachTay + '\'' +
                ", trangThai='" + trangThai + '\'' +
                '}';
    }
}
