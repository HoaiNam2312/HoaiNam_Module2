package ss12_java_collection_framework.bai_tap.LinkedList;

import java.util.LinkedList;

public class ProductManager {
    private LinkedList<Product> productManager;

    public ProductManager() {
        productManager = new LinkedList<>();
    }

    public ProductManager(LinkedList<Product> productManager) {
        this.productManager = productManager;
    }

    public void themSanPham(Product product) {
        productManager.addLast(product);
    }

    public void suaThongTinSanPham(Product sanPhamThayThe, int index) {
        productManager.set(index, sanPhamThayThe);
    }

    public void hienThiDanhSach() {
        System.out.println("Danh sách sản phẩm: ");
        for (int i = 0; i < productManager.size(); i++) {
            System.out.println("STT: " + (i + 1) + " - ID:" + productManager.get(i).getId() + " - Name:" + productManager.get(i).getName() + " - Price:" + productManager.get(i).getPrice());
            System.out.println();
        }
    }

    public void xoaSanPham(int index) {
        productManager.remove(index);
    }

    public void timKiemSanPhamTheoTen(int index) {
        System.out.println("Sản phẩm bạn đang tìm kiếm là: ");
        System.out.println("STT: " + (index + 1) + " - ID:" + productManager.get(index).getId() + " - Name:" + productManager.get(index).getName() + " - Price:" + productManager.get(index).getPrice());
    }

    public void sapXepGiaTangDan() {
        productManager.sort(((o1, o2) -> (int) (o1.getPrice() - o2.getPrice())));
    }

    public void sapXepGiaGiamDan() {
        productManager.sort(((o1, o2) -> (int) (o2.getPrice() - o1.getPrice())));
    }

    public int kiemTraId(String id) {
        for (int i = 0; i < productManager.size(); i++) {
            if (id.equals(productManager.get(i).getId())) {
                return i;
            }
        }
        return -1;
    }

    public int kiemTraName(String name) {
        for (int i = 0; i < productManager.size(); i++) {
            if (name.equals(productManager.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }
}
