package ss17_binaryFile_serialization.bai_tap.object_file_object;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> danhSachSanPham = new ArrayList<>();
        danhSachSanPham.add(new Product("LVHN01", "AE43-00", "43", 200, "Đen"));
        danhSachSanPham.add(new Product("LVHN02", "AE43-01", "43", 300, "Trắng"));
        danhSachSanPham.add(new Product("LVHN03", "AE43-02", "43", 400, "Đen"));
        danhSachSanPham.add(new Product("LVHN04", "AE43-03", "43", 500, "Trắng"));

        writeToFile(danhSachSanPham,"E:\\CODEGYM\\Module 2\\src\\ss17_binaryFile_serialization\\bai_tap\\object_file_object\\object.txt");
        List<Product> products = readFromFile("E:\\CODEGYM\\Module 2\\src\\ss17_binaryFile_serialization\\bai_tap\\object_file_object\\object.txt");
        products.forEach(System.out::println);
    }

    public static void writeToFile(List<Product> products, String addressFile) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(addressFile))) {
            oos.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readFromFile(String addressFile) {
        List<Product> products = null;
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(addressFile))) {
            products = (List<Product>) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return products;
    }
}
