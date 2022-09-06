package ss2_vong_lap;

public class hien_thi_20_snt {
    public static void main(String[] args) {
        System.out.println("20 số nguyên tố đầu tiên là:");
        int num = 0;
        int count = 0;
        while (count < 20) {
            if (kiemTraSTN(num)) {
                count++;
                System.out.print(num + "\t");
            }
            num++;
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
