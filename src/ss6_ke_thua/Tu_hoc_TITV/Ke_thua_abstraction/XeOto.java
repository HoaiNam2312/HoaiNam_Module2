package ss6_ke_thua.Tu_hoc_TITV.Ke_thua_abstraction;

public class XeOto extends PhuongTienDiChuyen {
    private String loaiNhienLieu;

    public XeOto(HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("Ô tô", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    @Override
    public double layVanToc() {
        return 120;
    }
}
