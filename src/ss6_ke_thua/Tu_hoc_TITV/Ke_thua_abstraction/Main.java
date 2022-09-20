package ss6_ke_thua.Tu_hoc_TITV.Ke_thua_abstraction;

public class Main {
    public static void main(String[] args) {
        HangSanXuat hang1 = new HangSanXuat("Boeing","Pháp");
        HangSanXuat hang2 = new HangSanXuat("BMW","Đức");
        HangSanXuat hang3 = new HangSanXuat("VINFAST", "Việt Nam");

        MayBay mayBay1 = new MayBay(hang1, "Dầu");
        PhuongTienDiChuyen oTo1 = new XeOto(hang2, "Xăng 95");

        mayBay1.catCanh();
        mayBay1.haCanh();
        System.out.println(mayBay1.getTenLoaiPhuongTien());
        System.out.println(oTo1.getTenHangSanXuat());
        mayBay1.setTenQuocGia("Mỹ");
        System.out.println("Tên quốc gia sản xuất máy bay: "+mayBay1.getTenQuocGia());
        System.out.println("Tốc độ của máy bay: "+mayBay1.layVanToc()+" km/h");
        System.out.println("Tên hãng xe ô tô: "+oTo1.getTenHangSanXuat());
        System.out.println("Tên nước sản xuất ô tô: "+oTo1.getTenQuocGia());
        oTo1.setHangSanXuat(hang3);
        System.out.println("Tên hãng xe ô tô: "+oTo1.getTenHangSanXuat());
        System.out.println("Tên nước sản xuất ô tô: "+oTo1.getTenQuocGia());
        oTo1.setTenQuocGia("Trung Quốc");
        System.out.println("Tên nước sản xuất ô tô: "+oTo1.getTenQuocGia());
    }
}
