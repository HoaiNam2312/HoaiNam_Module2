package ss1_introduction_to_java;

import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        double quyDoi = 23000;
        double vnd;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số tiền USD bạn muốn đổi: ");
        double usd = sc.nextDouble();
        vnd = usd * quyDoi;
        System.out.println("Số tiền Việt là: "+ vnd +" VNĐ");
    }
}
