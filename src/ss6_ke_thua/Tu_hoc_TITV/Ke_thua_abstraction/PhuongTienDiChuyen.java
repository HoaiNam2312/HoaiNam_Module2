package ss6_ke_thua.Tu_hoc_TITV.Ke_thua_abstraction;

public abstract class PhuongTienDiChuyen {
    protected String tenLoaiPhuongTien;
    protected HangSanXuat hangSanXuat;

    public PhuongTienDiChuyen(String tenLoaiPhuongTien, HangSanXuat hangSanXuat) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien ;
        this.hangSanXuat = hangSanXuat;
    }

    public String getTenLoaiPhuongTien() {
        return tenLoaiPhuongTien;
    }

    public void setTenLoaiPhuongTien(String tenLoaiPhuongTien) {
        this.tenLoaiPhuongTien = tenLoaiPhuongTien;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(HangSanXuat hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }


        public String getTenHangSanXuat() {
        return hangSanXuat.getTenHangSanXuat();
    }

    public void setTenHangSanXuat(String tenMuonGan) {
        hangSanXuat.setTenHangSanXuat(tenMuonGan);
    }
    public String getTenQuocGia() {
        return hangSanXuat.getTenQuocGia();
    }

    public void setTenQuocGia(String tenQuocGia) {
        hangSanXuat.setTenQuocGia(tenQuocGia);
    }
    public void batDau() {
        System.out.println("Chạy ....");
    }

    public void dungLai() {
        System.out.println("Kít ....");
    }

    public void tangToc() {
        System.out.println("Èn èn ...");
    }

    public abstract double layVanToc();
}
