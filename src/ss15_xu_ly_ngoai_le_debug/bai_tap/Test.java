package ss15_xu_ly_ngoai_le_debug.bai_tap;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập 3 cạnh của tam giác: ");
            int canhA = sc.nextInt();
            int canhB = sc.nextInt();
            int canhC = sc.nextInt();
            IllegalTriangleException tamgiac = new IllegalTriangleException(canhA,canhB,canhC);
        } catch (Exception e) {
            System.out.println("Lỗi");
        }
        System.out.println("bình thường");
    }
}
