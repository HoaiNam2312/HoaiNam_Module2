package ss6_ke_thua.Tu_hoc_TITV.Ke_thua_abstraction;

public class MayBay extends PhuongTienDiChuyen{
    private String loaiNhienLieu;

    public MayBay(HangSanXuat hangSanXuat, String loaiNhienLieu) {
        super("Máy bay", hangSanXuat);
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public String getLoaiNhienLieu() {
        return loaiNhienLieu;
    }

    public void setLoaiNhienLieu(String loaiNhienLieu) {
        this.loaiNhienLieu = loaiNhienLieu;
    }

    public void catCanh() {
        System.out.println("Lên ...");
    }

    public void haCanh() {
        System.out.println("Xuống ...");
    }
    @Override
    public double layVanToc() {
        return 500;
    }
}
