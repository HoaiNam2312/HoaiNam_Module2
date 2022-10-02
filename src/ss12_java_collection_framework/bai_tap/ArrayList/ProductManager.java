package ss12_java_collection_framework.bai_tap.ArrayList;

import java.util.ArrayList;

public class ProductManager {
    private ArrayList<Product> productManager;

    public ProductManager() {
        productManager = new ArrayList<>();
    }

    public ProductManager(ArrayList<Product> productManager) {
        this.productManager = productManager;
    }

    public void themSanPham(Product product) {
        productManager.add(product);
    }

    public void suaThongTinSanPham(Product sanPhamThayThe, String id) {
        boolean idCoTonTai = false;
        for (int i = 0; i < productManager.size(); i++) {
            if (id.equals(productManager.get(i).getId())) {
                productManager.set(i, sanPhamThayThe);
                idCoTonTai = true;
            }
        }
        if (!idCoTonTai) {
            System.out.println("ID sản phẩm không tồn tại. Vui lòng nhập lại!");
        }
    }

    public void hienThiDanhSach() {
        System.out.println("Danh sách sản phẩm: ");
        for (int i = 0; i < productManager.size(); i++) {
            System.out.println("STT: "+(i+1)+" - ID:"+productManager.get(i).getId()+" - Name:"+productManager.get(i).getName()+" - Price:"+productManager.get(i).getPrice());
            System.out.println();
        }
    }

    public void xoaSanPham(String id) {
        boolean idCoTonTai = false;
        for (int i = 0; i < productManager.size(); i++) {
            if (id.equals(productManager.get(i).getId())) {
                productManager.remove(i);
                idCoTonTai = true;
            }
        }
        if (!idCoTonTai) {
            System.out.println("ID sản phẩm không tồn tại. Vui lòng nhập lại!");
        }
    }

    public void timKiemSanPhamTheoTen(String name) {
        boolean nameCoTonTai = false;
        for (int i = 0; i < productManager.size(); i++) {
            if (name.equals(productManager.get(i).getName())) {
                System.out.println("Sản phẩm bạn đang tìm kiếm là: ");
                System.out.println("STT: "+(i+1)+" - ID:"+productManager.get(i).getId()+" - Name:"+productManager.get(i).getName()+" - Price:"+productManager.get(i).getPrice());
                System.out.println();
                nameCoTonTai = true;
            }
        }
        if (!nameCoTonTai) {
            System.out.println("Name sản phẩm không tồn tại. Vui lòng chọn và nhập lại!");
        }
    }

    public void sapXepGiaTangDan() {
        productManager.sort(((o1, o2) -> (int) (o1.getPrice()-o2.getPrice())));
    }
    public void sapXepGiaGiamDan() {
        productManager.sort(((o1, o2) -> (int) (o2.getPrice()-o1.getPrice())));
    }

}
