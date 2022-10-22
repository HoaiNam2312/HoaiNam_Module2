package ss17_binaryFile_serialization.bai_tap.text_file_object;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("LVHN01","Iphone12","Apple",200,"Đen"));
        productList.add(new Product("LVHN02","Iphone13","Apple",300,"Đỏ"));
        productList.add(new Product("LVHN03","Iphone14","Apple",400,"Vàng"));
        productList.add(new Product("LVHN04","Iphone15","Apple",500,"Cam"));
        productList.add(new Product("LVHN05","Iphone16","Apple",600,"Tím"));

        FileUtils.writeFile(productList,"E:\\CODEGYM\\Module 2\\src\\ss17_binaryFile_serialization\\bai_tap\\text_file_object\\Product.csv");

        List<Product> products = FileUtils.readFile("E:\\CODEGYM\\Module 2\\src\\ss17_binaryFile_serialization\\bai_tap\\text_file_object\\Product.csv");
        products.forEach(System.out::println);
    }


}
