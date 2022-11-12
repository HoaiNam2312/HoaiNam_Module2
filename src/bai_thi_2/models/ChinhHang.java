package bai_thi_2.models;

public class ChinhHang extends DienThoaiDiDong {

    private int thoiGianBaoHanh;
    private String phamViBaoHanh;

    public ChinhHang(int id, String tenDienThoai, int giaBan, int soLuong, String nhaSanXuat, int thoiGianBaoHanh, String phamViBaoHanh) {
        super(id, tenDienThoai, giaBan, soLuong, nhaSanXuat);
        this.thoiGianBaoHanh = thoiGianBaoHanh;
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public int getThoiGianBaoHanh() {
        return thoiGianBaoHanh;
    }

    public void setThoiGianBaoHanh(int thoiGianBaoHanh) {
        this.thoiGianBaoHanh = thoiGianBaoHanh;
    }

    public String getPhamViBaoHanh() {
        return phamViBaoHanh;
    }

    public void setPhamViBaoHanh(String phamViBaoHanh) {
        this.phamViBaoHanh = phamViBaoHanh;
    }

    public ChinhHang() {
    }

    @Override
    public String getInfo() {
        return getFile()+","+thoiGianBaoHanh+","+phamViBaoHanh;
    }

    @Override
    public String toString() {
        return "ChinhHang{" + super.toString()+
                ", thoiGianBaoHanh=" + thoiGianBaoHanh +
                ", phamViBaoHanh='" + phamViBaoHanh + '\'' +
                '}';
    }
}
