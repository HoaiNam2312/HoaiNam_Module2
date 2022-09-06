package ss2_vong_lap;

public class snt_nho_hon_100 {
    public static void main(String[] args) {
        System.out.println("Các số nguyên tố nhỏ hơn 100 là: ");
        for (int i = 0; i < 100; i++) {
            if (kiemTraSTN(i)) {
                System.out.print(i + "\t");
            }
        }
    }

    public static boolean kiemTraSTN(int a) {
        boolean flag = true;
        if (a < 2) {
            flag = false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        return flag;
    }
}
