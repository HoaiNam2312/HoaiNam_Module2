package ss17_binaryFile_serialization.bai_tap.text_file_object;

public class Product {
    private String maSanPham;
    private String tenSanPham;
    private String hangSanXuat;
    private int gia;
    private String moTaKhac;

    public Product() {
    }

    public Product(String maSanPham, String tenSanPham, String hangSanXuat, int gia, String moTaKhac) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.hangSanXuat = hangSanXuat;
        this.gia = gia;
        this.moTaKhac = moTaKhac;
    }

    public Product(String line) {
        String[] data = line.split(",");
        this.maSanPham = data[0];
        this.tenSanPham = data[1];
        this.hangSanXuat = data[2];
        this.gia = Integer.parseInt(data[3]);
        this.moTaKhac = data[4];
    }
    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public String getMoTaKhac() {
        return moTaKhac;
    }

    public void setMoTaKhac(String moTaKhac) {
        this.moTaKhac = moTaKhac;
    }

    public String toString() {
        return this.maSanPham+","+this.tenSanPham+","+this.hangSanXuat+","+this.gia+","+this.moTaKhac;
    }

}
