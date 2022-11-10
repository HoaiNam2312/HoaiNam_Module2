package ss6_ke_thua.Thuc_hanh;

public class Main {
    public static void main(String[] args) {
        //kiểm tra class: Shape
//        Shape shape = new Shape();
//        System.out.println(shape.toString());
//
//        shape = new Shape("red", false);
//        System.out.println(shape.toString());

        //Kiểm tra class: Circle
        NhanVien nv1 = new NhanVienFullTime();
        NhanVienFullTime nv2 = new NhanVienFullTime();

        nv1.setTen("Tùng");
        nv2.setTen("An");
        System.out.println(nv1.inTen());
        System.out.println(nv2.inTen());
//        nv1 = new NhanVienFullTime();
        nv2 = (NhanVienFullTime) nv1;
        System.out.println(nv1.inTen());
        System.out.println(nv2.inTen());
        nv1.setTen("Kutin");
        System.out.println(nv1.inTen());
        System.out.println(nv2.inTen());
    }
}
